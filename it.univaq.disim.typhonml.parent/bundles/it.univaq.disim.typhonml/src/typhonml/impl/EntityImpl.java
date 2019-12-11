/**
 */
package typhonml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import typhonml.Attribute;
import typhonml.Collection;
import typhonml.Column;
import typhonml.Entity;
import typhonml.FreeText;
import typhonml.FunctionalTag;
import typhonml.GraphNode;
import typhonml.KeyValueElement;
import typhonml.NFunctionalTag;
import typhonml.Relation;
import typhonml.Table;
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
 *   <li>{@link typhonml.impl.EntityImpl#getFunctionalTags <em>Functional Tags</em>}</li>
 *   <li>{@link typhonml.impl.EntityImpl#getNfunctionalTags <em>Nfunctional Tags</em>}</li>
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
	 * The cached value of the '{@link #getFunctionalTags() <em>Functional Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalTags()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalTag> functionalTags;

	/**
	 * The cached value of the '{@link #getNfunctionalTags() <em>Nfunctional Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNfunctionalTags()
	 * @generated
	 * @ordered
	 */
	protected EList<NFunctionalTag> nfunctionalTags;

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
	@Override
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
	@Override
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
	@Override
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
	public EList<FunctionalTag> getFunctionalTags() {
		if (functionalTags == null) {
			functionalTags = new EObjectContainmentEList<FunctionalTag>(FunctionalTag.class, this, TyphonmlPackage.ENTITY__FUNCTIONAL_TAGS);
		}
		return functionalTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NFunctionalTag> getNfunctionalTags() {
		if (nfunctionalTags == null) {
			nfunctionalTags = new EObjectContainmentEList<NFunctionalTag>(NFunctionalTag.class, this, TyphonmlPackage.ENTITY__NFUNCTIONAL_TAGS);
		}
		return nfunctionalTags;
	}

	/**
	 * The cached invocation delegate for the '{@link #getCollections() <em>Get Collections</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_COLLECTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)TyphonmlPackage.Literals.ENTITY___GET_COLLECTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Collection> getCollections() {
		try {
			return (EList<Collection>)GET_COLLECTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getTables() <em>Get Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_TABLES__EINVOCATION_DELEGATE = ((EOperation.Internal)TyphonmlPackage.Literals.ENTITY___GET_TABLES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Table> getTables() {
		try {
			return (EList<Table>)GET_TABLES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getKeyValueElements() <em>Get Key Value Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyValueElements()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_KEY_VALUE_ELEMENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)TyphonmlPackage.Literals.ENTITY___GET_KEY_VALUE_ELEMENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<KeyValueElement> getKeyValueElements() {
		try {
			return (EList<KeyValueElement>)GET_KEY_VALUE_ELEMENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getGraphNodes() <em>Get Graph Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGraphNodes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_GRAPH_NODES__EINVOCATION_DELEGATE = ((EOperation.Internal)TyphonmlPackage.Literals.ENTITY___GET_GRAPH_NODES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GraphNode> getGraphNodes() {
		try {
			return (EList<GraphNode>)GET_GRAPH_NODES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getColumns() <em>Get Columns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_COLUMNS__EINVOCATION_DELEGATE = ((EOperation.Internal)TyphonmlPackage.Literals.ENTITY___GET_COLUMNS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Column> getColumns() {
		try {
			return (EList<Column>)GET_COLUMNS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case TyphonmlPackage.ENTITY__FUNCTIONAL_TAGS:
				return ((InternalEList<?>)getFunctionalTags()).basicRemove(otherEnd, msgs);
			case TyphonmlPackage.ENTITY__NFUNCTIONAL_TAGS:
				return ((InternalEList<?>)getNfunctionalTags()).basicRemove(otherEnd, msgs);
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
			case TyphonmlPackage.ENTITY__FUNCTIONAL_TAGS:
				return getFunctionalTags();
			case TyphonmlPackage.ENTITY__NFUNCTIONAL_TAGS:
				return getNfunctionalTags();
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
				getAttributes().addAll((java.util.Collection<? extends Attribute>)newValue);
				return;
			case TyphonmlPackage.ENTITY__FRETEXT_ATTRIBUTES:
				getFretextAttributes().clear();
				getFretextAttributes().addAll((java.util.Collection<? extends FreeText>)newValue);
				return;
			case TyphonmlPackage.ENTITY__RELATIONS:
				getRelations().clear();
				getRelations().addAll((java.util.Collection<? extends Relation>)newValue);
				return;
			case TyphonmlPackage.ENTITY__FUNCTIONAL_TAGS:
				getFunctionalTags().clear();
				getFunctionalTags().addAll((java.util.Collection<? extends FunctionalTag>)newValue);
				return;
			case TyphonmlPackage.ENTITY__NFUNCTIONAL_TAGS:
				getNfunctionalTags().clear();
				getNfunctionalTags().addAll((java.util.Collection<? extends NFunctionalTag>)newValue);
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
			case TyphonmlPackage.ENTITY__FUNCTIONAL_TAGS:
				getFunctionalTags().clear();
				return;
			case TyphonmlPackage.ENTITY__NFUNCTIONAL_TAGS:
				getNfunctionalTags().clear();
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
			case TyphonmlPackage.ENTITY__FUNCTIONAL_TAGS:
				return functionalTags != null && !functionalTags.isEmpty();
			case TyphonmlPackage.ENTITY__NFUNCTIONAL_TAGS:
				return nfunctionalTags != null && !nfunctionalTags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TyphonmlPackage.ENTITY___GET_COLLECTIONS:
				return getCollections();
			case TyphonmlPackage.ENTITY___GET_TABLES:
				return getTables();
			case TyphonmlPackage.ENTITY___GET_KEY_VALUE_ELEMENTS:
				return getKeyValueElements();
			case TyphonmlPackage.ENTITY___GET_GRAPH_NODES:
				return getGraphNodes();
			case TyphonmlPackage.ENTITY___GET_COLUMNS:
				return getColumns();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityImpl
