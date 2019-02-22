/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.EntityIdentifier;
import typhonml.RenameIdentifier;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RenameIdentifierImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link typhonml.impl.RenameIdentifierImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameIdentifierImpl extends ChangeOperatorImpl implements RenameIdentifier {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EntityIdentifier identifier;

	/**
	 * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected String newName = NEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.RENAME_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityIdentifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (EntityIdentifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RENAME_IDENTIFIER__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityIdentifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(EntityIdentifier newIdentifier) {
		EntityIdentifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_IDENTIFIER__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewName() {
		return newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewName(String newNewName) {
		String oldNewName = newName;
		newName = newNewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_IDENTIFIER__NEW_NAME, oldNewName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.RENAME_IDENTIFIER__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case TyphonmlPackage.RENAME_IDENTIFIER__NEW_NAME:
				return getNewName();
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
			case TyphonmlPackage.RENAME_IDENTIFIER__IDENTIFIER:
				setIdentifier((EntityIdentifier)newValue);
				return;
			case TyphonmlPackage.RENAME_IDENTIFIER__NEW_NAME:
				setNewName((String)newValue);
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
			case TyphonmlPackage.RENAME_IDENTIFIER__IDENTIFIER:
				setIdentifier((EntityIdentifier)null);
				return;
			case TyphonmlPackage.RENAME_IDENTIFIER__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
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
			case TyphonmlPackage.RENAME_IDENTIFIER__IDENTIFIER:
				return identifier != null;
			case TyphonmlPackage.RENAME_IDENTIFIER__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
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
		result.append(" (newName: ");
		result.append(newName);
		result.append(')');
		return result.toString();
	}

} //RenameIdentifierImpl
