package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.Entity;
import typhonml.Model;
import typhonml.RemoveEntity;
import typhonml.TyphonmlFactory;

public class RemoveEntityAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject obj : selections) {
			if(obj instanceof Entity) {
				Entity ei = (Entity) obj;
				RemoveEntity removeEntity = TyphonmlFactory.eINSTANCE.createRemoveEntity();
				removeEntity.setEntityToRemove(ei);
				((Model)ei.eContainer()).getChangeOperators().add(removeEntity);
				
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) if (!(obj instanceof Entity)) return false;
		return true;
	}

}
