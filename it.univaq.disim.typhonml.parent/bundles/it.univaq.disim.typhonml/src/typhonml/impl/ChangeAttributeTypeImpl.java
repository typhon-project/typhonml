/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Attribute;
import typhonml.ChangeAttributeType;
import typhonml.PrimitiveDataType;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.ChangeAttributeTypeImpl#getAttributeToChange <em>Attribute To Change</em>}</li>
 *   <li>{@link typhonml.impl.ChangeAttributeTypeImpl#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeAttributeTypeImpl extends ChangeOperatorImpl implements ChangeAttributeType {
	/**
	 * The cached value of the '{@link #getAttributeToChange() <em>Attribute To Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToChange()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToChange;

	/**
	 * The default value of the '{@link #getNewType() <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveDataType NEW_TYPE_EDEFAULT = PrimitiveDataType.BIGINT;

	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveDataType newType = NEW_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeAttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.CHANGE_ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttributeToChange() {
		if (attributeToChange != null && attributeToChange.eIsProxy()) {
			InternalEObject oldAttributeToChange = (InternalEObject)attributeToChange;
			attributeToChange = (Attribute)eResolveProxy(oldAttributeToChange);
			if (attributeToChange != oldAttributeToChange) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE, oldAttributeToChange, attributeToChange));
			}
		}
		return attributeToChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToChange() {
		return attributeToChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeToChange(Attribute newAttributeToChange) {
		Attribute oldAttributeToChange = attributeToChange;
		attributeToChange = newAttributeToChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE, oldAttributeToChange, attributeToChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveDataType getNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewType(PrimitiveDataType newNewType) {
		PrimitiveDataType oldNewType = newType;
		newType = newNewType == null ? NEW_TYPE_EDEFAULT : newNewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__NEW_TYPE, oldNewType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE:
				if (resolve) return getAttributeToChange();
				return basicGetAttributeToChange();
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__NEW_TYPE:
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
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE:
				setAttributeToChange((Attribute)newValue);
				return;
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__NEW_TYPE:
				setNewType((PrimitiveDataType)newValue);
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
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE:
				setAttributeToChange((Attribute)null);
				return;
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__NEW_TYPE:
				setNewType(NEW_TYPE_EDEFAULT);
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
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE:
				return attributeToChange != null;
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE__NEW_TYPE:
				return newType != NEW_TYPE_EDEFAULT;
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
		result.append(" (newType: ");
		result.append(newType);
		result.append(')');
		return result.toString();
	}

} //ChangeAttributeTypeImpl
