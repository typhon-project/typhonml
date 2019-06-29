/**
 */
package typhonml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonml.Attribute;
import typhonml.Entity;
import typhonml.FreeText;
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
 *   <li>{@link typhonml.impl.EntityImpl#getFretextAttributes <em>Fretext Attributes</em>}</li>
 *   <li>{@link typhonml.impl.EntityImpl#getRelations <em>Relations</em>}</li>
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
	 * The cached value of the '{@link #getFretextAttributes() <em>Fretext Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFretextAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<FreeText> fretextAttributes;

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
	public EList<FreeText> getFretextAttributes() {
		if (fretextAttributes == null) {
			fretextAttributes = new EObjectContainmentEList<FreeText>(FreeText.class, this, TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES);
		}
		return fretextAttributes;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES:
				return ((InternalEList<?>)getFretextAttributes()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.ENTITY__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES:
				return getFretextAttributes();
			case TyphonmlPackage.ENTITY__RELATIONS:
				return getRelations();
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
			case TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES:
				getFretextAttributes().clear();
				getFretextAttributes().addAll((Collection<? extends FreeText>)newValue);
				return;
			case TyphonmlPackage.ENTITY__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
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
			case TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES:
				getFretextAttributes().clear();
				return;
			case TyphonmlPackage.ENTITY__RELATIONS:
				getRelations().clear();
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
			case TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES:
				return fretextAttributes != null && !fretextAttributes.isEmpty();
			case TyphonmlPackage.ENTITY__RELATIONS:
				return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityImpl
