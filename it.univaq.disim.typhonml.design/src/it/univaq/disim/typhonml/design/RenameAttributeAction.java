	package it.univaq.disim.typhonml.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import typhonml.Attribute;
import typhonml.Model;
import typhonml.RenameAttribute;
import typhonml.TyphonmlFactory;

public class RenameAttributeAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		for (EObject eObject : selections) {
			if(eObject instanceof Attribute) {
				Attribute feat = (Attribute) eObject;
				RenameAttribute rr = TyphonmlFactory.eINSTANCE.createRenameAttribute();
				rr.setNewName(parameters.get("value").toString());
				rr.setAttributeToRename(feat);
				((Model)feat.eContainer().eContainer()).getChangeOperators().add(rr);
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) if (!(obj instanceof Attribute)) return false;
		return true;
	}

}
