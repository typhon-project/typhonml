package it.univaq.disim.typhonml.evaluator;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import it.univaq.disim.typhonml.evaluator.utility.Utility;
import typhonml.TyphonmlPackage;

public class TyphonEvaluator {

	private String RULES_FOLDER = "resources/rules";

	public static void main(String[] args) {
		TyphonEvaluator tEvaluator = new TyphonEvaluator();
		tEvaluator.evaluate("resources/mydb.xmi");
	}

	public void evaluate(String modelToEvaluatePath) {
		TyphonEvaluator tEvaluator = new TyphonEvaluator();

		final File rootFolder = tEvaluator.getFile(tEvaluator.RULES_FOLDER);

		List<File> allEVLFilesPath = new ArrayList<File>();
		Utility.search(".*\\.evl", rootFolder, allEVLFilesPath);

		// Foreach EVL file in resources/rules
		for (File EVLFile : allEVLFilesPath) {
			EvlModule module = new EvlModule();

			try {
				module.parse(EVLFile);
				// to register the emf models into models repository
//    			for (IModel model : models) {
				// TODO there is an error here
				// IEtlContext etlContext = ((EtlModule) module).getContext();
				((EvlModule) module).getContext().getModelRepository()
						.addModel(new TyphonEvaluator().createEmfModel("TyphonML", // This name is important for
																					// TyphonML!`Collection` in EOL
																					// files
								modelToEvaluatePath, "resources/typhonml.ecore", true, true));
//    			}
				// For loading Native tools
//    			((EvlModule) module).getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());

				// showPopUp();
				((EvlModule) module).execute();
				((EvlModule) module).getContext().getModelRepository().dispose();

				new TyphonEvaluator().checkUnsatifiedConstraint(module);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void checkUnsatifiedConstraint(EvlModule module) {
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();

		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (UnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getMessage());
			}
		} else {
			System.out.println("All constraints have been satisfied");
		}
	}

	private EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) {

		EmfModel emfModel = new EmfModel();

		StringProperties properties = new StringProperties();

		properties.put(EmfModel.PROPERTY_NAME, name);

//		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFile(metamodel).toURI().toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, getFile(model).toURI().toString());

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

	protected File getFile(String fileName) {

		File resultFile = new File(fileName);
//		URL url = getClass().getResource(File.separator + fileName);
//		try {
//			 resultFile = new File(url.toURI());
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return resultFile;
	}

}
