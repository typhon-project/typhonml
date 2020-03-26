/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.ChangeCustomDataTypeAttribute;
import typhonml.CustomDataType;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Custom Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.ChangeCustomDataTypeAttributeImpl#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeCustomDataTypeAttributeImpl extends ChangeAttributeTypeImpl implements ChangeCustomDataTypeAttribute {
	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected CustomDataType newType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeCustomDataTypeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomDataType getNewType() {
		if (newType != null && newType.eIsProxy()) {
			InternalEObject oldNewType = (InternalEObject)newType;
			newType = (CustomDataType)eResolveProxy(oldNewType);
			if (newType != oldNewType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE__NEW_TYPE, oldNewType, newType));
			}
		}
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomDataType basicGetNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewType(CustomDataType newNewType) {
		CustomDataType oldNewType = newType;
		newType = newNewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE__NEW_TYPE, oldNewType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				if (resolve) return getNewType();
				return basicGetNewType();
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
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				setNewType((CustomDataType)newValue);
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
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				setNewType((CustomDataType)null);
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
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				return newType != null;
		}
		return super.eIsSet(featureID);
	}

} //ChangeCustomDataTypeAttributeImpl
