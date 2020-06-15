/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.AddAttribute;
import typhonml.Entity;
import typhonml.EntityAttributeKind;
import typhonml.NamedElement;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.AddAttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link typhonml.impl.AddAttributeImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link typhonml.impl.AddAttributeImpl#getOwnerEntity <em>Owner Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AddAttributeImpl extends ChangeOperatorImpl implements AddAttribute {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_ATTRIBUTE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImportedNamespace() {
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedNamespace(String newImportedNamespace) {
		String oldImportedNamespace = importedNamespace;
		importedNamespace = newImportedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
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
			case TyphonmlPackage.ADD_ATTRIBUTE__NAME:
				return getName();
			case TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE:
				return getImportedNamespace();
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
			case TyphonmlPackage.ADD_ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE:
				setImportedNamespace((String)newValue);
				return;
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
			case TyphonmlPackage.ADD_ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE:
				setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
				return;
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
			case TyphonmlPackage.ADD_ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE:
				return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
			case TyphonmlPackage.ADD_ATTRIBUTE__OWNER_ENTITY:
				return ownerEntity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case TyphonmlPackage.ADD_ATTRIBUTE__NAME: return TyphonmlPackage.NAMED_ELEMENT__NAME;
				case TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE: return TyphonmlPackage.NAMED_ELEMENT__IMPORTED_NAMESPACE;
				default: return -1;
			}
		}
		if (baseClass == EntityAttributeKind.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case TyphonmlPackage.NAMED_ELEMENT__NAME: return TyphonmlPackage.ADD_ATTRIBUTE__NAME;
				case TyphonmlPackage.NAMED_ELEMENT__IMPORTED_NAMESPACE: return TyphonmlPackage.ADD_ATTRIBUTE__IMPORTED_NAMESPACE;
				default: return -1;
			}
		}
		if (baseClass == EntityAttributeKind.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", importedNamespace: ");
		result.append(importedNamespace);
		result.append(')');
		return result.toString();
	}

} //AddAttributeImpl
