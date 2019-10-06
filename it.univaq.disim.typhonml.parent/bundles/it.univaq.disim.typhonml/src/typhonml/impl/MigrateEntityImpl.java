/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Database;
import typhonml.Entity;
import typhonml.MigrateEntity;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Migrate Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.MigrateEntityImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link typhonml.impl.MigrateEntityImpl#getNewDatabase <em>New Database</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MigrateEntityImpl extends ChangeOperatorImpl implements MigrateEntity {
	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * The cached value of the '{@link #getNewDatabase() <em>New Database</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database newDatabase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MigrateEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.MIGRATE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Entity)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.MIGRATE_ENTITY__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.MIGRATE_ENTITY__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getNewDatabase() {
		if (newDatabase != null && newDatabase.eIsProxy()) {
			InternalEObject oldNewDatabase = (InternalEObject)newDatabase;
			newDatabase = (Database)eResolveProxy(oldNewDatabase);
			if (newDatabase != oldNewDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.MIGRATE_ENTITY__NEW_DATABASE, oldNewDatabase, newDatabase));
			}
		}
		return newDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetNewDatabase() {
		return newDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDatabase(Database newNewDatabase) {
		Database oldNewDatabase = newDatabase;
		newDatabase = newNewDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.MIGRATE_ENTITY__NEW_DATABASE, oldNewDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.MIGRATE_ENTITY__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
			case TyphonmlPackage.MIGRATE_ENTITY__NEW_DATABASE:
				if (resolve) return getNewDatabase();
				return basicGetNewDatabase();
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
			case TyphonmlPackage.MIGRATE_ENTITY__ENTITY:
				setEntity((Entity)newValue);
				return;
			case TyphonmlPackage.MIGRATE_ENTITY__NEW_DATABASE:
				setNewDatabase((Database)newValue);
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
			case TyphonmlPackage.MIGRATE_ENTITY__ENTITY:
				setEntity((Entity)null);
				return;
			case TyphonmlPackage.MIGRATE_ENTITY__NEW_DATABASE:
				setNewDatabase((Database)null);
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
			case TyphonmlPackage.MIGRATE_ENTITY__ENTITY:
				return entity != null;
			case TyphonmlPackage.MIGRATE_ENTITY__NEW_DATABASE:
				return newDatabase != null;
		}
		return super.eIsSet(featureID);
	}

} //MigrateEntityImpl
