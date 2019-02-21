package it.univaq.disim.typhon.acceleo.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import it.univaq.disim.typhon.acceleo.main.*;
import it.univaq.disim.typhon.acceleo.test.Test;
import typhonml.TyphonmlPackage;

public class Runner {

	private static String modelFolder = "model/";
	private static String outFolder = "output/";

	public static void main(String[] args) {

		File baseFolderFile = new File(modelFolder);

		// MM registration. Once for all the models.
		registerMetamodel();

		if(baseFolderFile.listFiles().length > 0) {
			// for each input model in the modelFolder
			for (File file : baseFolderFile.listFiles()) {
				String fileNameWithOutExt = file.getName().replaceFirst("[.][^.]+$", "");
				System.out.println(fileNameWithOutExt + " model generation:");
				run(file.getAbsolutePath(), outFolder + "/" + fileNameWithOutExt);
			}
			System.out.println("The generation has finished successfully!");
			System.out.println();
		}else {
			System.out.println("model/ folder do not contains any model.");
		}
		
	}

	public static void run(String modelUri, String outputFolder) {

		try {
			URI modelURI = URI.createFileURI(modelUri);
			File folder = new File(outputFolder);
			List<String> arguments = new ArrayList<String>();

			System.out.print("\t" + "Generate all the files from the template...");
			Generate generator = new Generate(modelURI, folder, arguments);
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");
	                
	        System.out.print("Generating Test...");
	        Test test = new Test(modelURI, folder, arguments);
	        test.doGenerate(new BasicMonitor());
	        System.out.println("Generated!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void registerMetamodel() {
		System.out.print("Registering Typhon Metamodel...");
		EPackage.Registry.INSTANCE.put(TyphonmlPackage.eNS_URI, TyphonmlPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", TyphonmlPackage.eINSTANCE);
		System.out.println("Registered!");
	}

}
