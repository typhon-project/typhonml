/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import typhonml.AddAttribute;
import typhonml.Entity;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.AddAttributeImpl#getOwnerEntity <em>Owner Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddAttributeImpl extends AttributeImpl implements AddAttribute {
	/**
	 * The cached value of the '{@link #getOwnerEntity() <em>Owner Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity ownerEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.ADD_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getOwnerEntity() {
		if (ownerEntity != null && ownerEntity.eIsProxy()) {
			InternalEObject oldOwnerEntity = (InternalEObject)ownerEntity;
			ownerEntity = (Entity)eResolveProxy(oldOwnerEntity);
			if (ownerEntity != oldOwnerEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY, oldOwnerEntity, ownerEntity));
			}
		}
		return ownerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetOwnerEntity() {
		return ownerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerEntity(Entity newOwnerEntity) {
		Entity oldOwnerEntity = ownerEntity;
		ownerEntity = newOwnerEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY, oldOwnerEntity, ownerEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY:
				if (resolve) return getOwnerEntity();
				return basicGetOwnerEntity();
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
			case TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY:
				setOwnerEntity((Entity)newValue);
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
			case TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY:
				setOwnerEntity((Entity)null);
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
			case TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY:
				return ownerEntity != null;
		}
		return super.eIsSet(featureID);
	}

} //AddAttributeImpl
