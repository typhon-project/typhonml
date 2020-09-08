/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.KeyValueElement#getKey <em>Key</em>}</li>
 *   <li>{@link typhonml.KeyValueElement#getValues <em>Values</em>}</li>
 *   <li>{@link typhonml.KeyValueElement#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getKeyValueElement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AttributesAreMappedToGraphEdge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot AttributesAreMappedToGraphEdge='\n\t\t\ttyphonml::GraphEdge.allInstances()-&gt;select(x | values-&gt;collect(Attribute::Entity)-&gt;includes(x.entity))-&gt;size()=0'"
 * @generated
 */
public interface KeyValueElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see typhonml.TyphonmlPackage#getKeyValueElement_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link typhonml.KeyValueElement#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getKeyValueElement_Values()
	 * @model
	 * @generated
	 */
	EList<Attribute> getValues();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getKeyValueElement_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link typhonml.KeyValueElement#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // KeyValueElement
