/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.CustomDataType#getElements <em>Elements</em>}</li>
 *   <li>{@link typhonml.CustomDataType#getImplementation <em>Implementation</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getCustomDataType()
 * @model
 * @generated
 */
public interface CustomDataType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.SuperDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getCustomDataType_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<SuperDataType> getElements();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(CustomDataTypeImplementationPackage)
	 * @see typhonml.TyphonmlPackage#getCustomDataType_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	CustomDataTypeImplementationPackage getImplementation();

	/**
	 * Sets the value of the '{@link typhonml.CustomDataType#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(CustomDataTypeImplementationPackage value);

} // CustomDataType
