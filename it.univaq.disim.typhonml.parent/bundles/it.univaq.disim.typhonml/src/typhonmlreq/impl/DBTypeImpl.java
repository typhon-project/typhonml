/**
 */
package typhonmlreq.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonmlreq.DBType;
import typhonmlreq.FRequirement;
import typhonmlreq.NFRequirement;
import typhonmlreq.TyphonmlreqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonmlreq.impl.DBTypeImpl#getFrequirements <em>Frequirements</em>}</li>
 *   <li>{@link typhonmlreq.impl.DBTypeImpl#getNfrequirements <em>Nfrequirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DBTypeImpl extends NamedElementImpl implements DBType {
	/**
	 * The cached value of the '{@link #getFrequirements() <em>Frequirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<FRequirement> frequirements;

	/**
	 * The cached value of the '{@link #getNfrequirements() <em>Nfrequirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNfrequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<NFRequirement> nfrequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlreqPackage.Literals.DB_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FRequirement> getFrequirements() {
		if (frequirements == null) {
			frequirements = new EObjectContainmentEList<FRequirement>(FRequirement.class, this, TyphonmlreqPackage.DB_TYPE__FREQUIREMENTS);
		}
		return frequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NFRequirement> getNfrequirements() {
		if (nfrequirements == null) {
			nfrequirements = new EObjectContainmentEList<NFRequirement>(NFRequirement.class, this, TyphonmlreqPackage.DB_TYPE__NFREQUIREMENTS);
		}
		return nfrequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlreqPackage.DB_TYPE__FREQUIREMENTS:
				return ((InternalEList<?>)getFrequirements()).basicRemove(otherEnd, msgs);
			case TyphonmlreqPackage.DB_TYPE__NFREQUIREMENTS:
				return ((InternalEList<?>)getNfrequirements()).basicRemove(otherEnd, msgs);
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
			case TyphonmlreqPackage.DB_TYPE__FREQUIREMENTS:
				return getFrequirements();
			case TyphonmlreqPackage.DB_TYPE__NFREQUIREMENTS:
				return getNfrequirements();
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
			case TyphonmlreqPackage.DB_TYPE__FREQUIREMENTS:
				getFrequirements().clear();
				getFrequirements().addAll((Collection<? extends FRequirement>)newValue);
				return;
			case TyphonmlreqPackage.DB_TYPE__NFREQUIREMENTS:
				getNfrequirements().clear();
				getNfrequirements().addAll((Collection<? extends NFRequirement>)newValue);
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
			case TyphonmlreqPackage.DB_TYPE__FREQUIREMENTS:
				getFrequirements().clear();
				return;
			case TyphonmlreqPackage.DB_TYPE__NFREQUIREMENTS:
				getNfrequirements().clear();
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
			case TyphonmlreqPackage.DB_TYPE__FREQUIREMENTS:
				return frequirements != null && !frequirements.isEmpty();
			case TyphonmlreqPackage.DB_TYPE__NFREQUIREMENTS:
				return nfrequirements != null && !nfrequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DBTypeImpl
