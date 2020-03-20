/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Attributes To Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddAttributesToIndex#getTable <em>Table</em>}</li>
 *   <li>{@link typhonml.AddAttributesToIndex#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddAttributesToIndex()
 * @model
 * @generated
 */
public interface AddAttributesToIndex extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(Table)
	 * @see typhonml.TyphonmlPackage#getAddAttributesToIndex_Table()
	 * @model required="true"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link typhonml.AddAttributesToIndex#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getAddAttributesToIndex_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // AddAttributesToIndex
