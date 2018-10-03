/**
 */
package org.typhon.dsls.sirius.typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getReferences <em>References</em>}</li>
 *   <li>{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getTable <em>Table</em>}</li>
 * </ul>
 *
 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getIndexSpec()
 * @model
 * @generated
 */
public interface IndexSpec extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getIndexSpec_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link org.typhon.dsls.sirius.typhonml.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getIndexSpec_References()
	 * @model
	 * @generated
	 */
	EList<Relation> getReferences();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.typhon.dsls.sirius.typhonml.Table#getIndexSpec <em>Index Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see org.typhon.dsls.sirius.typhonml.TyphonmlPackage#getIndexSpec_Table()
	 * @see org.typhon.dsls.sirius.typhonml.Table#getIndexSpec
	 * @model opposite="indexSpec" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.typhon.dsls.sirius.typhonml.IndexSpec#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

} // IndexSpec
