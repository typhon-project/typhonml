/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Attribute;
import typhonml.RenameAttribute;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RenameAttributeImpl#getAttributeToRename <em>Attribute To Rename</em>}</li>
 *   <li>{@link typhonml.impl.RenameAttributeImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameAttributeImpl extends ChangeOperatorImpl implements RenameAttribute {
	/**
	 * The cached value of the '{@link #getAttributeToRename() <em>Attribute To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToRename()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToRename;

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
	protected RenameAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.RENAME_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToRename() {
		if (attributeToRename != null && attributeToRename.eIsProxy()) {
			InternalEObject oldAttributeToRename = (InternalEObject)attributeToRename;
			attributeToRename = (Attribute)eResolveProxy(oldAttributeToRename);
			if (attributeToRename != oldAttributeToRename) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME, oldAttributeToRename, attributeToRename));
			}
		}
		return attributeToRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToRename() {
		return attributeToRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToRename(Attribute newAttributeToRename) {
		Attribute oldAttributeToRename = attributeToRename;
		attributeToRename = newAttributeToRename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME, oldAttributeToRename, attributeToRename));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_ATTRIBUTE__NEW_NAME, oldNewName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME:
				if (resolve) return getAttributeToRename();
				return basicGetAttributeToRename();
			case TyphonmlPackage.RENAME_ATTRIBUTE__NEW_NAME:
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
			case TyphonmlPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME:
				setAttributeToRename((Attribute)newValue);
				return;
			case TyphonmlPackage.RENAME_ATTRIBUTE__NEW_NAME:
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
			case TyphonmlPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME:
				setAttributeToRename((Attribute)null);
				return;
			case TyphonmlPackage.RENAME_ATTRIBUTE__NEW_NAME:
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
			case TyphonmlPackage.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME:
				return attributeToRename != null;
			case TyphonmlPackage.RENAME_ATTRIBUTE__NEW_NAME:
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (newName: ");
		result.append(newName);
		result.append(')');
		return result.toString();
	}

} //RenameAttributeImpl
