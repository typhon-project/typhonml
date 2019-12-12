/**
 */
package typhonml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import typhonml.AddGraphEdge;
import typhonml.GraphEdge;
import typhonml.GraphEdgeLabel;
import typhonml.GraphNode;
import typhonml.NamedElement;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getTo <em>To</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddGraphEdgeImpl extends ChangeOperatorImpl implements AddGraphEdge {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected GraphNode from;
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected GraphNode to;
	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphEdgeLabel> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddGraphEdgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.ADD_GRAPH_EDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_GRAPH_EDGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImportedNamespace() {
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedNamespace(String newImportedNamespace) {
		String oldImportedNamespace = importedNamespace;
		importedNamespace = newImportedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphNode getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (GraphNode)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.ADD_GRAPH_EDGE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNode basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(GraphNode newFrom) {
		GraphNode oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_GRAPH_EDGE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphNode getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (GraphNode)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.ADD_GRAPH_EDGE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphNode basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(GraphNode newTo) {
		GraphNode oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_GRAPH_EDGE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GraphEdgeLabel> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<GraphEdgeLabel>(GraphEdgeLabel.class, this, TyphonmlPackage.ADD_GRAPH_EDGE__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__NAME:
				return getName();
			case TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE:
				return getImportedNamespace();
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				return getLabels();
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__NAME:
				setName((String)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE:
				setImportedNamespace((String)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				setFrom((GraphNode)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				setTo((GraphNode)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends GraphEdgeLabel>)newValue);
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE:
				setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				setFrom((GraphNode)null);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				setTo((GraphNode)null);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				getLabels().clear();
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE:
				return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				return from != null;
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				return to != null;
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case TyphonmlPackage.ADD_GRAPH_EDGE__NAME: return TyphonmlPackage.NAMED_ELEMENT__NAME;
				case TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE: return TyphonmlPackage.NAMED_ELEMENT__IMPORTED_NAMESPACE;
				default: return -1;
			}
		}
		if (baseClass == GraphEdge.class) {
			switch (derivedFeatureID) {
				case TyphonmlPackage.ADD_GRAPH_EDGE__FROM: return TyphonmlPackage.GRAPH_EDGE__FROM;
				case TyphonmlPackage.ADD_GRAPH_EDGE__TO: return TyphonmlPackage.GRAPH_EDGE__TO;
				case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS: return TyphonmlPackage.GRAPH_EDGE__LABELS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case TyphonmlPackage.NAMED_ELEMENT__NAME: return TyphonmlPackage.ADD_GRAPH_EDGE__NAME;
				case TyphonmlPackage.NAMED_ELEMENT__IMPORTED_NAMESPACE: return TyphonmlPackage.ADD_GRAPH_EDGE__IMPORTED_NAMESPACE;
				default: return -1;
			}
		}
		if (baseClass == GraphEdge.class) {
			switch (baseFeatureID) {
				case TyphonmlPackage.GRAPH_EDGE__FROM: return TyphonmlPackage.ADD_GRAPH_EDGE__FROM;
				case TyphonmlPackage.GRAPH_EDGE__TO: return TyphonmlPackage.ADD_GRAPH_EDGE__TO;
				case TyphonmlPackage.GRAPH_EDGE__LABELS: return TyphonmlPackage.ADD_GRAPH_EDGE__LABELS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", importedNamespace: ");
		result.append(importedNamespace);
		result.append(')');
		return result.toString();
	}

} //AddGraphEdgeImpl
