/**
 */
package typhonml;

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
 *   <li>{@link typhonml.Model#getDatabases <em>Databases</em>}</li>
 *   <li>{@link typhonml.Model#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link typhonml.Model#getChangeOperators <em>Change Operators</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Databases</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Database}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Databases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getModel_Databases()
	 * @model containment="true"
	 * @generated
	 */
	EList<Database> getDatabases();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getModel_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Change Operators</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.ChangeOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Operators</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Operators</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getModel_ChangeOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangeOperator> getChangeOperators();

} // Model
