/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Relation;
import typhonml.RenameRelation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RenameRelationImpl#getRelationToRename <em>Relation To Rename</em>}</li>
 *   <li>{@link typhonml.impl.RenameRelationImpl#getNewRelationName <em>New Relation Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameRelationImpl extends ChangeOperatorImpl implements RenameRelation {
	/**
	 * The cached value of the '{@link #getRelationToRename() <em>Relation To Rename</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationToRename()
	 * @generated
	 * @ordered
	 */
	protected Relation relationToRename;

	/**
	 * The default value of the '{@link #getNewRelationName() <em>New Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRelationName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_RELATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewRelationName() <em>New Relation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewRelationName()
	 * @generated
	 * @ordered
	 */
	protected String newRelationName = NEW_RELATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.RENAME_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelationToRename() {
		if (relationToRename != null && relationToRename.eIsProxy()) {
			InternalEObject oldRelationToRename = (InternalEObject)relationToRename;
			relationToRename = (Relation)eResolveProxy(oldRelationToRename);
			if (relationToRename != oldRelationToRename) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RENAME_RELATION__RELATION_TO_RENAME, oldRelationToRename, relationToRename));
			}
		}
		return relationToRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelationToRename() {
		return relationToRename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationToRename(Relation newRelationToRename) {
		Relation oldRelationToRename = relationToRename;
		relationToRename = newRelationToRename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_RELATION__RELATION_TO_RENAME, oldRelationToRename, relationToRename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewRelationName() {
		return newRelationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewRelationName(String newNewRelationName) {
		String oldNewRelationName = newRelationName;
		newRelationName = newNewRelationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RENAME_RELATION__NEW_RELATION_NAME, oldNewRelationName, newRelationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.RENAME_RELATION__RELATION_TO_RENAME:
				if (resolve) return getRelationToRename();
				return basicGetRelationToRename();
			case TyphonmlPackage.RENAME_RELATION__NEW_RELATION_NAME:
				return getNewRelationName();
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
			case TyphonmlPackage.RENAME_RELATION__RELATION_TO_RENAME:
				setRelationToRename((Relation)newValue);
				return;
			case TyphonmlPackage.RENAME_RELATION__NEW_RELATION_NAME:
				setNewRelationName((String)newValue);
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
			case TyphonmlPackage.RENAME_RELATION__RELATION_TO_RENAME:
				setRelationToRename((Relation)null);
				return;
			case TyphonmlPackage.RENAME_RELATION__NEW_RELATION_NAME:
				setNewRelationName(NEW_RELATION_NAME_EDEFAULT);
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
			case TyphonmlPackage.RENAME_RELATION__RELATION_TO_RENAME:
				return relationToRename != null;
			case TyphonmlPackage.RENAME_RELATION__NEW_RELATION_NAME:
				return NEW_RELATION_NAME_EDEFAULT == null ? newRelationName != null : !NEW_RELATION_NAME_EDEFAULT.equals(newRelationName);
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
		result.append(" (newRelationName: ");
		result.append(newRelationName);
		result.append(')');
		return result.toString();
	}

} //RenameRelationImpl
