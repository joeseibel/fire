package fire.additional.builder

import fire.additional.Activator
import java.io.BufferedInputStream
import java.io.IOException
import java.util.Map
import java.util.Scanner
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.core.resources.IResourceStatus
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status

class FireObjectBuilder extends IncrementalProjectBuilder {
	val public static String BUILDER_ID = "fire.additional.builder.fireObjectBuilder"
	
	override protected build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {
		try {
			if (kind == FULL_BUILD) {
				val binDir = project.getFolder("bin")
				if (binDir.exists) {
					fullBuildContainer(binDir, monitor)
				}
			} else {
				getDelta(project).findMember(new Path("bin"))?.accept[delta | switch resource : delta.resource {
					IFile case resource.fullPath.fileExtension == "o": {
						switch delta.kind {
							case IResourceDelta.ADDED,
							case IResourceDelta.CHANGED: invokeClang(resource)
							case IResourceDelta.REMOVED: {
								project.getFile(resource.projectRelativePath.removeFileExtension).delete(true, monitor)
							}
						}
						false
					}
					default: true
				}]
			}
		} finally {
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor)
		}
		null
	}
	
	override protected clean(IProgressMonitor monitor) throws CoreException {
		val binDir = project.getFolder("bin")
		if (binDir.exists) {
			cleanContainer(binDir, monitor)
		}
	}
	
	def private void fullBuildContainer(IContainer container, IProgressMonitor monitor) throws CoreException {
		container.members.forEach[switch it {
			IFile case fullPath.fileExtension == "o": invokeClang(it)
			IFile case fullPath.fileExtension === null && resourceAttributes.executable: {
				if (!project.getFile(projectRelativePath.addFileExtension("o")).exists) {
					delete(true, monitor)
				}
			}
			IContainer: fullBuildContainer(it, monitor)
		}]
	}
	
	def private void cleanContainer(IContainer container, IProgressMonitor monitor) throws CoreException {
		container.members.forEach[switch it {
			IFile case fullPath.fileExtension === null && resourceAttributes.executable: delete(true, monitor)
			IContainer: cleanContainer(it, monitor)
		}]
	}
	
	def private static invokeClang(IFile file) throws CoreException {
		try {
			val command = #["clang", file.location.toOSString, "-o", file.location.removeFileExtension.toOSString]
			val clangProcess = new ProcessBuilder(command).redirectErrorStream(true).start
			while (clangProcess.alive) {
				try {
					clangProcess.waitFor
				} catch (InterruptedException e) {
				}
			}
			if (clangProcess.exitValue != 0) {
				val clangOutputScanner = new Scanner(new BufferedInputStream(clangProcess.inputStream)).useDelimiter("\\A")
				val errorMessage = clangOutputScanner.next
				clangOutputScanner.close
				val status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, IResourceStatus.BUILD_FAILED, errorMessage, null)
				throw new CoreException(status)
			}
		} catch (IOException e) {
			val status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, IResourceStatus.BUILD_FAILED, e.message, e)
			throw new CoreException(status)
		}
	}
}