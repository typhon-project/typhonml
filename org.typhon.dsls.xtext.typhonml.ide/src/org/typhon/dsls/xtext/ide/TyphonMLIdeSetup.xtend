/*
 * generated by Xtext 2.12.0
 */
package org.typhon.dsls.xtext.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.typhon.dsls.xtext.TyphonMLRuntimeModule
import org.typhon.dsls.xtext.TyphonMLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TyphonMLIdeSetup extends TyphonMLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TyphonMLRuntimeModule, new TyphonMLIdeModule))
	}
	
}