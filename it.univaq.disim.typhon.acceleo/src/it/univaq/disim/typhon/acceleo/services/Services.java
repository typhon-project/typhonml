package it.univaq.disim.typhon.acceleo.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import it.univaq.disim.typhon.TyphonMLStandaloneSetup;
import it.univaq.disim.typhon.acceleo.main.Generate;
import typhonml.Collection;
import typhonml.Database;
import typhonml.DocumentDB;
import typhonml.Model;
import typhonml.RelationalDB;
import typhonml.Table;
import typhonml.TyphonmlPackage;

public class Services {

	public static Model loadXtextModel(String pathToXTextModel) {
		registerTyphonMM();
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		URI uri = URI.createURI(pathToXTextModel);
		Resource resource = resourceSet.getResource(uri, true);
		Model model = (Model) resource.getContents().get(0);

		for (Database db : model.getDatabases()) {

			if (db instanceof RelationalDB) {
				RelationalDB v = (RelationalDB) db;
				for (Table t : v.getTables()) {
					t.getEntity().setGenericList(t);

				}
			}
			if (db instanceof DocumentDB) {
				DocumentDB v = (DocumentDB) db;
				for (Collection t : v.getCollections()) {
					t.getEntity().setGenericList(t);

				}
			}

		}
		return model;
	}

	static ResourceSet outputMetamodelResourceSet = new ResourceSetImpl();
	static {
		outputMetamodelResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*",
				new XMLResourceFactoryImpl());
	}

	public static void serialize(EObject root, String path) {

		// create a resource
//		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		URI uri = URI.createURI(path);
		Resource outputMetamodelResource = outputMetamodelResourceSet.createResource(uri);

		outputMetamodelResource.getContents().add(root);
		try {
			outputMetamodelResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Model loadModel(String modelPath) {
		registerTyphonMM();
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("model", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		Model model = (Model) resource.getContents().get(0);
		return model;
	}

	public static void registerTyphonMM() {
		// System.out.print("Registering Typhon Metamodel...");
		EPackage.Registry.INSTANCE.put(TyphonmlPackage.eNS_URI, TyphonmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", TyphonmlPackage.eINSTANCE);
		// System.out.println("Registered!");
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

	public static void generateFromTML(String modelUri, String folderS) {
		
		try {
			List<String> arguments = new ArrayList<String>();

			System.out.print("\t" + "Generate all the files from the template...");
			
			
			
			File folder = new File(folderS);
			
			Generate generator = new Generate(Services.loadXtextModel(modelUri), folder, arguments);
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void generateFromXMI(String modelUri, String folderS) {
		
		try {
			List<String> arguments = new ArrayList<String>();
			System.out.print("\t" + "Generate all the files from the template...");
			File folder = new File(folderS);
			Generate generator = new Generate(Services.loadModel(modelUri), folder, arguments);
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
