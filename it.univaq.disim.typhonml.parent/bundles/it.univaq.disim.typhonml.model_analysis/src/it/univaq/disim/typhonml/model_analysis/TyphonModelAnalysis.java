package it.univaq.disim.typhonml.model_analysis;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import it.univaq.disim.typhonml.model_analysis.utility.EpsilonStandalone;
import it.univaq.disim.typhonml.model_analysis.utility.Utility;

public class TyphonModelAnalysis extends EpsilonStandalone {

	private String MODEL_NAME = "TyphonML";
	private String RULES_FOLDER = "resources/rules";
	private String TYPHONML_MODEL = "resources/mydb.xmi";
	private String TYPHONML_METAMODEL = "resources/typhonml.ecore";

	public static void main(String[] args) throws Exception {
		new TyphonModelAnalysis().execute();
	}

	@Override
	public IEolModule createModule() {
		return new EvlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel(MODEL_NAME, TYPHONML_MODEL, TYPHONML_METAMODEL, true, true));
		return models;
	}

	@Override
	public List<File> getSources() throws Exception {
//		final File rootFolder = Utility.getFileFromResource(RULES_FOLDER);
		final File rootFolder = Utility.getFileFromPath(RULES_FOLDER);
		List<File> allEVLFilesPath = new ArrayList<File>();
		Utility.search(".*\\.evl", rootFolder, allEVLFilesPath);
		return allEVLFilesPath;
//		return "resources/rules/generalTyphonMLCheck.evl";
	}

	@Override
	public void postProcess() {

		EvlModule module = (EvlModule) this.module;

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

	@Override
	public String getSource() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
