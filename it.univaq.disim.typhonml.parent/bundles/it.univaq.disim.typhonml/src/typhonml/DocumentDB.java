/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document DB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.DocumentDB#getCollections <em>Collections</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getDocumentDB()
 * @model
 * @generated
 */
public interface DocumentDB extends Database {
	/**
	 * Returns the value of the '<em><b>Collections</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Collection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collections</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getDocumentDB_Collections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Collection> getCollections();

} // DocumentDB
