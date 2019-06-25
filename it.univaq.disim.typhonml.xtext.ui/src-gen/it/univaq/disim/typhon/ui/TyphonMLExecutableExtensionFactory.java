/*
 * generated by Xtext 2.16.0
 */
package it.univaq.disim.typhon.ui;

import com.google.inject.Injector;
import it.univaq.disim.typhonml.xtext.ui.internal.XtextActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TyphonMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(XtextActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		XtextActivator activator = XtextActivator.getInstance();
		return activator != null ? activator.getInjector(XtextActivator.IT_UNIVAQ_DISIM_TYPHON_TYPHONML) : null;
	}

}
