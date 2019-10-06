package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.Attribute;
import typhonml.Model;
import typhonml.RemoveAttribute;
import typhonml.TyphonmlFactory;

public class RemoveAttributeAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject obj : selections) {
			if(obj instanceof Attribute) {
				Attribute ei = (Attribute) obj;
				RemoveAttribute removeRelation = TyphonmlFactory.eINSTANCE.createRemoveAttribute();
				removeRelation.setAttributeToRemove(ei);
				((Model)ei.eContainer().eContainer()).getChangeOperators().add(removeRelation);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) if (!(obj instanceof Attribute)) return false;
		return true;
	}

}
