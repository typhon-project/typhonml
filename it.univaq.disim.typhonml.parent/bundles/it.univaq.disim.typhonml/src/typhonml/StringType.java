/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.StringType#getMaxSize <em>Max Size</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends PrimitiveDataType {
	/**
	 * Returns the value of the '<em><b>Max Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Size</em>' attribute.
	 * @see #setMaxSize(int)
	 * @see typhonml.TyphonmlPackage#getStringType_MaxSize()
	 * @model
	 * @generated
	 */
	int getMaxSize();

	/**
	 * Sets the value of the '{@link typhonml.StringType#getMaxSize <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Size</em>' attribute.
	 * @see #getMaxSize()
	 * @generated
	 */
	void setMaxSize(int value);

} // StringType
