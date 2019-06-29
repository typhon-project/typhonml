/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typhonml.Entity#getFretextAttributes <em>Fretext Attributes</em>}</li>
 *   <li>{@link typhonml.Entity#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DataType {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Fretext Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.FreeText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fretext Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fretext Attributes</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_FretextAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<FreeText> getFretextAttributes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getEntity_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

} // Entity
