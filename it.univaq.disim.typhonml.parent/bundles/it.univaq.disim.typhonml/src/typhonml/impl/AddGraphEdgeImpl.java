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
import typhonml.Entity;
import typhonml.GraphEdge;
import typhonml.GraphEdgeLabel;
import typhonml.Relation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Graph Edge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getFrom <em>From</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getTo <em>To</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link typhonml.impl.AddGraphEdgeImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddGraphEdgeImpl extends ChangeOperatorImpl implements AddGraphEdge {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Relation from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Relation to;

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
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

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
	public Relation getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Relation)eResolveProxy(oldFrom);
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
	public Relation basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Relation newFrom) {
		Relation oldFrom = from;
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
	public Relation getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Relation)eResolveProxy(oldTo);
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
	public Relation basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(Relation newTo) {
		Relation oldTo = to;
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
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY, oldEntity, entity));
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				if (resolve) return getTo();
				return basicGetTo();
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				return getLabels();
			case TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				setFrom((Relation)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				setTo((Relation)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends GraphEdgeLabel>)newValue);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY:
				setEntity((Entity)newValue);
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				setFrom((Relation)null);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				setTo((Relation)null);
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				getLabels().clear();
				return;
			case TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY:
				setEntity((Entity)null);
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
			case TyphonmlPackage.ADD_GRAPH_EDGE__FROM:
				return from != null;
			case TyphonmlPackage.ADD_GRAPH_EDGE__TO:
				return to != null;
			case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS:
				return labels != null && !labels.isEmpty();
			case TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY:
				return entity != null;
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
		if (baseClass == GraphEdge.class) {
			switch (derivedFeatureID) {
				case TyphonmlPackage.ADD_GRAPH_EDGE__FROM: return TyphonmlPackage.GRAPH_EDGE__FROM;
				case TyphonmlPackage.ADD_GRAPH_EDGE__TO: return TyphonmlPackage.GRAPH_EDGE__TO;
				case TyphonmlPackage.ADD_GRAPH_EDGE__LABELS: return TyphonmlPackage.GRAPH_EDGE__LABELS;
				case TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY: return TyphonmlPackage.GRAPH_EDGE__ENTITY;
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
		if (baseClass == GraphEdge.class) {
			switch (baseFeatureID) {
				case TyphonmlPackage.GRAPH_EDGE__FROM: return TyphonmlPackage.ADD_GRAPH_EDGE__FROM;
				case TyphonmlPackage.GRAPH_EDGE__TO: return TyphonmlPackage.ADD_GRAPH_EDGE__TO;
				case TyphonmlPackage.GRAPH_EDGE__LABELS: return TyphonmlPackage.ADD_GRAPH_EDGE__LABELS;
				case TyphonmlPackage.GRAPH_EDGE__ENTITY: return TyphonmlPackage.ADD_GRAPH_EDGE__ENTITY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AddGraphEdgeImpl
