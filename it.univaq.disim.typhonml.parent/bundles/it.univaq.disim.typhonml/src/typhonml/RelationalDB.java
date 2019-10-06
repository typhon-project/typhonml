/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.RelationalDB#getTables <em>Tables</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getRelationalDB()
 * @model
 * @generated
 */
public interface RelationalDB extends Database {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Table}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getRelationalDB_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Table> getTables();

} // RelationalDB
