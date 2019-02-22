/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.GraphEdge;
import typhonml.RenabeGraphEdgeLabel;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renabe Graph Edge Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RenabeGraphEdgeLabelImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link typhonml.impl.RenabeGraphEdgeLabelImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenabeGraphEdgeLabelImpl extends ChangeOperatorImpl implements RenabeGraphEdgeLabel {
	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected GraphEdge edge;

	/**
	 * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected String newName = NEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenabeGraphEdgeLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.RENABE_GRAPH_EDGE_LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdge getEdge() {
		if (edge != null && edge.eIsProxy()) {
			InternalEObject oldEdge = (InternalEObject)edge;
			edge = (GraphEdge)eResolveProxy(oldEdge);
			if (edge != oldEdge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__EDGE, oldEdge, edge));
			}
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdge basicGetEdge() {
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdge(GraphEdge newEdge) {
		GraphEdge oldEdge = edge;
		edge = newEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__EDGE, oldEdge, edge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewName() {
		return newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewName(String newNewName) {
		String oldNewName = newName;
		newName = newNewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__NEW_NAME, oldNewName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__EDGE:
				if (resolve) return getEdge();
				return basicGetEdge();
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__NEW_NAME:
				return getNewName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__EDGE:
				setEdge((GraphEdge)newValue);
				return;
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__NEW_NAME:
				setNewName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__EDGE:
				setEdge((GraphEdge)null);
				return;
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__EDGE:
				return edge != null;
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (newName: ");
		result.append(newName);
		result.append(')');
		return result.toString();
	}

} //RenabeGraphEdgeLabelImpl
