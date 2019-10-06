/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Database;
import typhonml.Entity;
import typhonml.IdSpec;
import typhonml.IndexSpec;
import typhonml.Table;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.TableImpl#getIndexSpec <em>Index Spec</em>}</li>
 *   <li>{@link typhonml.impl.TableImpl#getIdSpec <em>Id Spec</em>}</li>
 *   <li>{@link typhonml.impl.TableImpl#getDb <em>Db</em>}</li>
 *   <li>{@link typhonml.impl.TableImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends NamedElementImpl implements Table {
	/**
	 * The cached value of the '{@link #getIndexSpec() <em>Index Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexSpec()
	 * @generated
	 * @ordered
	 */
	protected IndexSpec indexSpec;

	/**
	 * The cached value of the '{@link #getIdSpec() <em>Id Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdSpec()
	 * @generated
	 * @ordered
	 */
	protected IdSpec idSpec;

	/**
	 * The cached value of the '{@link #getDb() <em>Db</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb()
	 * @generated
	 * @ordered
	 */
	protected Database db;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexSpec getIndexSpec() {
		return indexSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndexSpec(IndexSpec newIndexSpec, NotificationChain msgs) {
		IndexSpec oldIndexSpec = indexSpec;
		indexSpec = newIndexSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.TABLE__INDEX_SPEC, oldIndexSpec, newIndexSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexSpec(IndexSpec newIndexSpec) {
		if (newIndexSpec != indexSpec) {
			NotificationChain msgs = null;
			if (indexSpec != null)
				msgs = ((InternalEObject)indexSpec).eInverseRemove(this, TyphonmlPackage.INDEX_SPEC__TABLE, IndexSpec.class, msgs);
			if (newIndexSpec != null)
				msgs = ((InternalEObject)newIndexSpec).eInverseAdd(this, TyphonmlPackage.INDEX_SPEC__TABLE, IndexSpec.class, msgs);
			msgs = basicSetIndexSpec(newIndexSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.TABLE__INDEX_SPEC, newIndexSpec, newIndexSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdSpec getIdSpec() {
		return idSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdSpec(IdSpec newIdSpec, NotificationChain msgs) {
		IdSpec oldIdSpec = idSpec;
		idSpec = newIdSpec;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.TABLE__ID_SPEC, oldIdSpec, newIdSpec);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdSpec(IdSpec newIdSpec) {
		if (newIdSpec != idSpec) {
			NotificationChain msgs = null;
			if (idSpec != null)
				msgs = ((InternalEObject)idSpec).eInverseRemove(this, TyphonmlPackage.ID_SPEC__TABLE, IdSpec.class, msgs);
			if (newIdSpec != null)
				msgs = ((InternalEObject)newIdSpec).eInverseAdd(this, TyphonmlPackage.ID_SPEC__TABLE, IdSpec.class, msgs);
			msgs = basicSetIdSpec(newIdSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.TABLE__ID_SPEC, newIdSpec, newIdSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDb() {
		if (db != null && db.eIsProxy()) {
			InternalEObject oldDb = (InternalEObject)db;
			db = (Database)eResolveProxy(oldDb);
			if (db != oldDb) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.TABLE__DB, oldDb, db));
			}
		}
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database basicGetDb() {
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDb(Database newDb) {
		Database oldDb = db;
		db = newDb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.TABLE__DB, oldDb, db));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.TABLE__ENTITY, oldEntity, entity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.TABLE__ENTITY, oldEntity, entity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.TABLE__INDEX_SPEC:
				if (indexSpec != null)
					msgs = ((InternalEObject)indexSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.TABLE__INDEX_SPEC, null, msgs);
				return basicSetIndexSpec((IndexSpec)otherEnd, msgs);
			case TyphonmlPackage.TABLE__ID_SPEC:
				if (idSpec != null)
					msgs = ((InternalEObject)idSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.TABLE__ID_SPEC, null, msgs);
				return basicSetIdSpec((IdSpec)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.TABLE__INDEX_SPEC:
				return basicSetIndexSpec(null, msgs);
			case TyphonmlPackage.TABLE__ID_SPEC:
				return basicSetIdSpec(null, msgs);
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
			case TyphonmlPackage.TABLE__INDEX_SPEC:
				return getIndexSpec();
			case TyphonmlPackage.TABLE__ID_SPEC:
				return getIdSpec();
			case TyphonmlPackage.TABLE__DB:
				if (resolve) return getDb();
				return basicGetDb();
			case TyphonmlPackage.TABLE__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case TyphonmlPackage.TABLE__INDEX_SPEC:
				setIndexSpec((IndexSpec)newValue);
				return;
			case TyphonmlPackage.TABLE__ID_SPEC:
				setIdSpec((IdSpec)newValue);
				return;
			case TyphonmlPackage.TABLE__DB:
				setDb((Database)newValue);
				return;
			case TyphonmlPackage.TABLE__ENTITY:
				setEntity((Entity)newValue);
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
			case TyphonmlPackage.TABLE__INDEX_SPEC:
				setIndexSpec((IndexSpec)null);
				return;
			case TyphonmlPackage.TABLE__ID_SPEC:
				setIdSpec((IdSpec)null);
				return;
			case TyphonmlPackage.TABLE__DB:
				setDb((Database)null);
				return;
			case TyphonmlPackage.TABLE__ENTITY:
				setEntity((Entity)null);
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
			case TyphonmlPackage.TABLE__INDEX_SPEC:
				return indexSpec != null;
			case TyphonmlPackage.TABLE__ID_SPEC:
				return idSpec != null;
			case TyphonmlPackage.TABLE__DB:
				return db != null;
			case TyphonmlPackage.TABLE__ENTITY:
				return entity != null;
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
