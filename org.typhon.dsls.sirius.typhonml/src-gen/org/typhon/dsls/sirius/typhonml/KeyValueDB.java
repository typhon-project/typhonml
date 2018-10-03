/**
 */
package org.typhon.dsls.sirius.typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Value DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.KeyValueDB#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getKeyValueDB()
 * @model
 * @generated
 */
public interface KeyValueDB extends Database {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.KeyValueElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getKeyValueDB_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValueElement> getElements();

} // KeyValueDB
