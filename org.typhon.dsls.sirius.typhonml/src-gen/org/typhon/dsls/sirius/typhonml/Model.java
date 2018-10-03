/**
 */
package org.typhon.dsls.sirius.typhonml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Model#getDatabases <em>Databases</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Model#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Databases</b></em>' containment reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.Database}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' containment reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getModel_Databases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabases();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getModel_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // Model
