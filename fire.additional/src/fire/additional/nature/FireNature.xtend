package fire.additional.nature

import fire.additional.builder.FireObjectBuilder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IProjectNature
import org.eclipse.core.runtime.CoreException
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class FireNature implements IProjectNature {
	val public static String NATURE_ID = "fire.additional.nature.fireNature"
	
	IProject project
	
	override configure() throws CoreException {
		val description = project.description
		val commands = description.buildSpec
		if (!commands.exists[builderName == FireObjectBuilder.BUILDER_ID]) {
			description.buildSpec = commands + #[description.newCommand => [builderName = FireObjectBuilder.BUILDER_ID]]
			project.setDescription(description, null)
		}
	}
	
	override deconfigure() throws CoreException {
		val description = project.description
		val commands = description.buildSpec
		val newCommands = commands.filter[builderName != FireObjectBuilder.BUILDER_ID].toList
		if (commands.size != newCommands.size) {
			description.buildSpec = newCommands
			project.setDescription(description, null)
		}
	}
}