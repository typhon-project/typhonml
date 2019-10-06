/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.SplitEntity#getEntityToBeSplit <em>Entity To Be Split</em>}</li>
 *   <li>{@link typhonml.SplitEntity#getFirstNewEntity <em>First New Entity</em>}</li>
 *   <li>{@link typhonml.SplitEntity#getSecondNewEntity <em>Second New Entity</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getSplitEntity()
 * @model
 * @generated
 */
public interface SplitEntity extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity To Be Split</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity To Be Split</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity To Be Split</em>' reference.
	 * @see #setEntityToBeSplit(Entity)
	 * @see typhonml.TyphonmlPackage#getSplitEntity_EntityToBeSplit()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntityToBeSplit();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntity#getEntityToBeSplit <em>Entity To Be Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity To Be Split</em>' reference.
	 * @see #getEntityToBeSplit()
	 * @generated
	 */
	void setEntityToBeSplit(Entity value);

	/**
	 * Returns the value of the '<em><b>First New Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First New Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First New Entity</em>' containment reference.
	 * @see #setFirstNewEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getSplitEntity_FirstNewEntity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entity getFirstNewEntity();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntity#getFirstNewEntity <em>First New Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First New Entity</em>' containment reference.
	 * @see #getFirstNewEntity()
	 * @generated
	 */
	void setFirstNewEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Second New Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second New Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second New Entity</em>' containment reference.
	 * @see #setSecondNewEntity(Entity)
	 * @see typhonml.TyphonmlPackage#getSplitEntity_SecondNewEntity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Entity getSecondNewEntity();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntity#getSecondNewEntity <em>Second New Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second New Entity</em>' containment reference.
	 * @see #getSecondNewEntity()
	 * @generated
	 */
	void setSecondNewEntity(Entity value);

} // SplitEntity
