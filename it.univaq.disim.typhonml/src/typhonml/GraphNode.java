/**
 */
package typhonml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonml.GraphNode#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see typhonml.TyphonmlPackage#getGraphNode()
 * @model
 * @generated
 */
public interface GraphNode extends NamedElement, GenericList {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link typhonml.GraphAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see typhonml.TyphonmlPackage#getGraphNode_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphAttribute> getAttributes();

} // GraphNode
