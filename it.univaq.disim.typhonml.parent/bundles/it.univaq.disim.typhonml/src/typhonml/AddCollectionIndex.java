/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Collection Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddCollectionIndex#getCollection <em>Collection</em>}</li>
 *   <li>{@link typhonml.AddCollectionIndex#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddCollectionIndex()
 * @model
 * @generated
 */
public interface AddCollectionIndex extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Collection)
	 * @see typhonml.TyphonmlPackage#getAddCollectionIndex_Collection()
	 * @model required="true"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link typhonml.AddCollectionIndex#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getAddCollectionIndex_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // AddCollectionIndex
