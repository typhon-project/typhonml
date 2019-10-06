package it.univaq.disim.typhon.acceleo.runner;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;

import it.univaq.disim.typhon.acceleo.main.Generate;
import it.univaq.disim.typhon.acceleo.services.Services;
import it.univaq.disim.typhon.acceleo.test.Test;

public class Runner {

	private static String modelFolder = "model";
	private static String outFolder = "output";

	public static void main(String[] args) {

		File baseFolderFile = new File(modelFolder);

		if(baseFolderFile.listFiles().length > 0) {
			// for each input model in the modelFolder
			for (File file : baseFolderFile.listFiles()) {
				run(file.getAbsolutePath(), file);
//				break;
			}
			System.out.println("The generation has finished successfully!");
			System.out.println();
		}else {
			System.out.println("model/ folder do not contains any model.");
		}
		
		/*
		 * XTEXT RUNNER
//		 */
//		String pathToXTextModel = "platform:/resource/it.univaq.disim.typhonml.xtext.examples/mydb.tml";
//		runXtext(pathToXTextModel);
		
	}

	
	public static void run(String modelUri, File file) {
		
		String fileNameWithOutExt = Services.getNameForOutputProjects(file.getName());
		System.out.println(fileNameWithOutExt + " model generation:");

		try {
			File folder = new File(outFolder + File.separator + fileNameWithOutExt);
			List<String> arguments = new ArrayList<String>();

			System.out.print("\t" + "Generate all the files from the template...");
			Generate generator = new Generate(Services.loadModel(modelUri), folder, arguments);
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");
	                
//	        System.out.print("Generating Test...");
//	        Test test = new Test(Services.loadModel(modelUri), folder, arguments);
//	        test.doGenerate(new BasicMonitor());
//	        System.out.println("Generated!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void runXtext(String modelUri) {
		
		String fileNameWithOutExt = Services.getNameForOutputProjects(modelUri);
		System.out.println(fileNameWithOutExt + " model generation:");

		try {
			File folder = new File(outFolder + File.separator + fileNameWithOutExt);
			List<String> arguments = new ArrayList<String>();

			System.out.print("\t" + "Generate all the files from the template...");
			Generate generator = new Generate(Services.loadXtextModel(modelUri), folder, arguments);
			generator.doGenerate(new BasicMonitor());
			System.out.println("Generated!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
