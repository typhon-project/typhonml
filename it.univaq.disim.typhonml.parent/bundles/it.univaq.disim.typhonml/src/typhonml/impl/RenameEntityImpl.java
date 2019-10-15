/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Entity;
import typhonml.RenameEntity;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RenameEntityImpl#getEntityToRename <em>Entity To Rename</em>}</li>
 *   <li>{@link typhonml.impl.RenameEntityImpl#getNewEntityName <em>New Entity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameEntityImpl extends ChangeOperatorImpl implements RenameEntity {
	/**
	 * The cached value of the '{@link #getEntityToRename() <em>Entity To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityToRename()
	 * @generated
	 * @ordered
	 */
	protected Entity entityToRename;

	/**
	 * The default value of the '{@link #getNewEntityName() <em>New Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEntityName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ENTITY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewEntityName() <em>New Entity Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEntityName()
	 * @generated
	 * @ordered
	 */
	protected String newEntityName = NEW_ENTITY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.RENAME_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntityToRename() {
		if (entityToRename != null && entityToRename.eIsProxy()) {
			InternalEObject oldEntityToRename = (InternalEObject)entityToRename;
			entityToRename = (Entity)eResolveProxy(oldEntityToRename);
			if (entityToRename != oldEntityToRename) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RENAME_ENTITY__ENTITY_TO_RENAME, oldEntityToRename, entityToRename));
			}
		}
		return entityToRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntityToRename() {
		return entityToRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntityToRename(Entity newEntityToRename) {
		Entity oldEntityToRename = entityToRename;
		entityToRename = newEntityToRename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_ENTITY__ENTITY_TO_RENAME, oldEntityToRename, entityToRename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewEntityName() {
		return newEntityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewEntityName(String newNewEntityName) {
		String oldNewEntityName = newEntityName;
		newEntityName = newNewEntityName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_ENTITY__NEW_ENTITY_NAME, oldNewEntityName, newEntityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.RENAME_ENTITY__ENTITY_TO_RENAME:
				if (resolve) return getEntityToRename();
				return basicGetEntityToRename();
			case TyphonmlPackage.RENAME_ENTITY__NEW_ENTITY_NAME:
				return getNewEntityName();
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
			case TyphonmlPackage.RENAME_ENTITY__ENTITY_TO_RENAME:
				setEntityToRename((Entity)newValue);
				return;
			case TyphonmlPackage.RENAME_ENTITY__NEW_ENTITY_NAME:
				setNewEntityName((String)newValue);
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
			case TyphonmlPackage.RENAME_ENTITY__ENTITY_TO_RENAME:
				setEntityToRename((Entity)null);
				return;
			case TyphonmlPackage.RENAME_ENTITY__NEW_ENTITY_NAME:
				setNewEntityName(NEW_ENTITY_NAME_EDEFAULT);
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
			case TyphonmlPackage.RENAME_ENTITY__ENTITY_TO_RENAME:
				return entityToRename != null;
			case TyphonmlPackage.RENAME_ENTITY__NEW_ENTITY_NAME:
				return NEW_ENTITY_NAME_EDEFAULT == null ? newEntityName != null : !NEW_ENTITY_NAME_EDEFAULT.equals(newEntityName);
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
		result.append(" (newEntityName: ");
		result.append(newEntityName);
		result.append(')');
		return result.toString();
	}

} //RenameEntityImpl
