/**
 */
package typhonmlreq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Req</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonmlreq.ModelReq#getDbTypes <em>Db Types</em>}</li>
 * </ul>
 *
 * @see typhonmlreq.TyphonmlreqPackage#getModelReq()
 * @model
 * @generated
 */
public interface ModelReq extends EObject {
	/**
	 * Returns the value of the '<em><b>Db Types</b></em>' containment reference list.
	 * The list contents are of type {@link typhonmlreq.DBType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Types</em>' containment reference list.
	 * @see typhonmlreq.TyphonmlreqPackage#getModelReq_DbTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DBType> getDbTypes();

} // ModelReq
