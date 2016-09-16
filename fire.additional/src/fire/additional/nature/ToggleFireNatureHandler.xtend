package fire.additional.nature

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IAdaptable

import static extension org.eclipse.ui.handlers.HandlerUtil.getCurrentStructuredSelection

class ToggleFireNatureHandler extends AbstractHandler {
	override execute(ExecutionEvent event) throws ExecutionException {
		val selectedProjects = event.currentStructuredSelection.toList.map[switch it {
			IProject: it
			IAdaptable: getAdapter(IProject)
		}].filterNull
		selectedProjects.forEach[project | try {
			val description = project.description
			val natures = description.natureIds
			description.natureIds = if (natures.contains(FireNature.NATURE_ID)) {
				natures.filter[it != FireNature.NATURE_ID]
			} else {
				natures + #[FireNature.NATURE_ID]
			}
			project.setDescription(description, null)
		} catch (CoreException e) {
			throw new ExecutionException(e.message, e)
		}]
		null
	}
}