/**
 */
package typhonml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Entity Horizontal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.SplitEntityHorizontal#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link typhonml.SplitEntityHorizontal#getEntity2name <em>Entity2name</em>}</li>
 *   <li>{@link typhonml.SplitEntityHorizontal#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link typhonml.SplitEntityHorizontal#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getSplitEntityHorizontal()
 * @model
 * @generated
 */
public interface SplitEntityHorizontal extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity1</em>' reference.
	 * @see #setEntity1(Entity)
	 * @see typhonml.TyphonmlPackage#getSplitEntityHorizontal_Entity1()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity1();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntityHorizontal#getEntity1 <em>Entity1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity1</em>' reference.
	 * @see #getEntity1()
	 * @generated
	 */
	void setEntity1(Entity value);

	/**
	 * Returns the value of the '<em><b>Entity2name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity2name</em>' attribute.
	 * @see #setEntity2name(String)
	 * @see typhonml.TyphonmlPackage#getSplitEntityHorizontal_Entity2name()
	 * @model required="true"
	 * @generated
	 */
	String getEntity2name();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntityHorizontal#getEntity2name <em>Entity2name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity2name</em>' attribute.
	 * @see #getEntity2name()
	 * @generated
	 */
	void setEntity2name(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see typhonml.TyphonmlPackage#getSplitEntityHorizontal_Attribute()
	 * @model required="true"
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntityHorizontal#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see typhonml.TyphonmlPackage#getSplitEntityHorizontal_Expression()
	 * @model
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntityHorizontal#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

} // SplitEntityHorizontal
