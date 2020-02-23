/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Entity Vertical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.SplitEntityVertical#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link typhonml.SplitEntityVertical#getEntity2name <em>Entity2name</em>}</li>
 *   <li>{@link typhonml.SplitEntityVertical#getAttributeList <em>Attribute List</em>}</li>
 *   <li>{@link typhonml.SplitEntityVertical#getRelationList <em>Relation List</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getSplitEntityVertical()
 * @model
 * @generated
 */
public interface SplitEntityVertical extends ChangeOperator {
	/**
	 * Returns the value of the '<em><b>Entity1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity1</em>' reference.
	 * @see #setEntity1(Entity)
	 * @see typhonml.TyphonmlPackage#getSplitEntityVertical_Entity1()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity1();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntityVertical#getEntity1 <em>Entity1</em>}' reference.
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
	 * @see typhonml.TyphonmlPackage#getSplitEntityVertical_Entity2name()
	 * @model required="true"
	 * @generated
	 */
	String getEntity2name();

	/**
	 * Sets the value of the '{@link typhonml.SplitEntityVertical#getEntity2name <em>Entity2name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity2name</em>' attribute.
	 * @see #getEntity2name()
	 * @generated
	 */
	void setEntity2name(String value);

	/**
	 * Returns the value of the '<em><b>Attribute List</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute List</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getSplitEntityVertical_AttributeList()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributeList();

	/**
	 * Returns the value of the '<em><b>Relation List</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation List</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getSplitEntityVertical_RelationList()
	 * @model
	 * @generated
	 */
	EList<Relation> getRelationList();

} // SplitEntityVertical
