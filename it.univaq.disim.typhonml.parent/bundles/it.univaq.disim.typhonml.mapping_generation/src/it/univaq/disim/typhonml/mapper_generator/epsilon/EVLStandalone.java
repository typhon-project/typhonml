package it.univaq.disim.typhonml.mapper_generator.epsilon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

import typhonml.TyphonmlPackage;
import typhonmlreq.TyphonmlreqPackage;


public class EVLStandalone extends EpsilonStandalone{
	
	public static void main(String[] args) throws Exception {
		new EVLStandalone().execute("", "");
	}
	
	@Override
	public IEolModule createModule() {
		return new EvlModule();
	}

	
	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModelByURI("TyphonMLReq", "model/RequirementsDefinition.xmi", TyphonmlreqPackage.eNS_URI, true, false));
		models.add(createEmfModelByURI("TyphonML", "model/TyphonECommerceExample.xmi", TyphonmlPackage.eNS_URI, true, false));
		return models;
	}

	@Override
	public String getSource() throws Exception {
//		final File rootFolder = Utility.getFileFromResource(RULES_FOLDER);
//		List<File> allEVLFilesPath = new ArrayList<File>();
//		Utility.search(".*\\.evl", rootFolder, allEVLFilesPath);
//		return "resources/epsilon/feasibilityChecks.evl";
		return "/Users/francesco/Sviluppo/Workspaces/TYPHON/workspace_typhonml_last/typhonml/it.univaq.disim.typhonml.parent/bundles/it.univaq.disim.typhonml.mapping_generation/resources/epsilon/fullTyphonMLValidation.evl";
	}

	@Override
	public List<String> postProcess() {
		
		EvlModule module = (EvlModule) this.module;
		
		Collection<UnsatisfiedConstraint> unsatisfied = module.getContext().getUnsatisfiedConstraints();
	
		if (unsatisfied.size() > 0) {
			System.err.println(unsatisfied.size() + " constraint(s) have not been satisfied");
			for (UnsatisfiedConstraint uc : unsatisfied) {
				System.err.println(uc.getMessage());
			}
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
		
		return null;
	}
}
