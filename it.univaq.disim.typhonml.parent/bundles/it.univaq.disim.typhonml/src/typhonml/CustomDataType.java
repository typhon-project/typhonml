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
public interface CustomDataType extends DataType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.DataTypeItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getCustomDataType_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataTypeItem> getElements();

} // CustomDataType
