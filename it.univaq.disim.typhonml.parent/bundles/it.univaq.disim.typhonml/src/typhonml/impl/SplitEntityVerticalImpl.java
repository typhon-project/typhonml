/**
 */
package typhonml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import typhonml.Attribute;
import typhonml.Entity;
import typhonml.Relation;
import typhonml.SplitEntityVertical;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Entity Vertical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.SplitEntityVerticalImpl#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityVerticalImpl#getEntity2name <em>Entity2name</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityVerticalImpl#getAttributeList <em>Attribute List</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityVerticalImpl#getRelationList <em>Relation List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitEntityVerticalImpl extends ChangeOperatorImpl implements SplitEntityVertical {
	/**
	 * The cached value of the '{@link #getEntity1() <em>Entity1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity1()
	 * @generated
	 * @ordered
	 */
	protected Entity entity1;

	/**
	 * The default value of the '{@link #getEntity2name() <em>Entity2name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity2name()
	 * @generated
	 * @ordered
	 */
	protected static final String ENTITY2NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntity2name() <em>Entity2name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity2name()
	 * @generated
	 * @ordered
	 */
	protected String entity2name = ENTITY2NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributeList() <em>Attribute List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeList()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributeList;

	/**
	 * The cached value of the '{@link #getRelationList() <em>Relation List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationList()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relationList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitEntityVerticalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.SPLIT_ENTITY_VERTICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity getEntity1() {
		if (entity1 != null && entity1.eIsProxy()) {
			InternalEObject oldEntity1 = (InternalEObject)entity1;
			entity1 = (Entity)eResolveProxy(oldEntity1);
			if (entity1 != oldEntity1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY1, oldEntity1, entity1));
			}
		}
		return entity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntity1() {
		return entity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity1(Entity newEntity1) {
		Entity oldEntity1 = entity1;
		entity1 = newEntity1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY1, oldEntity1, entity1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEntity2name() {
		return entity2name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntity2name(String newEntity2name) {
		String oldEntity2name = entity2name;
		entity2name = newEntity2name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY2NAME, oldEntity2name, entity2name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributeList() {
		if (attributeList == null) {
			attributeList = new EObjectResolvingEList<Attribute>(Attribute.class, this, TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST);
		}
		return attributeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelationList() {
		if (relationList == null) {
			relationList = new EObjectResolvingEList<Relation>(Relation.class, this, TyphonmlPackage.SPLIT_ENTITY_VERTICAL__RELATION_LIST);
		}
		return relationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY1:
				if (resolve) return getEntity1();
				return basicGetEntity1();
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY2NAME:
				return getEntity2name();
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST:
				return getAttributeList();
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__RELATION_LIST:
				return getRelationList();
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
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY1:
				setEntity1((Entity)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY2NAME:
				setEntity2name((String)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST:
				getAttributeList().clear();
				getAttributeList().addAll((Collection<? extends Attribute>)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__RELATION_LIST:
				getRelationList().clear();
				getRelationList().addAll((Collection<? extends Relation>)newValue);
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
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY1:
				setEntity1((Entity)null);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY2NAME:
				setEntity2name(ENTITY2NAME_EDEFAULT);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST:
				getAttributeList().clear();
				return;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__RELATION_LIST:
				getRelationList().clear();
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
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY1:
				return entity1 != null;
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ENTITY2NAME:
				return ENTITY2NAME_EDEFAULT == null ? entity2name != null : !ENTITY2NAME_EDEFAULT.equals(entity2name);
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__ATTRIBUTE_LIST:
				return attributeList != null && !attributeList.isEmpty();
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL__RELATION_LIST:
				return relationList != null && !relationList.isEmpty();
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
		result.append(" (entity2name: ");
		result.append(entity2name);
		result.append(')');
		return result.toString();
	}

} //SplitEntityVerticalImpl
