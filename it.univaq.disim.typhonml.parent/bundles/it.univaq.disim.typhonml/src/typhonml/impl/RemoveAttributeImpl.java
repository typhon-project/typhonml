/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Attribute;
import typhonml.RemoveAttribute;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RemoveAttributeImpl#getAttributeToRemove <em>Attribute To Remove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveAttributeImpl extends ChangeOperatorImpl implements RemoveAttribute {
	/**
	 * The cached value of the '{@link #getAttributeToRemove() <em>Attribute To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToRemove()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToRemove;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.REMOVE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttributeToRemove() {
		if (attributeToRemove != null && attributeToRemove.eIsProxy()) {
			InternalEObject oldAttributeToRemove = (InternalEObject)attributeToRemove;
			attributeToRemove = (Attribute)eResolveProxy(oldAttributeToRemove);
			if (attributeToRemove != oldAttributeToRemove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE, oldAttributeToRemove, attributeToRemove));
			}
		}
		return attributeToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToRemove() {
		return attributeToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttributeToRemove(Attribute newAttributeToRemove) {
		Attribute oldAttributeToRemove = attributeToRemove;
		attributeToRemove = newAttributeToRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE, oldAttributeToRemove, attributeToRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE:
				if (resolve) return getAttributeToRemove();
				return basicGetAttributeToRemove();
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
			case TyphonmlPackage.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE:
				setAttributeToRemove((Attribute)newValue);
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
			case TyphonmlPackage.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE:
				setAttributeToRemove((Attribute)null);
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
			case TyphonmlPackage.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE:
				return attributeToRemove != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoveAttributeImpl
