/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Cardinality;
import typhonml.ChangeRelationCardinality;
import typhonml.Relation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Relation Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.ChangeRelationCardinalityImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link typhonml.impl.ChangeRelationCardinalityImpl#getNewCardinality <em>New Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeRelationCardinalityImpl extends ChangeOperatorImpl implements ChangeRelationCardinality {
	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation relation;

	/**
	 * The default value of the '{@link #getNewCardinality() <em>New Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality NEW_CARDINALITY_EDEFAULT = Cardinality.ZERO_ONE;

	/**
	 * The cached value of the '{@link #getNewCardinality() <em>New Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality newCardinality = NEW_CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeRelationCardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.CHANGE_RELATION_CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (Relation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.CHANGE_RELATION_CARDINALITY__RELATION, oldRelation, relation));
			}
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetRelation() {
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelation(Relation newRelation) {
		Relation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_RELATION_CARDINALITY__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getNewCardinality() {
		return newCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewCardinality(Cardinality newNewCardinality) {
		Cardinality oldNewCardinality = newCardinality;
		newCardinality = newNewCardinality == null ? NEW_CARDINALITY_EDEFAULT : newNewCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY, oldNewCardinality, newCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY:
				return getNewCardinality();
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
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__RELATION:
				setRelation((Relation)newValue);
				return;
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY:
				setNewCardinality((Cardinality)newValue);
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
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__RELATION:
				setRelation((Relation)null);
				return;
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY:
				setNewCardinality(NEW_CARDINALITY_EDEFAULT);
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
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__RELATION:
				return relation != null;
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY:
				return newCardinality != NEW_CARDINALITY_EDEFAULT;
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
		result.append(" (newCardinality: ");
		result.append(newCardinality);
		result.append(')');
		return result.toString();
	}

} //ChangeRelationCardinalityImpl
