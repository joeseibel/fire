package fire.additional.launch

import fire.additional.Activator
import java.io.IOException
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunch
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate

class FireLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {
	val package static String FIRE_PROGRAM = "FIRE_PROGRAM"
	
	override launch(ILaunchConfiguration configuration, String mode, ILaunch launch, IProgressMonitor monitor) throws CoreException {
		val programAttribute = configuration.getAttribute(FIRE_PROGRAM, "")
		if (programAttribute.empty) {
			abort("No Fire program was specified")
		} else {
			try {
				val file = ResourcesPlugin.workspace.root.getFile(new Path(programAttribute))
				if (file.fileExtension != "fire") {
					abort('''"«file.fullPath»" is not a Fire file''')
				} else if (!file.exists) {
					abort('''File "«file.fullPath»" does not exist''')
				} else {
					val binaryFile = file.project.getFile("bin/" + file.projectRelativePath.removeFileExtension.toString)
					if (!binaryFile.exists) {
						abort('''File "«binaryFile.fullPath»" does not exist''')
					} else {
						val command = binaryFile.location.toString
						try {
							DebugPlugin.newProcess(launch, new ProcessBuilder(command).start, command)
						} catch (IOException e) {
							abort('''Could not launch "«command»"''', e)
						}
					}
				}
			} catch (IllegalArgumentException e) {
				abort('''Path "«programAttribute»" is invalid''', e)
			}
		}
	}
	
	def private static void abort(String message) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, message))
	}
	
	def private static void abort(String message, Throwable exception) throws CoreException {
		throw new CoreException(new Status(IStatus.ERROR, Activator.PLUGIN_ID, message, exception))
	}
}