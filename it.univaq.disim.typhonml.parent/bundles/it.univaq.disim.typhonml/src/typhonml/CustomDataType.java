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
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getCustomDataType()
 * @model
 * @generated
 */
public interface CustomDataType extends DataType, NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.CustomDataTypeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getCustomDataType_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CustomDataTypeItem> getElements();

} // CustomDataType
