/*
 * generated by Xtext 2.15.0
 */
package it.univaq.disim.typhon


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class TyphonMLStandaloneSetup extends TyphonMLStandaloneSetupGenerated {

	def static void doSetup() {
		new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
