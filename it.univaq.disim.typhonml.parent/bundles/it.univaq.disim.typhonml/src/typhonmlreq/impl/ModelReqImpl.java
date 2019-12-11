/**
 */
package typhonmlreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonmlreq.DBType;
import typhonmlreq.ModelReq;
import typhonmlreq.TyphonmlreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonmlreq.impl.ModelReqImpl#getDbTypes <em>Db Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelReqImpl extends MinimalEObjectImpl.Container implements ModelReq {
	/**
	 * The cached value of the '{@link #getDbTypes() <em>Db Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DBType> dbTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlreqPackage.Literals.MODEL_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DBType> getDbTypes() {
		if (dbTypes == null) {
			dbTypes = new EObjectContainmentEList<DBType>(DBType.class, this, TyphonmlreqPackage.MODEL_REQ__DB_TYPES);
		}
		return dbTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlreqPackage.MODEL_REQ__DB_TYPES:
				return ((InternalEList<?>)getDbTypes()).basicRemove(otherEnd, msgs);
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
			case TyphonmlreqPackage.MODEL_REQ__DB_TYPES:
				return getDbTypes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyphonmlreqPackage.MODEL_REQ__DB_TYPES:
				getDbTypes().clear();
				getDbTypes().addAll((Collection<? extends DBType>)newValue);
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
			case TyphonmlreqPackage.MODEL_REQ__DB_TYPES:
				getDbTypes().clear();
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
			case TyphonmlreqPackage.MODEL_REQ__DB_TYPES:
				return dbTypes != null && !dbTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelReqImpl
