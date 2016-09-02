/*
 * generated by Xtext 2.10.0
 */
package fire

import fire.generator.FireOutputConfigurationProvider
import org.eclipse.xtext.generator.IOutputConfigurationProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class FireRuntimeModule extends AbstractFireRuntimeModule {
	def Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
		FireOutputConfigurationProvider
	}
}