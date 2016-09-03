package fire.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration

class FireOutputConfigurationProvider implements IOutputConfigurationProvider {
	override getOutputConfigurations() {
		#{new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT) => [
			description = "Output Folder"
			outputDirectory = "./bin"
			overrideExistingResources = true
			createOutputDirectory = true
			cleanUpDerivedResources = true
			canClearOutputDirectory = true
			setDerivedProperty = true
			keepLocalHistory = true
		]}
	}
}