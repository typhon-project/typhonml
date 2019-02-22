package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.EntityIdentifier;
import typhonml.IdSpec;
import typhonml.Model;
import typhonml.RemoveIdentifier;
import typhonml.TyphonmlFactory;

public class RemoveIdentifierAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject obj : selections) {
			if(obj instanceof EntityIdentifier) {
				EntityIdentifier ei = (EntityIdentifier) obj;
				RemoveIdentifier removeIdentifier = TyphonmlFactory.eINSTANCE.createRemoveIdentifier();
				removeIdentifier.setEntityIdentifier(ei);
				((Model)ei.eContainer().eContainer()).getChangeOperators().add(removeIdentifier);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) if (!(obj instanceof EntityIdentifier)) return false;
		return true;
	}

}
