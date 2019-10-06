/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.ColumnDB#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getColumnDB()
 * @model
 * @generated
 */
public interface ColumnDB extends Database {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getColumnDB_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // ColumnDB
