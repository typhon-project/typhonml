/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Cardinality;
import typhonml.Entity;
import typhonml.Relation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link typhonml.impl.RelationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link typhonml.impl.RelationImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link typhonml.impl.RelationImpl#getIsContainment <em>Is Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationImpl extends NamedElementImpl implements Relation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Entity type;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Cardinality CARDINALITY_EDEFAULT = Cardinality.ZERO_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOpposite() <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpposite()
	 * @generated
	 * @ordered
	 */
	protected Relation opposite;

	/**
	 * The default value of the '{@link #getIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContainment()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_CONTAINMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsContainment() <em>Is Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsContainment()
	 * @generated
	 * @ordered
	 */
	protected Boolean isContainment = IS_CONTAINMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Entity)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RELATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Entity newType) {
		Entity oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RELATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Cardinality newCardinality) {
		Cardinality oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RELATION__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation getOpposite() {
		if (opposite != null && opposite.eIsProxy()) {
			InternalEObject oldOpposite = (InternalEObject)opposite;
			opposite = (Relation)eResolveProxy(oldOpposite);
			if (opposite != oldOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.RELATION__OPPOSITE, oldOpposite, opposite));
			}
		}
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetOpposite() {
		return opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Relation newOpposite) {
		Relation oldOpposite = opposite;
		opposite = newOpposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RELATION__OPPOSITE, oldOpposite, opposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsContainment() {
		return isContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsContainment(Boolean newIsContainment) {
		Boolean oldIsContainment = isContainment;
		isContainment = newIsContainment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.RELATION__IS_CONTAINMENT, oldIsContainment, isContainment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.RELATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case TyphonmlPackage.RELATION__CARDINALITY:
				return getCardinality();
			case TyphonmlPackage.RELATION__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case TyphonmlPackage.RELATION__IS_CONTAINMENT:
				return getIsContainment();
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
			case TyphonmlPackage.RELATION__TYPE:
				setType((Entity)newValue);
				return;
			case TyphonmlPackage.RELATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case TyphonmlPackage.RELATION__OPPOSITE:
				setOpposite((Relation)newValue);
				return;
			case TyphonmlPackage.RELATION__IS_CONTAINMENT:
				setIsContainment((Boolean)newValue);
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
			case TyphonmlPackage.RELATION__TYPE:
				setType((Entity)null);
				return;
			case TyphonmlPackage.RELATION__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
				return;
			case TyphonmlPackage.RELATION__OPPOSITE:
				setOpposite((Relation)null);
				return;
			case TyphonmlPackage.RELATION__IS_CONTAINMENT:
				setIsContainment(IS_CONTAINMENT_EDEFAULT);
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
			case TyphonmlPackage.RELATION__TYPE:
				return type != null;
			case TyphonmlPackage.RELATION__CARDINALITY:
				return cardinality != CARDINALITY_EDEFAULT;
			case TyphonmlPackage.RELATION__OPPOSITE:
				return opposite != null;
			case TyphonmlPackage.RELATION__IS_CONTAINMENT:
				return IS_CONTAINMENT_EDEFAULT == null ? isContainment != null : !IS_CONTAINMENT_EDEFAULT.equals(isContainment);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", isContainment: ");
		result.append(isContainment);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
