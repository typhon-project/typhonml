package it.univaq.disim.typhonml.utility;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import typhonml.TyphonmlPackage;

public class TyphonMLUtility {
	
	public static void registerTyphonMM() {
		EPackage.Registry.INSTANCE.put(TyphonmlPackage.eNS_URI, TyphonmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", TyphonmlPackage.eINSTANCE);
	}

}
