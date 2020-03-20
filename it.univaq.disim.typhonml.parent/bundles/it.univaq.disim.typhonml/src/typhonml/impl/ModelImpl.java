/**
 */
package typhonml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonml.ChangeOperator;
import typhonml.CustomDataType;
import typhonml.Database;
import typhonml.Entity;
import typhonml.Model;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.ModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link typhonml.impl.ModelImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link typhonml.impl.ModelImpl#getCustomDataTypes <em>Custom Data Types</em>}</li>
 *   <li>{@link typhonml.impl.ModelImpl#getChangeOperators <em>Change Operators</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabases()
	 * @generated
	 * @ordered
	 */
	protected EList<Database> databases;

	/**
	 * The cached value of the '{@link #getCustomDataTypes() <em>Custom Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomDataType> customDataTypes;

	/**
	 * The cached value of the '{@link #getChangeOperators() <em>Change Operators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeOperators()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeOperator> changeOperators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, TyphonmlPackage.MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Database> getDatabases() {
		if (databases == null) {
			databases = new EObjectContainmentEList<Database>(Database.class, this, TyphonmlPackage.MODEL__DATABASES);
		}
		return databases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CustomDataType> getCustomDataTypes() {
		if (customDataTypes == null) {
			customDataTypes = new EObjectContainmentEList<CustomDataType>(CustomDataType.class, this, TyphonmlPackage.MODEL__CUSTOM_DATA_TYPES);
		}
		return customDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChangeOperator> getChangeOperators() {
		if (changeOperators == null) {
			changeOperators = new EObjectContainmentEList<ChangeOperator>(ChangeOperator.class, this, TyphonmlPackage.MODEL__CHANGE_OPERATORS);
		}
		return changeOperators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.MODEL__DATABASES:
				return ((InternalEList<?>)getDatabases()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.MODEL__CUSTOM_DATA_TYPES:
				return ((InternalEList<?>)getCustomDataTypes()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.MODEL__CHANGE_OPERATORS:
				return ((InternalEList<?>)getChangeOperators()).basicRemove(otherEnd, msgs);
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
			case TyphonmlPackage.MODEL__ENTITIES:
				return getEntities();
			case TyphonmlPackage.MODEL__DATABASES:
				return getDatabases();
			case TyphonmlPackage.MODEL__CUSTOM_DATA_TYPES:
				return getCustomDataTypes();
			case TyphonmlPackage.MODEL__CHANGE_OPERATORS:
				return getChangeOperators();
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
			case TyphonmlPackage.MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case TyphonmlPackage.MODEL__DATABASES:
				getDatabases().clear();
				getDatabases().addAll((Collection<? extends Database>)newValue);
				return;
			case TyphonmlPackage.MODEL__CUSTOM_DATA_TYPES:
				getCustomDataTypes().clear();
				getCustomDataTypes().addAll((Collection<? extends CustomDataType>)newValue);
				return;
			case TyphonmlPackage.MODEL__CHANGE_OPERATORS:
				getChangeOperators().clear();
				getChangeOperators().addAll((Collection<? extends ChangeOperator>)newValue);
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
			case TyphonmlPackage.MODEL__ENTITIES:
				getEntities().clear();
				return;
			case TyphonmlPackage.MODEL__DATABASES:
				getDatabases().clear();
				return;
			case TyphonmlPackage.MODEL__CUSTOM_DATA_TYPES:
				getCustomDataTypes().clear();
				return;
			case TyphonmlPackage.MODEL__CHANGE_OPERATORS:
				getChangeOperators().clear();
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
			case TyphonmlPackage.MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case TyphonmlPackage.MODEL__DATABASES:
				return databases != null && !databases.isEmpty();
			case TyphonmlPackage.MODEL__CUSTOM_DATA_TYPES:
				return customDataTypes != null && !customDataTypes.isEmpty();
			case TyphonmlPackage.MODEL__CHANGE_OPERATORS:
				return changeOperators != null && !changeOperators.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
