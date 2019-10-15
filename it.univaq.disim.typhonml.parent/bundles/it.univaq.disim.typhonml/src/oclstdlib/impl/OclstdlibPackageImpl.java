/**
 */
package oclstdlib.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import oclstdlib.OclstdlibFactory;
import oclstdlib.OclstdlibPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.ocl.pivot.values.Bag;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSet;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.UnlimitedNaturalValue;

import typhonml.TyphonmlPackage;

import typhonml.impl.TyphonmlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OclstdlibPackageImpl extends EPackageImpl implements OclstdlibPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclAnyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclComparableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclInvalidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclLambdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclSelfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclStereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclSummableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclVoidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType integerEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType realEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unlimitedNaturalEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see oclstdlib.OclstdlibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OclstdlibPackageImpl() {
		super(eNS_URI, OclstdlibFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OclstdlibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OclstdlibPackage init() {
		if (isInited) return (OclstdlibPackage)EPackage.Registry.INSTANCE.getEPackage(OclstdlibPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOclstdlibPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OclstdlibPackageImpl theOclstdlibPackage = registeredOclstdlibPackage instanceof OclstdlibPackageImpl ? (OclstdlibPackageImpl)registeredOclstdlibPackage : new OclstdlibPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TyphonmlPackage.eNS_URI);
		TyphonmlPackageImpl theTyphonmlPackage = (TyphonmlPackageImpl)(registeredPackage instanceof TyphonmlPackageImpl ? registeredPackage : TyphonmlPackage.eINSTANCE);

		// Create package meta-data objects
		theOclstdlibPackage.createPackageContents();
		theTyphonmlPackage.createPackageContents();

		// Initialize created meta-data
		theOclstdlibPackage.initializePackageContents();
		theTyphonmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOclstdlibPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OclstdlibPackage.eNS_URI, theOclstdlibPackage);
		return theOclstdlibPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBag() {
		return bagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollection_ElementType() {
		return (EReference)collectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollection_Lower() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollection_Upper() {
		return (EAttribute)collectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMap() {
		return mapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMap_KeyType() {
		return (EReference)mapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMap_ValueType() {
		return (EReference)mapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclAny() {
		return oclAnyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclComparable() {
		return oclComparableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclElement() {
		return oclElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOclElement_OclContainer() {
		return (EReference)oclElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOclElement_OclContents() {
		return (EReference)oclElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclEnumeration() {
		return oclEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclInvalid() {
		return oclInvalidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOclInvalid_OclBadProperty() {
		return (EReference)oclInvalidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclLambda() {
		return oclLambdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclMessage() {
		return oclMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclSelf() {
		return oclSelfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclState() {
		return oclStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclStereotype() {
		return oclStereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclSummable() {
		return oclSummableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclTuple() {
		return oclTupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclType() {
		return oclTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclVoid() {
		return oclVoidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedCollection() {
		return orderedCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedSet() {
		return orderedSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSet() {
		return setEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniqueCollection() {
		return uniqueCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInteger() {
		return integerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReal() {
		return realEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnlimitedNatural() {
		return unlimitedNaturalEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OclstdlibFactory getOclstdlibFactory() {
		return (OclstdlibFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bagEClass = createEClass(BAG);

		collectionEClass = createEClass(COLLECTION);
		createEReference(collectionEClass, COLLECTION__ELEMENT_TYPE);
		createEAttribute(collectionEClass, COLLECTION__LOWER);
		createEAttribute(collectionEClass, COLLECTION__UPPER);

		mapEClass = createEClass(MAP);
		createEReference(mapEClass, MAP__KEY_TYPE);
		createEReference(mapEClass, MAP__VALUE_TYPE);

		oclAnyEClass = createEClass(OCL_ANY);

		oclComparableEClass = createEClass(OCL_COMPARABLE);

		oclElementEClass = createEClass(OCL_ELEMENT);
		createEReference(oclElementEClass, OCL_ELEMENT__OCL_CONTAINER);
		createEReference(oclElementEClass, OCL_ELEMENT__OCL_CONTENTS);

		oclEnumerationEClass = createEClass(OCL_ENUMERATION);

		oclInvalidEClass = createEClass(OCL_INVALID);
		createEReference(oclInvalidEClass, OCL_INVALID__OCL_BAD_PROPERTY);

		oclLambdaEClass = createEClass(OCL_LAMBDA);

		oclMessageEClass = createEClass(OCL_MESSAGE);

		oclSelfEClass = createEClass(OCL_SELF);

		oclStateEClass = createEClass(OCL_STATE);

		oclStereotypeEClass = createEClass(OCL_STEREOTYPE);

		oclSummableEClass = createEClass(OCL_SUMMABLE);

		oclTupleEClass = createEClass(OCL_TUPLE);

		oclTypeEClass = createEClass(OCL_TYPE);

		oclVoidEClass = createEClass(OCL_VOID);

		orderedCollectionEClass = createEClass(ORDERED_COLLECTION);

		orderedSetEClass = createEClass(ORDERED_SET);

		sequenceEClass = createEClass(SEQUENCE);

		setEClass = createEClass(SET);

		uniqueCollectionEClass = createEClass(UNIQUE_COLLECTION);

		// Create data types
		booleanEDataType = createEDataType(BOOLEAN);
		integerEDataType = createEDataType(INTEGER);
		realEDataType = createEDataType(REAL);
		stringEDataType = createEDataType(STRING);
		unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter bagEClass_T = addETypeParameter(bagEClass, "T");
		ETypeParameter collectionEClass_T = addETypeParameter(collectionEClass, "T");
		ETypeParameter mapEClass_K = addETypeParameter(mapEClass, "K");
		ETypeParameter mapEClass_V = addETypeParameter(mapEClass, "V");
		ETypeParameter orderedCollectionEClass_T = addETypeParameter(orderedCollectionEClass, "T");
		ETypeParameter orderedSetEClass_T = addETypeParameter(orderedSetEClass, "T");
		ETypeParameter sequenceEClass_T = addETypeParameter(sequenceEClass, "T");
		ETypeParameter setEClass_T = addETypeParameter(setEClass, "T");
		ETypeParameter uniqueCollectionEClass_T = addETypeParameter(uniqueCollectionEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getCollection());
		EGenericType g2 = createEGenericType(bagEClass_T);
		g1.getETypeArguments().add(g2);
		bagEClass.getEGenericSuperTypes().add(g1);
		oclComparableEClass.getESuperTypes().add(this.getOclAny());
		oclElementEClass.getESuperTypes().add(this.getOclAny());
		oclEnumerationEClass.getESuperTypes().add(this.getOclAny());
		oclInvalidEClass.getESuperTypes().add(this.getOclVoid());
		oclLambdaEClass.getESuperTypes().add(this.getOclAny());
		oclMessageEClass.getESuperTypes().add(this.getOclAny());
		oclSelfEClass.getESuperTypes().add(this.getOclAny());
		oclStateEClass.getESuperTypes().add(this.getOclAny());
		oclStereotypeEClass.getESuperTypes().add(this.getOclType());
		oclSummableEClass.getESuperTypes().add(this.getOclAny());
		oclTupleEClass.getESuperTypes().add(this.getOclAny());
		oclTypeEClass.getESuperTypes().add(this.getOclElement());
		oclVoidEClass.getESuperTypes().add(this.getOclAny());
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(orderedCollectionEClass_T);
		g1.getETypeArguments().add(g2);
		orderedCollectionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOrderedCollection());
		g2 = createEGenericType(orderedSetEClass_T);
		g1.getETypeArguments().add(g2);
		orderedSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUniqueCollection());
		g2 = createEGenericType(orderedSetEClass_T);
		g1.getETypeArguments().add(g2);
		orderedSetEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getOrderedCollection());
		g2 = createEGenericType(sequenceEClass_T);
		g1.getETypeArguments().add(g2);
		sequenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getUniqueCollection());
		g2 = createEGenericType(setEClass_T);
		g1.getETypeArguments().add(g2);
		setEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(uniqueCollectionEClass_T);
		g1.getETypeArguments().add(g2);
		uniqueCollectionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(bagEClass, Bag.class, "Bag", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionEClass, Collection.class, "Collection", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(collectionEClass_T);
		initEReference(getCollection_ElementType(), g1, null, "elementType", null, 1, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollection_Lower(), this.getInteger(), "lower", null, 1, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollection_Upper(), this.getInteger(), "upper", null, 1, 1, Collection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mapEClass, Map.class, "Map", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(mapEClass_K);
		initEReference(getMap_KeyType(), g1, null, "keyType", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(mapEClass_V);
		initEReference(getMap_ValueType(), g1, null, "valueType", null, 0, 1, Map.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclAnyEClass, Object.class, "OclAny", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclComparableEClass, Object.class, "OclComparable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclElementEClass, Object.class, "OclElement", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclElement_OclContainer(), this.getOclElement(), null, "oclContainer", null, 0, 1, Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOclElement_OclContents(), this.getOclElement(), null, "oclContents", null, 0, -1, Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(oclEnumerationEClass, Object.class, "OclEnumeration", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclInvalidEClass, Object.class, "OclInvalid", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclInvalid_OclBadProperty(), this.getOclAny(), null, "oclBadProperty", null, 0, 1, Object.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclLambdaEClass, Object.class, "OclLambda", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclMessageEClass, Object.class, "OclMessage", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclSelfEClass, Object.class, "OclSelf", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclStateEClass, Object.class, "OclState", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclStereotypeEClass, Object.class, "OclStereotype", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclSummableEClass, Object.class, "OclSummable", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclTupleEClass, Object.class, "OclTuple", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclTypeEClass, Object.class, "OclType", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclVoidEClass, Object.class, "OclVoid", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedCollectionEClass, Collection.class, "OrderedCollection", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedSetEClass, OrderedSet.class, "OrderedSet", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, List.class, "Sequence", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(setEClass, Set.class, "Set", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueCollectionEClass, Collection.class, "UniqueCollection", IS_ABSTRACT, IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(integerEDataType, IntegerValue.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(realEDataType, RealValue.class, "Real", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(unlimitedNaturalEDataType, UnlimitedNaturalValue.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/ASLibrary
		createASLibraryAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/ASLibrary</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createASLibraryAnnotations() {
		String source = "http://www.eclipse.org/OCL/ASLibrary";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

} //OclstdlibPackageImpl
