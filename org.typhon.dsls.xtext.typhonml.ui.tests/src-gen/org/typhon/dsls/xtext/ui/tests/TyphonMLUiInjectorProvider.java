/*
 * generated by Xtext 2.14.0
 */
package org.typhon.dsls.xtext.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.typhon.dsls.xtext.typhonml.ui.internal.TyphonmlActivator;

public class TyphonMLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TyphonmlActivator.getInstance().getInjector("org.typhon.dsls.xtext.TyphonML");
	}

}