	package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.ChangeRelationContainement;
import typhonml.Model;
import typhonml.Relation;
import typhonml.TyphonmlFactory;

public class ChangeRelationContainerAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject eObject : selections) {
			if(eObject instanceof Relation) {
				Relation feat = (Relation) eObject;
				ChangeRelationContainement rr = TyphonmlFactory.eINSTANCE.createChangeRelationContainement();
				rr.setNewContainment(!feat.getIsContainment());
				rr.setRelation(feat);
				((Model)feat.eContainer().eContainer()).getChangeOperators().add(rr);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
