/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.Attribute;
import typhonml.Entity;
import typhonml.SplitEntityHorizontal;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Entity Horizontal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.SplitEntityHorizontalImpl#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityHorizontalImpl#getEntity2name <em>Entity2name</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityHorizontalImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link typhonml.impl.SplitEntityHorizontalImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SplitEntityHorizontalImpl extends ChangeOperatorImpl implements SplitEntityHorizontal {
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
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute attribute;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplitEntityHorizontalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.SPLIT_ENTITY_HORIZONTAL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY1, oldEntity1, entity1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY1, oldEntity1, entity1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME, oldEntity2name, entity2name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute getAttribute() {
		if (attribute != null && attribute.eIsProxy()) {
			InternalEObject oldAttribute = (InternalEObject)attribute;
			attribute = (Attribute)eResolveProxy(oldAttribute);
			if (attribute != oldAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE, oldAttribute, attribute));
			}
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribute(Attribute newAttribute) {
		Attribute oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY1:
				if (resolve) return getEntity1();
				return basicGetEntity1();
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME:
				return getEntity2name();
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE:
				if (resolve) return getAttribute();
				return basicGetAttribute();
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__EXPRESSION:
				return getExpression();
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
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY1:
				setEntity1((Entity)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME:
				setEntity2name((String)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE:
				setAttribute((Attribute)newValue);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__EXPRESSION:
				setExpression((String)newValue);
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
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY1:
				setEntity1((Entity)null);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME:
				setEntity2name(ENTITY2NAME_EDEFAULT);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE:
				setAttribute((Attribute)null);
				return;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
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
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY1:
				return entity1 != null;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ENTITY2NAME:
				return ENTITY2NAME_EDEFAULT == null ? entity2name != null : !ENTITY2NAME_EDEFAULT.equals(entity2name);
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__ATTRIBUTE:
				return attribute != null;
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
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
		result.append(", expression: ");
		result.append(expression);
		result.append(')');
		return result.toString();
	}

} //SplitEntityHorizontalImpl
