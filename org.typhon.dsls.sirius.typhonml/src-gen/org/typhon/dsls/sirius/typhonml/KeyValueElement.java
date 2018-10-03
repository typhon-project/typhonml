/**
 */
package org.typhon.dsls.sirius.typhonml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getKey <em>Key</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getKeyValueElement()
 * @model
 * @generated
 */
public interface KeyValueElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getKeyValueElement_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getKeyValueElement_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.KeyValueElement#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getKeyValueElement_Values()
	 * @model
	 * @generated
	 */
	EList<DataType> getValues();

} // KeyValueElement
