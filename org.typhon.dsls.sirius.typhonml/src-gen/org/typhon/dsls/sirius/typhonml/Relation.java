/**
 */
package org.typhon.dsls.sirius.typhonml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Relation#getType <em>Type</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Relation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Relation#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.Relation#getIsContainment <em>Is Containment</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Entity)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getRelation_Type()
	 * @model
	 * @generated
	 */
	Entity getType();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Relation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Entity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.typhon.dsls.sirius.typhonml.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.typhon.dsls.sirius.typhonml.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getRelation_Cardinality()
	 * @model
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Relation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.typhon.dsls.sirius.typhonml.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Relation)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getRelation_Opposite()
	 * @model
	 * @generated
	 */
	Relation getOpposite();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Relation#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Relation value);

	/**
	 * Returns the value of the '<em><b>Is Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Containment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Containment</em>' attribute.
	 * @see #setIsContainment(Boolean)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getRelation_IsContainment()
	 * @model
	 * @generated
	 */
	Boolean getIsContainment();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.Relation#getIsContainment <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Containment</em>' attribute.
	 * @see #getIsContainment()
	 * @generated
	 */
	void setIsContainment(Boolean value);

} // Relation
