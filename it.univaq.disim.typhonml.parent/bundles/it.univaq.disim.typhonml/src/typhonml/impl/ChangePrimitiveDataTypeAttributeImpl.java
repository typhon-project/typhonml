/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.ChangePrimitiveDataTypeAttribute;
import typhonml.DataType;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Primitive Data Type Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.ChangePrimitiveDataTypeAttributeImpl#getMaxSize <em>Max Size</em>}</li>
 *   <li>{@link typhonml.impl.ChangePrimitiveDataTypeAttributeImpl#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangePrimitiveDataTypeAttributeImpl extends ChangeAttributeTypeImpl implements ChangePrimitiveDataTypeAttribute {
	/**
	 * The default value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxSize() <em>Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxSize()
	 * @generated
	 * @ordered
	 */
	protected int maxSize = MAX_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected DataType newType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangePrimitiveDataTypeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxSize(int newMaxSize) {
		int oldMaxSize = maxSize;
		maxSize = newMaxSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__MAX_SIZE, oldMaxSize, maxSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewType(DataType newNewType, NotificationChain msgs) {
		DataType oldNewType = newType;
		newType = newNewType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE, oldNewType, newNewType);
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
	public void setNewType(DataType newNewType) {
		if (newNewType != newType) {
			NotificationChain msgs = null;
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE, null, msgs);
			if (newNewType != null)
				msgs = ((InternalEObject)newNewType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE, null, msgs);
			msgs = basicSetNewType(newNewType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE, newNewType, newNewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				return basicSetNewType(null, msgs);
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
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__MAX_SIZE:
				return getMaxSize();
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				return getNewType();
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
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__MAX_SIZE:
				setMaxSize((Integer)newValue);
				return;
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				setNewType((DataType)newValue);
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
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__MAX_SIZE:
				setMaxSize(MAX_SIZE_EDEFAULT);
				return;
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				setNewType((DataType)null);
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
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__MAX_SIZE:
				return maxSize != MAX_SIZE_EDEFAULT;
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE__NEW_TYPE:
				return newType != null;
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
		result.append(" (maxSize: ");
		result.append(maxSize);
		result.append(')');
		return result.toString();
	}

} //ChangePrimitiveDataTypeAttributeImpl
