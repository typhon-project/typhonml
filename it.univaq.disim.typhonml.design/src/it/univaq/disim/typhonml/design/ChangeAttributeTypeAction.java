	package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.Attribute;
import typhonml.ChangeAttributeType;
import typhonml.ChangeRelationContainement;
import typhonml.DataType;
import typhonml.Model;
import typhonml.Relation;
import typhonml.TyphonmlFactory;

public class ChangeAttributeTypeAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject eObject : selections) {
			if(eObject instanceof Attribute) {
				Attribute feat = (Attribute) eObject;
				ChangeAttributeType rr = TyphonmlFactory.eINSTANCE.createChangeAttributeType();
				rr.setNewType((DataType) parameters.get("value"));
				rr.setAttributeToChange(feat);
				((Model)feat.eContainer().eContainer()).getChangeOperators().add(rr);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
