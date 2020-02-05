package it.univaq.disim.typhonml.data_access_layer.epsilon;

import java.io.File;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

import it.univaq.disim.typhonml.data_access_layer.utility.Utility;


public abstract class EpsilonStandalone {

	protected IEolModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();

	protected Object result;

	public abstract IEolModule createModule();

	public abstract List<File> getSources() throws Exception;

	public abstract List<IModel> getModels() throws Exception;

	public void postProcess() {
	};

	public void preProcess() {
	};

	public void execute() throws Exception {

		for (File moduleFile : getSources()) {
			module = createModule();
			module.parse(Utility.getFileFromPath(moduleFile.getAbsolutePath()));
	
			if (module.getParseProblems().size() > 0) {
				System.err.println("Parse errors occured...");
				for (ParseProblem problem : module.getParseProblems()) {
					System.err.println(problem.toString());
				}
	//			return;
			}
	
			for (IModel model : getModels()) {
				module.getContext().getModelRepository().addModel(model);
			}
	
			for (Variable parameter : parameters) {
				module.getContext().getFrameStack().put(parameter);
			}
	
			preProcess();
			result = execute(module);
			postProcess();
	
			module.getContext().getModelRepository().dispose();
		}
	}

	public List<Variable> getParameters() {
		return parameters;
	}

	protected Object execute(IEolModule module) throws EolRuntimeException {
		return module.execute();
	}

	public EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				Utility.getFileFromPath(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, Utility.getFileFromPath(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emfModel;
	}

	public EmfModel createOutputEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				Utility.getFileFromResource(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, Utility.createFile(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		try {
			emfModel.load(properties, (IRelativePathResolver) null);
		} catch (EolModelLoadingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emfModel;
	}

	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, Utility.getURIFromResource(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

}