/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Collection Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.DropCollectionIndex#getCollection <em>Collection</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getDropCollectionIndex()
 * @model
 * @generated
 */
public interface DropCollectionIndex extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' reference.
	 * @see #setCollection(Collection)
	 * @see typhonml.TyphonmlPackage#getDropCollectionIndex_Collection()
	 * @model required="true"
	 * @generated
	 */
	Collection getCollection();

	/**
	 * Sets the value of the '{@link typhonml.DropCollectionIndex#getCollection <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(Collection value);

} // DropCollectionIndex
