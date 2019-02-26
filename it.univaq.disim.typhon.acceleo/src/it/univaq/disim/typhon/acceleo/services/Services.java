package it.univaq.disim.typhon.acceleo.services;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import it.univaq.disim.typhon.TyphonMLStandaloneSetup;
import typhonml.Model;
import typhonml.TyphonmlPackage;

public class Services {
	
	public static Model loadXtextModel(String pathToXTextModel) {
		registerTyphonMM();
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(
		    URI.createURI(pathToXTextModel), true);
		Model model = (Model) resource.getContents().get(0);
		
//		TreeIterator<EObject> eAllContents = resource.getAllContents();
//		while (eAllContents.hasNext()) {
//			EObject next = eAllContents.next();
//			EClass eClass = next.eClass();
//			if (eClass instanceof EClass) {
//				System.out.println(eClass);
//			}
//		}
		
		return model;
	}
	
	public static Model loadModel(String modelPath) {
		registerTyphonMM();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		Model model = (Model) resource.getContents().get(0);
		return model;
	}
	
	public static void registerTyphonMM() {
//		System.out.print("Registering Typhon Metamodel...");
		EPackage.Registry.INSTANCE.put(TyphonmlPackage.eNS_URI, TyphonmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", TyphonmlPackage.eINSTANCE);
//		System.out.println("Registered!");
	}
	
	public static String getNameForOutputProjects(String filePath) {
		String result = "";
		try {
			java.net.URI uri = new java.net.URI(filePath);
			String path = uri.getPath();
			result = path.substring(path.lastIndexOf('/') + 1);
			result = result.replaceFirst("[.][^.]+$", "");
		} catch (java.net.URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
