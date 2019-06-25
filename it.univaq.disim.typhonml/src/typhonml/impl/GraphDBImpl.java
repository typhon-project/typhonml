/**
 */
package typhonml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonml.GraphDB;
import typhonml.GraphEdge;
import typhonml.GraphNode;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph DB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.GraphDBImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link typhonml.impl.GraphDBImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDBImpl extends DatabaseImpl implements GraphDB {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphNode> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEdge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.GRAPH_DB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<GraphNode>(GraphNode.class, this, TyphonmlPackage.GRAPH_DB__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<GraphEdge>(GraphEdge.class, this, TyphonmlPackage.GRAPH_DB__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.GRAPH_DB__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.GRAPH_DB__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.GRAPH_DB__NODES:
				return getNodes();
			case TyphonmlPackage.GRAPH_DB__EDGES:
				return getEdges();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyphonmlPackage.GRAPH_DB__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends GraphNode>)newValue);
				return;
			case TyphonmlPackage.GRAPH_DB__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends GraphEdge>)newValue);
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
			case TyphonmlPackage.GRAPH_DB__NODES:
				getNodes().clear();
				return;
			case TyphonmlPackage.GRAPH_DB__EDGES:
				getEdges().clear();
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
			case TyphonmlPackage.GRAPH_DB__NODES:
				return nodes != null && !nodes.isEmpty();
			case TyphonmlPackage.GRAPH_DB__EDGES:
				return edges != null && !edges.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphDBImpl
