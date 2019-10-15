package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.Model;
import typhonml.Relation;
import typhonml.RemoveRelation;
import typhonml.TyphonmlFactory;

public class RemoveRelationAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject obj : selections) {
			if(obj instanceof Relation) {
				Relation ei = (Relation) obj;
				RemoveRelation removeRelation = TyphonmlFactory.eINSTANCE.createRemoveRelation();
				removeRelation.setRelationToRemove(ei);
				((Model)ei.eContainer().eContainer()).getChangeOperators().add(removeRelation);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) if (!(obj instanceof Relation)) return false;
		return true;
	}

}
