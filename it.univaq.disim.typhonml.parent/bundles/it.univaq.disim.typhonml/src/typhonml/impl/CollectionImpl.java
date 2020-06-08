/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Collection;
import typhonml.Entity;
import typhonml.IndexSpec;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.CollectionImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link typhonml.impl.CollectionImpl#getIndexSpec <em>Index Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionImpl extends NamedElementImpl implements Collection {
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
	 * The cached value of the '{@link #getIndexSpec() <em>Index Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexSpec()
	 * @generated
	 * @ordered
	 */
	protected IndexSpec indexSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.COLLECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.COLLECTION__ENTITY, oldEntity, entity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.COLLECTION__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexSpec getIndexSpec() {
		return indexSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexSpec(IndexSpec newIndexSpec, NotificationChain msgs) {
		IndexSpec oldIndexSpec = indexSpec;
		indexSpec = newIndexSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.COLLECTION__INDEX_SPEC, oldIndexSpec, newIndexSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndexSpec(IndexSpec newIndexSpec) {
		if (newIndexSpec != indexSpec) {
			NotificationChain msgs = null;
			if (indexSpec != null)
				msgs = ((InternalEObject)indexSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.COLLECTION__INDEX_SPEC, null, msgs);
			if (newIndexSpec != null)
				msgs = ((InternalEObject)newIndexSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.COLLECTION__INDEX_SPEC, null, msgs);
			msgs = basicSetIndexSpec(newIndexSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.COLLECTION__INDEX_SPEC, newIndexSpec, newIndexSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.COLLECTION__INDEX_SPEC:
				return basicSetIndexSpec(null, msgs);
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
			case TyphonmlPackage.COLLECTION__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case TyphonmlPackage.COLLECTION__INDEX_SPEC:
				return getIndexSpec();
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
			case TyphonmlPackage.COLLECTION__ENTITY:
				setEntity((Entity)newValue);
				return;
			case TyphonmlPackage.COLLECTION__INDEX_SPEC:
				setIndexSpec((IndexSpec)newValue);
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
			case TyphonmlPackage.COLLECTION__ENTITY:
				setEntity((Entity)null);
				return;
			case TyphonmlPackage.COLLECTION__INDEX_SPEC:
				setIndexSpec((IndexSpec)null);
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
			case TyphonmlPackage.COLLECTION__ENTITY:
				return entity != null;
			case TyphonmlPackage.COLLECTION__INDEX_SPEC:
				return indexSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectionImpl
