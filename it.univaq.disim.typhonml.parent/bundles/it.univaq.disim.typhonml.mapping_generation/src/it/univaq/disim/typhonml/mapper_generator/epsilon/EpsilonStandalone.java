package it.univaq.disim.typhonml.mapper_generator.epsilon;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import it.univaq.disim.typhonml.mapper_generator.Utility;
import typhonml.TyphonmlPackage;
import typhonmlreq.TyphonmlreqPackage;

public abstract class EpsilonStandalone {

	protected EvlModule module;
	protected List<Variable> parameters = new ArrayList<Variable>();

	protected Object result;

	public abstract IEolModule createModule();

	public abstract String getSource() throws Exception;

	public abstract List<IModel> getModels() throws Exception;

	public List<String> postProcess() {
		return null;
	};

	public void preProcess() {
	};
	
	
	public List<String> execute(String typhonML, String typhonMLReq) throws Exception {
		
		List<String> returnValues = new ArrayList<String>();
		
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModelByURI("TyphonMLReq", typhonMLReq, TyphonmlreqPackage.eNS_URI, true, false));
		models.add(createEmfModelByURI("TyphonML", typhonML, TyphonmlPackage.eNS_URI, true, false));
		
		Utility.registryMetamodels();

		module = new EvlModule();
		module.parse(Utility.getFile(getSource()));

//		if (module.getParseProblems().size() > 0) {
//			System.err.println("Parse errors occured...");
//			for (ParseProblem problem : module.getParseProblems()) {
//				returnValues.add(problem.toString());
//				System.err.println(problem.toString());
//			}
////			return;
//		}

		for (IModel model : models) {
			module.getContext().getModelRepository().addModel(model);
		}

		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}

		preProcess();
		execute(module);
//		returnValues = postProcess();
		
//		EvlModule module = (EvlModule) this.module;
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			returnValues.add(unsatisfied.size() + " constraint(s) have not been satisfied:\r\n");
			for (UnsatisfiedConstraint uc : unsatisfied) {
				returnValues.add("- " + uc.getMessage());
				System.err.println(uc.getMessage());
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
		

		module.getContext().getModelRepository().dispose();
		
		return returnValues;
	}
	

//	public void execute(String typhonML, String typhonMLReq) throws Exception {
//		
//		List<IModel> models = new ArrayList<IModel>();
//		models.add(createEmfModelByURI("TyphonMLReq", typhonMLReq, TyphonmlreqPackage.eNS_URI, true, false));
//		models.add(createEmfModelByURI("TyphonML", typhonML, TyphonmlPackage.eNS_URI, true, false));
//		
//		Utility.registryMetamodels();
//
//		module = createModule();
//		module.parse(Utility.getFile(getSource()));
//
//		if (module.getParseProblems().size() > 0) {
//			System.err.println("Parse errors occured...");
//			for (ParseProblem problem : module.getParseProblems()) {
//				System.err.println(problem.toString());
//			}
////			return;
//		}
//
//		for (IModel model : models) {
//			module.getContext().getModelRepository().addModel(model);
//		}
//
//		for (Variable parameter : parameters) {
//			module.getContext().getFrameStack().put(parameter);
//		}
//
//		preProcess();
//		result = execute(module);
//		postProcess();
//
//		module.getContext().getModelRepository().dispose();
//	}
//
	
	
	public List<Variable> getParameters() {
		return parameters;
	}

	protected Object execute(IEolModule module) throws EolRuntimeException {
		return module.execute();
	}

//	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
//	boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
//EmfModel emfModel = new EmfModel();
//StringProperties properties = new StringProperties();
//properties.put(EmfModel.PROPERTY_NAME, name);
//properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
//properties.put(EmfModel.PROPERTY_MODEL_URI, Utility.getURIFromResource(model).toString());
//properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
//properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
//emfModel.load(properties, (IRelativePathResolver) null);
//return emfModel;
//}

	protected EmfModel createEmfModelByURI(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, Utility.getFile(model).toURI().toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}

	public EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, Utility.getFile(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, Utility.getFile(model).toURI().toString());
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
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, Utility.getFile(metamodel).toURI().toString());
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

}