package it.univaq.disim.typhonml.mapper_generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import typhonml.TyphonmlPackage;
import typhonmlreq.TyphonmlreqPackage;

public class Utility {

	public static void search(final String pattern, final File folder, List<File> result) {
		for (final File f : folder.listFiles()) {
			if (f.isDirectory()) {
				search(pattern, f, result);
			}
			if (f.isFile()) {
				if (f.getName().matches(pattern)) {
					result.add(f);
				}
			}
		}
	}
	
	
	public static void TyphonMLPackageRegistering() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TyphonmlPackage.eINSTANCE.getNsURI(), TyphonmlPackage.eINSTANCE);
	}
	
	public static void TyphonMLREQPackageRegistering() {
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TyphonmlreqPackage.eINSTANCE.getNsURI(), TyphonmlreqPackage.eINSTANCE);
	}
	

	public static File getFileFromResource(String fileName) {
		ClassLoader classLoader = new Utility().getClass().getClassLoader();
		File resultFile = new File(classLoader.getResource(fileName).getFile());
		return resultFile;
	}
	
	public static File getFile(String fileName) {
		File resultFile = new File(fileName);
		return resultFile;
	}

	public static URI getURIFromResource(String fileName) {
		ClassLoader classLoader = new Utility().getClass().getClassLoader();
		File resultFile = new File(classLoader.getResource(fileName).getFile());
		return resultFile.toURI();
	}

	public static void saveStringToFile(String text, String outputFilePath) {
		File fileToSave = createFile(outputFilePath);
		FileWriter fooWriter;
		try {
			fooWriter = new FileWriter(fileToSave, false);
			fooWriter.write(text);
			fooWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // true to append
	}

	/**
	 * Create file, also if it not exist. And create also prents directories if non exist.
	 * @param model
	 * @return
	 */
	public static File createFile(String model) {
		File file = new File(model);
		FileOutputStream oFile = null;
		try {
			file.getParentFile().mkdirs(); //Create all parent folders
			file.createNewFile();
			oFile = new FileOutputStream(file, false);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // if file already exists will do nothing 
		return file;
	}

}
