/**
 */
package typhonml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.GenericList#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getGenericList()
 * @model
 * @generated
 */
public interface GenericList extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link typhonml.Entity#getGenericList <em>Generic List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getGenericList_Entity()
	 * @see typhonml.Entity#getGenericList
	 * @model opposite="genericList" required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link typhonml.GenericList#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // GenericList
