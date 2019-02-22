package it.univaq.disim.typhonml.design;

import org.eclipse.emf.ecore.EObject;

import typhonml.Attribute;
import typhonml.Entity;
import typhonml.Relation;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    public Boolean isEntity(EObject any) {
    	return any instanceof Entity;
    }
    public Boolean isRelation(EObject any) {
    	return any instanceof Relation;
    }
    public Boolean isAttribute(EObject any) {
    	return any instanceof Attribute;
    }
}
