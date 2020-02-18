package it.univaq.disim.typhonml.data_access_layer.epsilon;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;

import it.univaq.disim.typhonml.data_access_layer.utility.Utility;
import typhonml.TyphonmlPackage;


public class EGXXMIStandalone extends EpsilonStandalone{
	
	private String OUTPUT_PATH = "output/";
	private String RULES_PATH = "resources/generator/";
	
	private String TYPHONML_METAMODEL_NAME = "TyphonML";
	private String TYPHONML_METAMODEL_PATH = "resources/model/typhonml.ecore";
	private String TYPHONML_MODEL_PATH = "resources/model/TyphonECommerceExample.xmi";
	
	public static void main(String[] args) throws Exception {
		new EGXXMIStandalone().execute();
	}

	@Override
	public IEolModule createModule() {
		try {
			EglFileGeneratingTemplateFactory templateFactory = new EglFileGeneratingTemplateFactory();
			String rootGenerated = OUTPUT_PATH + Utility.getNameFromPathWithoutExtension(TYPHONML_MODEL_PATH);
			templateFactory.setOutputRoot(new File(rootGenerated).getAbsolutePath()); // THE ROOT of the generated files
			return new EgxModule(templateFactory);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel(TYPHONML_METAMODEL_NAME, TYPHONML_MODEL_PATH, TYPHONML_METAMODEL_PATH, true, false));
//		models.add(createEmfModelByURI(TYPHONML_METAMODEL_NAME, TYPHONML_MODEL_PATH, TyphonmlPackage.eINSTANCE.getNsURI(), true, false));
		return models;
	}

	@Override
	public List<File> getSources() throws Exception {
		final File rootFolder = Utility.getFileFromPath(RULES_PATH);
		List<File> allEGXFilesPath = new ArrayList<File>();
		Utility.search(".*\\.egx", rootFolder, allEGXFilesPath);
		return allEGXFilesPath;
	}
}
