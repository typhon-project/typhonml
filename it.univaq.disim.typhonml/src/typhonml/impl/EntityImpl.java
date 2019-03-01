/**
 */
package typhonml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonml.Attribute;
import typhonml.Entity;
import typhonml.EntityIdentifier;
import typhonml.GenericList;
import typhonml.Relation;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link typhonml.impl.EntityImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link typhonml.impl.EntityImpl#getIdentifer <em>Identifer</em>}</li>
 *   <li>{@link typhonml.impl.EntityImpl#getGenericList <em>Generic List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends DataTypeImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getIdentifer() <em>Identifer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifer()
	 * @generated
	 * @ordered
	 */
	protected EntityIdentifier identifer;

	/**
	 * The cached value of the '{@link #getGenericList() <em>Generic List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericList()
	 * @generated
	 * @ordered
	 */
	protected GenericList genericList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, TyphonmlPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, TyphonmlPackage.ENTITY__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityIdentifier getIdentifer() {
		return identifer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifer(EntityIdentifier newIdentifer, NotificationChain msgs) {
		EntityIdentifier oldIdentifer = identifer;
		identifer = newIdentifer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ENTITY__IDENTIFER, oldIdentifer, newIdentifer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifer(EntityIdentifier newIdentifer) {
		if (newIdentifer != identifer) {
			NotificationChain msgs = null;
			if (identifer != null)
				msgs = ((InternalEObject)identifer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.ENTITY__IDENTIFER, null, msgs);
			if (newIdentifer != null)
				msgs = ((InternalEObject)newIdentifer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.ENTITY__IDENTIFER, null, msgs);
			msgs = basicSetIdentifer(newIdentifer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ENTITY__IDENTIFER, newIdentifer, newIdentifer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericList getGenericList() {
		if (genericList != null && genericList.eIsProxy()) {
			InternalEObject oldGenericList = (InternalEObject)genericList;
			genericList = (GenericList)eResolveProxy(oldGenericList);
			if (genericList != oldGenericList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.ENTITY__GENERIC_LIST, oldGenericList, genericList));
			}
		}
		return genericList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericList basicGetGenericList() {
		return genericList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericList(GenericList newGenericList, NotificationChain msgs) {
		GenericList oldGenericList = genericList;
		genericList = newGenericList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ENTITY__GENERIC_LIST, oldGenericList, newGenericList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericList(GenericList newGenericList) {
		if (newGenericList != genericList) {
			NotificationChain msgs = null;
			if (genericList != null)
				msgs = ((InternalEObject)genericList).eInverseRemove(this, TyphonmlPackage.GENERIC_LIST__ENTITY, GenericList.class, msgs);
			if (newGenericList != null)
				msgs = ((InternalEObject)newGenericList).eInverseAdd(this, TyphonmlPackage.GENERIC_LIST__ENTITY, GenericList.class, msgs);
			msgs = basicSetGenericList(newGenericList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.ENTITY__GENERIC_LIST, newGenericList, newGenericList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.ENTITY__GENERIC_LIST:
				if (genericList != null)
					msgs = ((InternalEObject)genericList).eInverseRemove(this, TyphonmlPackage.GENERIC_LIST__ENTITY, GenericList.class, msgs);
				return basicSetGenericList((GenericList)otherEnd, msgs);
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
			case TyphonmlPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.ENTITY__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.ENTITY__IDENTIFER:
				return basicSetIdentifer(null, msgs);
			case TyphonmlPackage.ENTITY__GENERIC_LIST:
				return basicSetGenericList(null, msgs);
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
			case TyphonmlPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case TyphonmlPackage.ENTITY__RELATIONS:
				return getRelations();
			case TyphonmlPackage.ENTITY__IDENTIFER:
				return getIdentifer();
			case TyphonmlPackage.ENTITY__GENERIC_LIST:
				if (resolve) return getGenericList();
				return basicGetGenericList();
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
			case TyphonmlPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case TyphonmlPackage.ENTITY__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case TyphonmlPackage.ENTITY__IDENTIFER:
				setIdentifer((EntityIdentifier)newValue);
				return;
			case TyphonmlPackage.ENTITY__GENERIC_LIST:
				setGenericList((GenericList)newValue);
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
			case TyphonmlPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case TyphonmlPackage.ENTITY__RELATIONS:
				getRelations().clear();
				return;
			case TyphonmlPackage.ENTITY__IDENTIFER:
				setIdentifer((EntityIdentifier)null);
				return;
			case TyphonmlPackage.ENTITY__GENERIC_LIST:
				setGenericList((GenericList)null);
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
			case TyphonmlPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case TyphonmlPackage.ENTITY__RELATIONS:
				return relations != null && !relations.isEmpty();
			case TyphonmlPackage.ENTITY__IDENTIFER:
				return identifer != null;
			case TyphonmlPackage.ENTITY__GENERIC_LIST:
				return genericList != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
