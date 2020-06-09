package it.univaq.disim.typhonml.acceleo.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.BasicMonitor;
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
import it.univaq.disim.typhonml.acceleo.main.Generate;
import typhonml.Model;
import typhonml.TyphonmlPackage;

public class Runner {

	public static void main(String[] args) {
		Runner r = new Runner();
		try {
			r.run("user-review-product.xmi", "output");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(String modelPath, String outputFolderPath) throws IOException {
		System.out.println("Model 2 text generation:");

		File folder = new File(outputFolderPath);
		System.out.print("\t" + "Generate all the files from the template...");
		Generate generator = new Generate(loadModel(modelPath), folder, new ArrayList<String>());
		generator.doGenerate(new BasicMonitor());
		System.out.println("Generated!");

	}

	public static Model loadModel(String modelPath) {
		registerTyphonMM();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(TyphonmlPackage.eINSTANCE.getNsURI(), TyphonmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.getResource(URI.createURI(modelPath), true);
		Model model = (Model) resource.getContents().get(0);
		return model;
	}

	public static void registerTyphonMM() {
		EPackage.Registry.INSTANCE.put(TyphonmlPackage.eNS_URI, TyphonmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", TyphonmlPackage.eINSTANCE);
	}

	public void runConcreteSyntaxt(String modelUri, String outputFolderPath) {

		System.out.println("Model 2 texts generation:");

		try {
			File folder = new File(outputFolderPath);

			System.out.print("\t" + "Generate all the files from the template...");
			Generate generator = new Generate(loadXtextModel(modelUri), folder, new ArrayList<String>());
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Model loadXtextModel(String pathToXTextModel) {
		registerTyphonMM();
		Injector injector = new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		URI uri = URI.createURI(pathToXTextModel);
		Resource resource = resourceSet.getResource(uri, true);
		Model model = (Model) resource.getContents().get(0);

		return model;
	}

}
