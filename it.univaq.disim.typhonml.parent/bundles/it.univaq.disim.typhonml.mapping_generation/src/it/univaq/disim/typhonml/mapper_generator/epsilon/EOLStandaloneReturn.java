package it.univaq.disim.typhonml.mapper_generator.epsilon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.dom.Operation;
import org.eclipse.epsilon.eol.dom.OperationList;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.models.IModel;

import typhonml.TyphonmlPackage;
import typhonmlreq.TyphonmlreqPackage;

public class EOLStandaloneReturn extends EpsilonStandalone{
	
	public static void main(String[] args) throws Exception {
		new EOLStandaloneReturn().execute("", "");
	}
	
	@Override
	public IEolModule createModule() {
		return new EolModule();
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
		return "resources/epsilon/typhonmltag.eol";
	}

	@Override
	protected Object execute(IEolModule module) throws EolRuntimeException {
		OperationList operations = module.getDeclaredOperations();
		for (Operation operation : operations) {
			Object result = operation.execute(null, Collections.emptyList(), module.getContext());
		}
		return null;
//		return operation.execute(null, Collections.emptyList(), module.getContext());
	}
	
	@Override
	public List<String> postProcess() {
		System.err.println(result);
		return null;
	}

}
