/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Attributes To Idenfifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.AddAttributesToIdenfifier#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link typhonml.AddAttributesToIdenfifier#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getAddAttributesToIdenfifier()
 * @model
 * @generated
 */
public interface AddAttributesToIdenfifier extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(EntityIdentifier)
	 * @see typhonml.TyphonmlPackage#getAddAttributesToIdenfifier_Identifier()
	 * @model required="true"
	 * @generated
	 */
	EntityIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link typhonml.AddAttributesToIdenfifier#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(EntityIdentifier value);

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
	 * @see typhonml.TyphonmlPackage#getAddAttributesToIdenfifier_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // AddAttributesToIdenfifier
