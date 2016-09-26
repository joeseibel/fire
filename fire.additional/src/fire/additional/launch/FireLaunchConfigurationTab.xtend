package fire.additional.launch

import fire.additional.Activator
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IStatus
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab
import org.eclipse.jface.dialogs.IDialogConstants
import org.eclipse.jface.viewers.Viewer
import org.eclipse.jface.viewers.ViewerFilter
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog
import org.eclipse.ui.model.WorkbenchContentProvider
import org.eclipse.ui.model.WorkbenchLabelProvider

package class FireLaunchConfigurationTab extends AbstractLaunchConfigurationTab {
	Text programText
	
	override createControl(Composite parent) {
		control = new Composite(parent, SWT.NONE) => [
			layout = new GridLayout(3, false)
			new Label(it, SWT.LEFT) => [
				text = "Fire Program:"
				layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false)
			]
			programText = new Text(it, SWT.LEFT.bitwiseOr(SWT.SINGLE).bitwiseOr(SWT.BORDER)) => [
				layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false)
				addModifyListener[updateLaunchConfigurationDialog]
			]
			new Button(it, SWT.PUSH) => [
				text = "Browse..."
				layoutData = new GridData(SWT.RIGHT, SWT.CENTER, false, false)
				addSelectionListener(new SelectionAdapter {
					override widgetSelected(SelectionEvent e) {
						val dialog = createSelectFireDialog
						if (dialog.open == IDialogConstants.OK_ID) {
							programText.text = (dialog.firstResult as IFile).fullPath.toString
						}
					}
				})
			]
		]
	}
	
	override getName() {
		"Main"
	}
	
	override initializeFrom(ILaunchConfiguration configuration) {
		programText.text = configuration.getAttribute(FireLaunchConfigurationDelegate.FIRE_PROGRAM, "")
	}
	
	override performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(FireLaunchConfigurationDelegate.FIRE_PROGRAM, programText.text)
	}
	
	override setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}
	
	override isValid(ILaunchConfiguration launchConfig) {
		errorMessage = null
		try {
			val file = ResourcesPlugin.workspace.root.getFile(new Path(programText.text))
			if (!file.exists) {
				errorMessage = '''"«programText.text»" does not exist'''
				false
			} else if (file.fileExtension != "fire") {
				errorMessage = '''"«programText.text»" is not a Fire file'''
				false
			} else {
				true
			}
		} catch (IllegalArgumentException e) {
			errorMessage = e.message
			false
		}
	}
	
	def private ElementTreeSelectionDialog createSelectFireDialog() {
		new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider, new WorkbenchContentProvider) => [
			title = "Select Fire Program"
			message = "Select a Fire Program"
			addFilter(new ViewerFilter {
				override select(Viewer viewer, Object parentElement, Object element) {
					switch element {
						IFile: element.fileExtension == "fire"
						IContainer: element.members.exists[select(viewer, element, it)]
						default: false
					}
				}
			})
			validator = [selection | switch selection.length {
				case 0: new Status(IStatus.ERROR, Activator.PLUGIN_ID, "A Fire file must be selected")
				case 1: if (selection.head instanceof IFile) {
					new Status(IStatus.OK, Activator.PLUGIN_ID, "")
				} else {
					new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Selection is not a Fire file")
				}
				default: new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Cannot select multiple resources")
			}]
			input = ResourcesPlugin.workspace.root
		]
	}
}