package fire.additional.launch

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup
import org.eclipse.debug.ui.CommonTab
import org.eclipse.debug.ui.ILaunchConfigurationDialog

class FireLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {
	override createTabs(ILaunchConfigurationDialog dialog, String mode) {
		tabs = #[new FireLaunchConfigurationTab, new CommonTab]
	}
}