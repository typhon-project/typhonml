/**
 */
package typhonml;

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
 *   <li>{@link typhonml.IndexSpec#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typhonml.IndexSpec#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getIndexSpec()
 * @model
 * @generated
 */
public interface IndexSpec extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getIndexSpec_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link typhonml.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see typhonml.TyphonmlPackage#getIndexSpec_References()
	 * @model
	 * @generated
	 */
	EList<Relation> getReferences();

} // IndexSpec
