/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typhonml.Entity#getRelations <em>Relations</em>}</li>
 *   <li>{@link typhonml.Entity#getIdentifer <em>Identifer</em>}</li>
 *   <li>{@link typhonml.Entity#getGenericList <em>Generic List</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DataType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Identifer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifer</em>' containment reference.
	 * @see #setIdentifer(EntityIdentifier)
	 * @see typhonml.TyphonmlPackage#getEntity_Identifer()
	 * @model containment="true"
	 * @generated
	 */
	EntityIdentifier getIdentifer();

	/**
	 * Sets the value of the '{@link typhonml.Entity#getIdentifer <em>Identifer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifer</em>' containment reference.
	 * @see #getIdentifer()
	 * @generated
	 */
	void setIdentifer(EntityIdentifier value);

	/**
	 * Returns the value of the '<em><b>Generic List</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link typhonml.GenericList#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic List</em>' reference.
	 * @see #setGenericList(GenericList)
	 * @see typhonml.TyphonmlPackage#getEntity_GenericList()
	 * @see typhonml.GenericList#getEntity
	 * @model opposite="entity"
	 * @generated
	 */
	GenericList getGenericList();

	/**
	 * Sets the value of the '{@link typhonml.Entity#getGenericList <em>Generic List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic List</em>' reference.
	 * @see #getGenericList()
	 * @generated
	 */
	void setGenericList(GenericList value);

} // Entity
