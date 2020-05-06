/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.ChangeRelationContainement;
import typhonml.Relation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Relation Containement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.ChangeRelationContainementImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link typhonml.impl.ChangeRelationContainementImpl#isNewContainment <em>New Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeRelationContainementImpl extends ChangeOperatorImpl implements ChangeRelationContainement {
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
	 * The default value of the '{@link #isNewContainment() <em>New Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_CONTAINMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNewContainment() <em>New Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewContainment()
	 * @generated
	 * @ordered
	 */
	protected boolean newContainment = NEW_CONTAINMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeRelationContainementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.CHANGE_RELATION_CONTAINEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getRelation() {
		if (relation != null && relation.eIsProxy()) {
			InternalEObject oldRelation = (InternalEObject)relation;
			relation = (Relation)eResolveProxy(oldRelation);
			if (relation != oldRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__RELATION, oldRelation, relation));
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
	@Override
	public void setRelation(Relation newRelation) {
		Relation oldRelation = relation;
		relation = newRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__RELATION, oldRelation, relation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNewContainment() {
		return newContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewContainment(boolean newNewContainment) {
		boolean oldNewContainment = newContainment;
		newContainment = newNewContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT, oldNewContainment, newContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__RELATION:
				if (resolve) return getRelation();
				return basicGetRelation();
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT:
				return isNewContainment();
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
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__RELATION:
				setRelation((Relation)newValue);
				return;
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT:
				setNewContainment((Boolean)newValue);
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
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__RELATION:
				setRelation((Relation)null);
				return;
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT:
				setNewContainment(NEW_CONTAINMENT_EDEFAULT);
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
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__RELATION:
				return relation != null;
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT:
				return newContainment != NEW_CONTAINMENT_EDEFAULT;
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
		result.append(" (newContainment: ");
		result.append(newContainment);
		result.append(')');
		return result.toString();
	}

} //ChangeRelationContainementImpl
