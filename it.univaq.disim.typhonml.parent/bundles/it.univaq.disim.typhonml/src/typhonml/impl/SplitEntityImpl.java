/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Entity;
import typhonml.SplitEntity;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.SplitEntityImpl#getEntityToBeSplit <em>Entity To Be Split</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityImpl#getFirstNewEntity <em>First New Entity</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityImpl#getSecondNewEntity <em>Second New Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitEntityImpl extends ChangeOperatorImpl implements SplitEntity {
	/**
	 * The cached value of the '{@link #getEntityToBeSplit() <em>Entity To Be Split</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityToBeSplit()
	 * @generated
	 * @ordered
	 */
	protected Entity entityToBeSplit;

	/**
	 * The cached value of the '{@link #getFirstNewEntity() <em>First New Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstNewEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity firstNewEntity;

	/**
	 * The cached value of the '{@link #getSecondNewEntity() <em>Second New Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondNewEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity secondNewEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.SPLIT_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntityToBeSplit() {
		if (entityToBeSplit != null && entityToBeSplit.eIsProxy()) {
			InternalEObject oldEntityToBeSplit = (InternalEObject)entityToBeSplit;
			entityToBeSplit = (Entity)eResolveProxy(oldEntityToBeSplit);
			if (entityToBeSplit != oldEntityToBeSplit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.SPLIT_ENTITY__ENTITY_TO_BE_SPLIT, oldEntityToBeSplit, entityToBeSplit));
			}
		}
		return entityToBeSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntityToBeSplit() {
		return entityToBeSplit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityToBeSplit(Entity newEntityToBeSplit) {
		Entity oldEntityToBeSplit = entityToBeSplit;
		entityToBeSplit = newEntityToBeSplit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY__ENTITY_TO_BE_SPLIT, oldEntityToBeSplit, entityToBeSplit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getFirstNewEntity() {
		return firstNewEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstNewEntity(Entity newFirstNewEntity, NotificationChain msgs) {
		Entity oldFirstNewEntity = firstNewEntity;
		firstNewEntity = newFirstNewEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY, oldFirstNewEntity, newFirstNewEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstNewEntity(Entity newFirstNewEntity) {
		if (newFirstNewEntity != firstNewEntity) {
			NotificationChain msgs = null;
			if (firstNewEntity != null)
				msgs = ((InternalEObject)firstNewEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY, null, msgs);
			if (newFirstNewEntity != null)
				msgs = ((InternalEObject)newFirstNewEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY, null, msgs);
			msgs = basicSetFirstNewEntity(newFirstNewEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY, newFirstNewEntity, newFirstNewEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSecondNewEntity() {
		return secondNewEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondNewEntity(Entity newSecondNewEntity, NotificationChain msgs) {
		Entity oldSecondNewEntity = secondNewEntity;
		secondNewEntity = newSecondNewEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY, oldSecondNewEntity, newSecondNewEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondNewEntity(Entity newSecondNewEntity) {
		if (newSecondNewEntity != secondNewEntity) {
			NotificationChain msgs = null;
			if (secondNewEntity != null)
				msgs = ((InternalEObject)secondNewEntity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY, null, msgs);
			if (newSecondNewEntity != null)
				msgs = ((InternalEObject)newSecondNewEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY, null, msgs);
			msgs = basicSetSecondNewEntity(newSecondNewEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY, newSecondNewEntity, newSecondNewEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY:
				return basicSetFirstNewEntity(null, msgs);
			case TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY:
				return basicSetSecondNewEntity(null, msgs);
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
			case TyphonmlPackage.SPLIT_ENTITY__ENTITY_TO_BE_SPLIT:
				if (resolve) return getEntityToBeSplit();
				return basicGetEntityToBeSplit();
			case TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY:
				return getFirstNewEntity();
			case TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY:
				return getSecondNewEntity();
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
			case TyphonmlPackage.SPLIT_ENTITY__ENTITY_TO_BE_SPLIT:
				setEntityToBeSplit((Entity)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY:
				setFirstNewEntity((Entity)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY:
				setSecondNewEntity((Entity)newValue);
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
			case TyphonmlPackage.SPLIT_ENTITY__ENTITY_TO_BE_SPLIT:
				setEntityToBeSplit((Entity)null);
				return;
			case TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY:
				setFirstNewEntity((Entity)null);
				return;
			case TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY:
				setSecondNewEntity((Entity)null);
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
			case TyphonmlPackage.SPLIT_ENTITY__ENTITY_TO_BE_SPLIT:
				return entityToBeSplit != null;
			case TyphonmlPackage.SPLIT_ENTITY__FIRST_NEW_ENTITY:
				return firstNewEntity != null;
			case TyphonmlPackage.SPLIT_ENTITY__SECOND_NEW_ENTITY:
				return secondNewEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //SplitEntityImpl
