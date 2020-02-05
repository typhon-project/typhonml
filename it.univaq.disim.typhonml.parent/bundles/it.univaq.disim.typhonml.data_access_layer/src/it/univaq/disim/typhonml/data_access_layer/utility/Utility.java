package it.univaq.disim.typhonml.data_access_layer.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.FilenameUtils;

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

	public static File getFileFromResource(String fileName) {
//		File resultFile = null;
//		URL url = Utility.class.getClass().getResource(File.separator + fileName);
//		try {
//			 resultFile = new File(url.toURI());
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return resultFile;

		ClassLoader classLoader = new Utility().getClass().getClassLoader();
		File resultFile = new File(classLoader.getResource(fileName).getFile());
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

	public static File getFileFromPath(String filePath) {
		return new File(filePath);
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
	
	public static String getNameFromPathWithoutExtension(String path){
		Path p = Paths.get(path);
		return FilenameUtils.removeExtension(p.getFileName().toString());
	}

}