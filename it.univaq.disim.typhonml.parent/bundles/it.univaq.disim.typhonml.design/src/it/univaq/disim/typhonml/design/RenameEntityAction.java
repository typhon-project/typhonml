	package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.Model;
import typhonml.Entity;
import typhonml.RenameEntity;
import typhonml.TyphonmlFactory;

public class RenameEntityAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject eObject : selections) {
			if(eObject instanceof Entity) {
				Entity feat = (Entity) eObject;
				RenameEntity rr = TyphonmlFactory.eINSTANCE.createRenameEntity();
				rr.setNewEntityName(parameters.get("value").toString());
				rr.setEntityToRename(feat);
				((Model)feat.eContainer()).getChangeOperators().add(rr);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
