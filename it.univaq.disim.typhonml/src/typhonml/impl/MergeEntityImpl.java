/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Entity;
import typhonml.MergeEntity;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.MergeEntityImpl#getFirstEntityToMerge <em>First Entity To Merge</em>}</li>
 *   <li>{@link typhonml.impl.MergeEntityImpl#getSecondEntityToMerge <em>Second Entity To Merge</em>}</li>
 *   <li>{@link typhonml.impl.MergeEntityImpl#getNewEntityName <em>New Entity Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeEntityImpl extends ChangeOperatorImpl implements MergeEntity {
	/**
	 * The cached value of the '{@link #getFirstEntityToMerge() <em>First Entity To Merge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstEntityToMerge()
	 * @generated
	 * @ordered
	 */
	protected Entity firstEntityToMerge;

	/**
	 * The cached value of the '{@link #getSecondEntityToMerge() <em>Second Entity To Merge</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondEntityToMerge()
	 * @generated
	 * @ordered
	 */
	protected Entity secondEntityToMerge;

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
	protected MergeEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.MERGE_ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getFirstEntityToMerge() {
		if (firstEntityToMerge != null && firstEntityToMerge.eIsProxy()) {
			InternalEObject oldFirstEntityToMerge = (InternalEObject)firstEntityToMerge;
			firstEntityToMerge = (Entity)eResolveProxy(oldFirstEntityToMerge);
			if (firstEntityToMerge != oldFirstEntityToMerge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.MERGE_ENTITY__FIRST_ENTITY_TO_MERGE, oldFirstEntityToMerge, firstEntityToMerge));
			}
		}
		return firstEntityToMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetFirstEntityToMerge() {
		return firstEntityToMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFirstEntityToMerge(Entity newFirstEntityToMerge) {
		Entity oldFirstEntityToMerge = firstEntityToMerge;
		firstEntityToMerge = newFirstEntityToMerge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.MERGE_ENTITY__FIRST_ENTITY_TO_MERGE, oldFirstEntityToMerge, firstEntityToMerge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getSecondEntityToMerge() {
		if (secondEntityToMerge != null && secondEntityToMerge.eIsProxy()) {
			InternalEObject oldSecondEntityToMerge = (InternalEObject)secondEntityToMerge;
			secondEntityToMerge = (Entity)eResolveProxy(oldSecondEntityToMerge);
			if (secondEntityToMerge != oldSecondEntityToMerge) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.MERGE_ENTITY__SECOND_ENTITY_TO_MERGE, oldSecondEntityToMerge, secondEntityToMerge));
			}
		}
		return secondEntityToMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSecondEntityToMerge() {
		return secondEntityToMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecondEntityToMerge(Entity newSecondEntityToMerge) {
		Entity oldSecondEntityToMerge = secondEntityToMerge;
		secondEntityToMerge = newSecondEntityToMerge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.MERGE_ENTITY__SECOND_ENTITY_TO_MERGE, oldSecondEntityToMerge, secondEntityToMerge));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.MERGE_ENTITY__NEW_ENTITY_NAME, oldNewEntityName, newEntityName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.MERGE_ENTITY__FIRST_ENTITY_TO_MERGE:
				if (resolve) return getFirstEntityToMerge();
				return basicGetFirstEntityToMerge();
			case TyphonmlPackage.MERGE_ENTITY__SECOND_ENTITY_TO_MERGE:
				if (resolve) return getSecondEntityToMerge();
				return basicGetSecondEntityToMerge();
			case TyphonmlPackage.MERGE_ENTITY__NEW_ENTITY_NAME:
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
			case TyphonmlPackage.MERGE_ENTITY__FIRST_ENTITY_TO_MERGE:
				setFirstEntityToMerge((Entity)newValue);
				return;
			case TyphonmlPackage.MERGE_ENTITY__SECOND_ENTITY_TO_MERGE:
				setSecondEntityToMerge((Entity)newValue);
				return;
			case TyphonmlPackage.MERGE_ENTITY__NEW_ENTITY_NAME:
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
			case TyphonmlPackage.MERGE_ENTITY__FIRST_ENTITY_TO_MERGE:
				setFirstEntityToMerge((Entity)null);
				return;
			case TyphonmlPackage.MERGE_ENTITY__SECOND_ENTITY_TO_MERGE:
				setSecondEntityToMerge((Entity)null);
				return;
			case TyphonmlPackage.MERGE_ENTITY__NEW_ENTITY_NAME:
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
			case TyphonmlPackage.MERGE_ENTITY__FIRST_ENTITY_TO_MERGE:
				return firstEntityToMerge != null;
			case TyphonmlPackage.MERGE_ENTITY__SECOND_ENTITY_TO_MERGE:
				return secondEntityToMerge != null;
			case TyphonmlPackage.MERGE_ENTITY__NEW_ENTITY_NAME:
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

} //MergeEntityImpl
