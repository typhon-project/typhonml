/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.GraphEdge#getFrom <em>From</em>}</li>
 *   <li>{@link typhonml.GraphEdge#getTo <em>To</em>}</li>
 *   <li>{@link typhonml.GraphEdge#getLabels <em>Labels</em>}</li>
 *   <li>{@link typhonml.GraphEdge#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getGraphEdge()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EntitiesWithoutTwoReferences WrongFrom WrongTo WrongFromCardinality WrongToCardinality BlobAttributesNotSupportedByGraphEdge FromEntityCanNotBeGraphBacked ToEntityCanNotBeGraphBacked'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot EntitiesWithoutTwoReferences='entity.relations-&gt;size()  &gt; 1' WrongFrom='from.oclContainer() = entity' WrongTo='to.oclContainer() = entity' WrongFromCardinality='from.cardinality = Cardinality::one' WrongToCardinality='to.cardinality = Cardinality::one' BlobAttributesNotSupportedByGraphEdge='\n\t\t\tentity.attributes-&gt;select(z | z.oclIsKindOf(Attribute))\n\t\t\t\t-&gt;select(z | z.oclAsType(Attribute).type.oclIsTypeOf(BlobType))-&gt;size()=0' FromEntityCanNotBeGraphBacked='\n\t\t\ttyphonml::GraphEdge.allInstances()-&gt;select(x | x.entity = from.type)-&gt;size() = 1' ToEntityCanNotBeGraphBacked='\n\t\t\ttyphonml::GraphEdge.allInstances()-&gt;select(x | x.entity = to.type)-&gt;size() = 1'"
 * @generated
 */
public interface GraphEdge extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Relation)
	 * @see typhonml.TyphonmlPackage#getGraphEdge_From()
	 * @model
	 * @generated
	 */
	Relation getFrom();

	/**
	 * Sets the value of the '{@link typhonml.GraphEdge#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Relation value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Relation)
	 * @see typhonml.TyphonmlPackage#getGraphEdge_To()
	 * @model
	 * @generated
	 */
	Relation getTo();

	/**
	 * Sets the value of the '{@link typhonml.GraphEdge#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Relation value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.GraphEdgeLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getGraphEdge_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphEdgeLabel> getLabels();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getGraphEdge_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link typhonml.GraphEdge#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // GraphEdge
