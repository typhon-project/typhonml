/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import typhonml.EntityIdentifier;
import typhonml.RemoveIdentifier;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RemoveIdentifierImpl#getEntityIdentifier <em>Entity Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveIdentifierImpl extends ChangeOperatorImpl implements RemoveIdentifier {
	/**
	 * The cached value of the '{@link #getEntityIdentifier() <em>Entity Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EntityIdentifier entityIdentifier;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.REMOVE_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityIdentifier getEntityIdentifier() {
		if (entityIdentifier != null && entityIdentifier.eIsProxy()) {
			InternalEObject oldEntityIdentifier = (InternalEObject)entityIdentifier;
			entityIdentifier = (EntityIdentifier)eResolveProxy(oldEntityIdentifier);
			if (entityIdentifier != oldEntityIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.REMOVE_IDENTIFIER__ENTITY_IDENTIFIER, oldEntityIdentifier, entityIdentifier));
			}
		}
		return entityIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityIdentifier basicGetEntityIdentifier() {
		return entityIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityIdentifier(EntityIdentifier newEntityIdentifier) {
		EntityIdentifier oldEntityIdentifier = entityIdentifier;
		entityIdentifier = newEntityIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.REMOVE_IDENTIFIER__ENTITY_IDENTIFIER, oldEntityIdentifier, entityIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.REMOVE_IDENTIFIER__ENTITY_IDENTIFIER:
				if (resolve) return getEntityIdentifier();
				return basicGetEntityIdentifier();
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
			case TyphonmlPackage.REMOVE_IDENTIFIER__ENTITY_IDENTIFIER:
				setEntityIdentifier((EntityIdentifier)newValue);
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
			case TyphonmlPackage.REMOVE_IDENTIFIER__ENTITY_IDENTIFIER:
				setEntityIdentifier((EntityIdentifier)null);
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
			case TyphonmlPackage.REMOVE_IDENTIFIER__ENTITY_IDENTIFIER:
				return entityIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoveIdentifierImpl
