/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.GraphEdge;
import typhonml.RemoveGraphEdge;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RemoveGraphEdgeImpl#getGraphEdgeToRemove <em>Graph Edge To Remove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveGraphEdgeImpl extends ChangeOperatorImpl implements RemoveGraphEdge {
	/**
	 * The cached value of the '{@link #getGraphEdgeToRemove() <em>Graph Edge To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphEdgeToRemove()
	 * @generated
	 * @ordered
	 */
	protected GraphEdge graphEdgeToRemove;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveGraphEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.REMOVE_GRAPH_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphEdge getGraphEdgeToRemove() {
		if (graphEdgeToRemove != null && graphEdgeToRemove.eIsProxy()) {
			InternalEObject oldGraphEdgeToRemove = (InternalEObject)graphEdgeToRemove;
			graphEdgeToRemove = (GraphEdge)eResolveProxy(oldGraphEdgeToRemove);
			if (graphEdgeToRemove != oldGraphEdgeToRemove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE, oldGraphEdgeToRemove, graphEdgeToRemove));
			}
		}
		return graphEdgeToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphEdge basicGetGraphEdgeToRemove() {
		return graphEdgeToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGraphEdgeToRemove(GraphEdge newGraphEdgeToRemove) {
		GraphEdge oldGraphEdgeToRemove = graphEdgeToRemove;
		graphEdgeToRemove = newGraphEdgeToRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE, oldGraphEdgeToRemove, graphEdgeToRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE:
				if (resolve) return getGraphEdgeToRemove();
				return basicGetGraphEdgeToRemove();
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
			case TyphonmlPackage.REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE:
				setGraphEdgeToRemove((GraphEdge)newValue);
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
			case TyphonmlPackage.REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE:
				setGraphEdgeToRemove((GraphEdge)null);
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
			case TyphonmlPackage.REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE:
				return graphEdgeToRemove != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoveGraphEdgeImpl
