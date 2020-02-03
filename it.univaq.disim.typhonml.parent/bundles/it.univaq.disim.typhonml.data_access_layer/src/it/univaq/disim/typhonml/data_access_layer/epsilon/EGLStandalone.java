package it.univaq.disim.typhonml.data_access_layer.epsilon;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;

import it.univaq.disim.typhonml.data_access_layer.utility.Utility;


public class EGLStandalone extends EpsilonStandalone{
	
	private String OUTPUT_PATH = "output/";
	private String RULES_PATH = "resources/rules/";
	
	private String TYPHONML_METAMODEL_NAME = "TyphonML";
	private String TYPHONML_METAMODEL_PATH = "resources/model/typhonml.ecore";
	private String TYPHONML_MODEL_PATH = "resources/model/TyphonECommerceExample.xmi";
	
	private String TYPHONDL_METAMODEL_NAME = "TyphonDL";
	private String TYPHONDL_METAMODEL_PATH = "";
	private String TYPHONDL_MODEL_PATH = "";

	public static void main(String[] args) throws Exception {
		new EGLStandalone().execute();
	}
	
	@Override
	public IEolModule createModule() {
//		return new EglModule();
		return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel(TYPHONML_METAMODEL_NAME, TYPHONML_MODEL_PATH, TYPHONML_METAMODEL_PATH, true, true));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return RULES_PATH + "apigatewayGenerate.egl";
	}

	@Override
	public void postProcess() {
		String text = (String) result;
		Utility.saveStringToFile(text, OUTPUT_PATH + "result.txt");
	}
}
