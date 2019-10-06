/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Relation;
import typhonml.RemoveRelation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RemoveRelationImpl#getRelationToRemove <em>Relation To Remove</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveRelationImpl extends ChangeOperatorImpl implements RemoveRelation {
	/**
	 * The cached value of the '{@link #getRelationToRemove() <em>Relation To Remove</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationToRemove()
	 * @generated
	 * @ordered
	 */
	protected Relation relationToRemove;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.REMOVE_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelationToRemove() {
		if (relationToRemove != null && relationToRemove.eIsProxy()) {
			InternalEObject oldRelationToRemove = (InternalEObject)relationToRemove;
			relationToRemove = (Relation)eResolveProxy(oldRelationToRemove);
			if (relationToRemove != oldRelationToRemove) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.REMOVE_RELATION__RELATION_TO_REMOVE, oldRelationToRemove, relationToRemove));
			}
		}
		return relationToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelationToRemove() {
		return relationToRemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationToRemove(Relation newRelationToRemove) {
		Relation oldRelationToRemove = relationToRemove;
		relationToRemove = newRelationToRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.REMOVE_RELATION__RELATION_TO_REMOVE, oldRelationToRemove, relationToRemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.REMOVE_RELATION__RELATION_TO_REMOVE:
				if (resolve) return getRelationToRemove();
				return basicGetRelationToRemove();
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
			case TyphonmlPackage.REMOVE_RELATION__RELATION_TO_REMOVE:
				setRelationToRemove((Relation)newValue);
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
			case TyphonmlPackage.REMOVE_RELATION__RELATION_TO_REMOVE:
				setRelationToRemove((Relation)null);
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
			case TyphonmlPackage.REMOVE_RELATION__RELATION_TO_REMOVE:
				return relationToRemove != null;
		}
		return super.eIsSet(featureID);
	}

} //RemoveRelationImpl
