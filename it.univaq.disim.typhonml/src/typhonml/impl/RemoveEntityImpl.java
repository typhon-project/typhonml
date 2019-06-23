/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Entity;
import typhonml.RemoveEntity;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RemoveEntityImpl#getEntityToRemove <em>Entity To Remove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveEntityImpl extends ChangeOperatorImpl implements RemoveEntity {
	/**
	 * The cached value of the '{@link #getEntityToRemove() <em>Entity To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityToRemove()
	 * @generated
	 * @ordered
	 */
	protected Entity entityToRemove;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.REMOVE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntityToRemove() {
		if (entityToRemove != null && entityToRemove.eIsProxy()) {
			InternalEObject oldEntityToRemove = (InternalEObject)entityToRemove;
			entityToRemove = (Entity)eResolveProxy(oldEntityToRemove);
			if (entityToRemove != oldEntityToRemove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.REMOVE_ENTITY__ENTITY_TO_REMOVE, oldEntityToRemove, entityToRemove));
			}
		}
		return entityToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntityToRemove() {
		return entityToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityToRemove(Entity newEntityToRemove) {
		Entity oldEntityToRemove = entityToRemove;
		entityToRemove = newEntityToRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.REMOVE_ENTITY__ENTITY_TO_REMOVE, oldEntityToRemove, entityToRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.REMOVE_ENTITY__ENTITY_TO_REMOVE:
				if (resolve) return getEntityToRemove();
				return basicGetEntityToRemove();
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
			case TyphonmlPackage.REMOVE_ENTITY__ENTITY_TO_REMOVE:
				setEntityToRemove((Entity)newValue);
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
			case TyphonmlPackage.REMOVE_ENTITY__ENTITY_TO_REMOVE:
				setEntityToRemove((Entity)null);
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
			case TyphonmlPackage.REMOVE_ENTITY__ENTITY_TO_REMOVE:
				return entityToRemove != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoveEntityImpl
