package it.univaq.disim.typhonml.mapper_generator.epsilon;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;


public class EVLStandalone extends EpsilonStandalone{
	
	public static void main(String[] args) throws Exception {
		new EVLStandalone().execute();
	}
	
	@Override
	public IEolModule createModule() {
		return new EvlModule();
	}

	
	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
//		models.add(createEmfModel("TyphonMLReq", "model/RequirementsDefinition.xmi", "model/typhonmlreq.ecore", true, false));
		models.add(createEmfModel("TyphonMLTag", "model/typhonmlTaggedCE.xmi", "model/typhonmltag.ecore", true, false));
		return models;
	}

	@Override
	public String getSource() throws Exception {
//		final File rootFolder = Utility.getFileFromResource(RULES_FOLDER);
//		List<File> allEVLFilesPath = new ArrayList<File>();
//		Utility.search(".*\\.evl", rootFolder, allEVLFilesPath);
		return "resources/epsilon/feasibilityChecks.evl";
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
		}
		else {
			System.out.println("All constraints have been satisfied");
		}
	}
}
