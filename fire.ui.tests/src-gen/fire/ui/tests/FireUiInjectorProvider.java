/*
 * generated by Xtext 2.10.0
 */
package fire.ui.tests;

import com.google.inject.Injector;
import fire.ui.internal.FireActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class FireUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FireActivator.getInstance().getInjector("fire.Fire");
	}

}
