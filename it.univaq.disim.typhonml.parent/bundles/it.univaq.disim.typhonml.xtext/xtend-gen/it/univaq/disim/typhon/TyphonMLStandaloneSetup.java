/**
 * generated by Xtext 2.15.0
 */
package it.univaq.disim.typhon;

import it.univaq.disim.typhon.TyphonMLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TyphonMLStandaloneSetup extends TyphonMLStandaloneSetupGenerated {
  public static void doSetup() {
    new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}