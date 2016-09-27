package fire.additional.launch

import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Adapters
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.debug.ui.ILaunchShortcut
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.PlatformUI

class FireLaunchShortcut implements ILaunchShortcut {
	val static CONFIG_TYPE = DebugPlugin.^default.launchManager.getLaunchConfigurationType("fire.additional.launch.fireLaunchConfigurationType")
	
	override launch(IEditorPart editor, String mode) {
		launch(Adapters.adapt(editor.editorInput, IFile), mode)
	}
	
	override launch(ISelection selection, String mode) {
		launch((selection as IStructuredSelection).firstElement as IFile, mode)
	}
	
	def private static launch(IFile selectedFile, String mode) {
		val selectedPath = selectedFile.fullPath
		try {
			DebugUITools.launch(getExistingConfig(selectedPath) ?: createNewConfig(selectedPath), mode)
		} catch (CoreException e) {
			MessageDialog.openError(PlatformUI.workbench.modalDialogShellProvider.shell, "Could not launch Fire file", e.message)
		}
	}
	
	def private static getExistingConfig(IPath selectedPath) {
		DebugPlugin.^default.launchManager.getLaunchConfigurations(CONFIG_TYPE).findFirst[
			selectedPath == new Path(getAttribute(FireLaunchConfigurationDelegate.FIRE_PROGRAM, ""))
		]
	}
	
	def private static createNewConfig(IPath selectedPath) {
		val newConfig = CONFIG_TYPE.newInstance(null, selectedPath.removeFileExtension.lastSegment)
		newConfig.setAttribute(FireLaunchConfigurationDelegate.FIRE_PROGRAM, selectedPath.toString)
		newConfig.doSave
	}
}