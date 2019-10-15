/**
 */
package oclstdlib;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see oclstdlib.OclstdlibFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/ASLibrary"
 * @generated
 */
public interface OclstdlibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oclstdlib";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ocl/2015/Library";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "oclstdlib";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OclstdlibPackage eINSTANCE = oclstdlib.impl.OclstdlibPackageImpl.init();

	/**
	 * The meta object id for the '{@link java.util.Collection <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 1;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__ELEMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__LOWER = 1;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__UPPER = 2;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.pivot.values.Bag <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.Bag
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getBag()
	 * @generated
	 */
	int BAG = 0;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ELEMENT_TYPE = COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__LOWER = COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__UPPER = COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.Map <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__KEY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__VALUE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclAny()
	 * @generated
	 */
	int OCL_ANY = 3;

	/**
	 * The number of structural features of the '<em>Ocl Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Ocl Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ANY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Comparable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclComparable()
	 * @generated
	 */
	int OCL_COMPARABLE = 4;

	/**
	 * The number of structural features of the '<em>Ocl Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COMPARABLE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Comparable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_COMPARABLE_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclElement()
	 * @generated
	 */
	int OCL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Ocl Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT__OCL_CONTAINER = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ocl Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT__OCL_CONTENTS = OCL_ANY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ocl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ocl Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ELEMENT_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclEnumeration()
	 * @generated
	 */
	int OCL_ENUMERATION = 6;

	/**
	 * The number of structural features of the '<em>Ocl Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_ENUMERATION_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Void</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclVoid()
	 * @generated
	 */
	int OCL_VOID = 16;

	/**
	 * The number of structural features of the '<em>Ocl Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Void</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_VOID_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Invalid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclInvalid()
	 * @generated
	 */
	int OCL_INVALID = 7;

	/**
	 * The feature id for the '<em><b>Ocl Bad Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID__OCL_BAD_PROPERTY = OCL_VOID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ocl Invalid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_FEATURE_COUNT = OCL_VOID_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ocl Invalid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_INVALID_OPERATION_COUNT = OCL_VOID_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclLambda()
	 * @generated
	 */
	int OCL_LAMBDA = 8;

	/**
	 * The number of structural features of the '<em>Ocl Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LAMBDA_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_LAMBDA_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclMessage()
	 * @generated
	 */
	int OCL_MESSAGE = 9;

	/**
	 * The number of structural features of the '<em>Ocl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_MESSAGE_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Self</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclSelf()
	 * @generated
	 */
	int OCL_SELF = 10;

	/**
	 * The number of structural features of the '<em>Ocl Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SELF_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Self</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SELF_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclState()
	 * @generated
	 */
	int OCL_STATE = 11;

	/**
	 * The number of structural features of the '<em>Ocl State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_STATE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_STATE_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclType()
	 * @generated
	 */
	int OCL_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Ocl Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OCL_CONTAINER = OCL_ELEMENT__OCL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Ocl Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE__OCL_CONTENTS = OCL_ELEMENT__OCL_CONTENTS;

	/**
	 * The number of structural features of the '<em>Ocl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_FEATURE_COUNT = OCL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TYPE_OPERATION_COUNT = OCL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclStereotype()
	 * @generated
	 */
	int OCL_STEREOTYPE = 12;

	/**
	 * The feature id for the '<em><b>Ocl Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_STEREOTYPE__OCL_CONTAINER = OCL_TYPE__OCL_CONTAINER;

	/**
	 * The feature id for the '<em><b>Ocl Contents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_STEREOTYPE__OCL_CONTENTS = OCL_TYPE__OCL_CONTENTS;

	/**
	 * The number of structural features of the '<em>Ocl Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_STEREOTYPE_FEATURE_COUNT = OCL_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_STEREOTYPE_OPERATION_COUNT = OCL_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Summable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclSummable()
	 * @generated
	 */
	int OCL_SUMMABLE = 13;

	/**
	 * The number of structural features of the '<em>Ocl Summable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SUMMABLE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Summable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_SUMMABLE_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.lang.Object <em>Ocl Tuple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclTuple()
	 * @generated
	 */
	int OCL_TUPLE = 14;

	/**
	 * The number of structural features of the '<em>Ocl Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_FEATURE_COUNT = OCL_ANY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ocl Tuple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_TUPLE_OPERATION_COUNT = OCL_ANY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.Collection <em>Ordered Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOrderedCollection()
	 * @generated
	 */
	int ORDERED_COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__ELEMENT_TYPE = COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__LOWER = COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION__UPPER = COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Ordered Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ocl.pivot.values.OrderedSet <em>Ordered Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.OrderedSet
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getOrderedSet()
	 * @generated
	 */
	int ORDERED_SET = 18;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET__ELEMENT_TYPE = ORDERED_COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET__LOWER = ORDERED_COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET__UPPER = ORDERED_COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Ordered Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_FEATURE_COUNT = ORDERED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_OPERATION_COUNT = ORDERED_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.List <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 19;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ELEMENT_TYPE = ORDERED_COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__LOWER = ORDERED_COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__UPPER = ORDERED_COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ORDERED_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = ORDERED_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.Collection <em>Unique Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getUniqueCollection()
	 * @generated
	 */
	int UNIQUE_COLLECTION = 21;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__ELEMENT_TYPE = COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__LOWER = COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION__UPPER = COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Unique Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unique Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLLECTION_OPERATION_COUNT = COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link java.util.Set <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getSet()
	 * @generated
	 */
	int SET = 20;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ELEMENT_TYPE = UNIQUE_COLLECTION__ELEMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__LOWER = UNIQUE_COLLECTION__LOWER;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__UPPER = UNIQUE_COLLECTION__UPPER;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = UNIQUE_COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_OPERATION_COUNT = UNIQUE_COLLECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 22;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.IntegerValue
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 23;

	/**
	 * The meta object id for the '<em>Real</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.RealValue
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 24;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getString()
	 * @generated
	 */
	int STRING = 25;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ocl.pivot.values.UnlimitedNaturalValue
	 * @see oclstdlib.impl.OclstdlibPackageImpl#getUnlimitedNatural()
	 * @generated
	 */
	int UNLIMITED_NATURAL = 26;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.pivot.values.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see org.eclipse.ocl.pivot.values.Bag
	 * @model instanceClass="org.eclipse.ocl.pivot.values.Bag" typeParameters="T" superTypes="oclstdlib.Collection&lt;T&gt;"
	 * @generated
	 */
	EClass getBag();

	/**
	 * Returns the meta object for class '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for the reference '{@link java.util.Collection#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see java.util.Collection#getElementType()
	 * @see #getCollection()
	 * @generated
	 */
	EReference getCollection_ElementType();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Collection#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see java.util.Collection#getLower()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Lower();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Collection#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see java.util.Collection#getUpper()
	 * @see #getCollection()
	 * @generated
	 */
	EAttribute getCollection_Upper();

	/**
	 * Returns the meta object for class '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Type</em>'.
	 * @see java.util.Map#getKeyType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_KeyType();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see java.util.Map#getValueType()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_ValueType();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Any</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EClass getOclAny();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Comparable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Comparable</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclComparable();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Element</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclElement();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getOclContainer <em>Ocl Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Container</em>'.
	 * @see java.lang.Object#getOclContainer()
	 * @see #getOclElement()
	 * @generated
	 */
	EReference getOclElement_OclContainer();

	/**
	 * Returns the meta object for the reference list '{@link java.lang.Object#getOclContents <em>Ocl Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ocl Contents</em>'.
	 * @see java.lang.Object#getOclContents()
	 * @see #getOclElement()
	 * @generated
	 */
	EReference getOclElement_OclContents();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Enumeration</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclEnumeration();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Invalid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Invalid</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclVoid"
	 * @generated
	 */
	EClass getOclInvalid();

	/**
	 * Returns the meta object for the reference '{@link java.lang.Object#getOclBadProperty <em>Ocl Bad Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ocl Bad Property</em>'.
	 * @see java.lang.Object#getOclBadProperty()
	 * @see #getOclInvalid()
	 * @generated
	 */
	EReference getOclInvalid_OclBadProperty();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Lambda</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclLambda();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Message</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclMessage();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Self</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclSelf();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl State</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclState();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Stereotype</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclType"
	 * @generated
	 */
	EClass getOclStereotype();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Summable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Summable</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclSummable();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Tuple</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclTuple();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclElement"
	 * @generated
	 */
	EClass getOclType();

	/**
	 * Returns the meta object for class '{@link java.lang.Object <em>Ocl Void</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Void</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object" superTypes="oclstdlib.OclAny"
	 * @generated
	 */
	EClass getOclVoid();

	/**
	 * Returns the meta object for class '{@link java.util.Collection <em>Ordered Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T" superTypes="oclstdlib.Collection&lt;T&gt;"
	 * @generated
	 */
	EClass getOrderedCollection();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ocl.pivot.values.OrderedSet <em>Ordered Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set</em>'.
	 * @see org.eclipse.ocl.pivot.values.OrderedSet
	 * @model instanceClass="org.eclipse.ocl.pivot.values.OrderedSet" typeParameters="T" superTypes="oclstdlib.OrderedCollection&lt;T&gt; oclstdlib.UniqueCollection&lt;T&gt;"
	 * @generated
	 */
	EClass getOrderedSet();

	/**
	 * Returns the meta object for class '{@link java.util.List <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T" superTypes="oclstdlib.OrderedCollection&lt;T&gt;"
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for class '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="T" superTypes="oclstdlib.UniqueCollection&lt;T&gt;"
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link java.util.Collection <em>Unique Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T" superTypes="oclstdlib.Collection&lt;T&gt;"
	 * @generated
	 */
	EClass getUniqueCollection();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.pivot.values.IntegerValue <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see org.eclipse.ocl.pivot.values.IntegerValue
	 * @model instanceClass="org.eclipse.ocl.pivot.values.IntegerValue"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.pivot.values.RealValue <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Real</em>'.
	 * @see org.eclipse.ocl.pivot.values.RealValue
	 * @model instanceClass="org.eclipse.ocl.pivot.values.RealValue"
	 * @generated
	 */
	EDataType getReal();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.ocl.pivot.values.UnlimitedNaturalValue <em>Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Natural</em>'.
	 * @see org.eclipse.ocl.pivot.values.UnlimitedNaturalValue
	 * @model instanceClass="org.eclipse.ocl.pivot.values.UnlimitedNaturalValue"
	 * @generated
	 */
	EDataType getUnlimitedNatural();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OclstdlibFactory getOclstdlibFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.pivot.values.Bag <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.Bag
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getBag()
		 * @generated
		 */
		EClass BAG = eINSTANCE.getBag();

		/**
		 * The meta object literal for the '{@link java.util.Collection <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION__ELEMENT_TYPE = eINSTANCE.getCollection_ElementType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__LOWER = eINSTANCE.getCollection_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLECTION__UPPER = eINSTANCE.getCollection_Upper();

		/**
		 * The meta object literal for the '{@link java.util.Map <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__KEY_TYPE = eINSTANCE.getMap_KeyType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__VALUE_TYPE = eINSTANCE.getMap_ValueType();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclAny()
		 * @generated
		 */
		EClass OCL_ANY = eINSTANCE.getOclAny();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Comparable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclComparable()
		 * @generated
		 */
		EClass OCL_COMPARABLE = eINSTANCE.getOclComparable();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclElement()
		 * @generated
		 */
		EClass OCL_ELEMENT = eINSTANCE.getOclElement();

		/**
		 * The meta object literal for the '<em><b>Ocl Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ELEMENT__OCL_CONTAINER = eINSTANCE.getOclElement_OclContainer();

		/**
		 * The meta object literal for the '<em><b>Ocl Contents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_ELEMENT__OCL_CONTENTS = eINSTANCE.getOclElement_OclContents();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclEnumeration()
		 * @generated
		 */
		EClass OCL_ENUMERATION = eINSTANCE.getOclEnumeration();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Invalid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclInvalid()
		 * @generated
		 */
		EClass OCL_INVALID = eINSTANCE.getOclInvalid();

		/**
		 * The meta object literal for the '<em><b>Ocl Bad Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_INVALID__OCL_BAD_PROPERTY = eINSTANCE.getOclInvalid_OclBadProperty();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclLambda()
		 * @generated
		 */
		EClass OCL_LAMBDA = eINSTANCE.getOclLambda();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclMessage()
		 * @generated
		 */
		EClass OCL_MESSAGE = eINSTANCE.getOclMessage();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Self</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclSelf()
		 * @generated
		 */
		EClass OCL_SELF = eINSTANCE.getOclSelf();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclState()
		 * @generated
		 */
		EClass OCL_STATE = eINSTANCE.getOclState();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclStereotype()
		 * @generated
		 */
		EClass OCL_STEREOTYPE = eINSTANCE.getOclStereotype();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Summable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclSummable()
		 * @generated
		 */
		EClass OCL_SUMMABLE = eINSTANCE.getOclSummable();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Tuple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclTuple()
		 * @generated
		 */
		EClass OCL_TUPLE = eINSTANCE.getOclTuple();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclType()
		 * @generated
		 */
		EClass OCL_TYPE = eINSTANCE.getOclType();

		/**
		 * The meta object literal for the '{@link java.lang.Object <em>Ocl Void</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOclVoid()
		 * @generated
		 */
		EClass OCL_VOID = eINSTANCE.getOclVoid();

		/**
		 * The meta object literal for the '{@link java.util.Collection <em>Ordered Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOrderedCollection()
		 * @generated
		 */
		EClass ORDERED_COLLECTION = eINSTANCE.getOrderedCollection();

		/**
		 * The meta object literal for the '{@link org.eclipse.ocl.pivot.values.OrderedSet <em>Ordered Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.OrderedSet
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getOrderedSet()
		 * @generated
		 */
		EClass ORDERED_SET = eINSTANCE.getOrderedSet();

		/**
		 * The meta object literal for the '{@link java.util.List <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '{@link java.util.Set <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link java.util.Collection <em>Unique Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getUniqueCollection()
		 * @generated
		 */
		EClass UNIQUE_COLLECTION = eINSTANCE.getUniqueCollection();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.IntegerValue
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Real</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.RealValue
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getReal()
		 * @generated
		 */
		EDataType REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ocl.pivot.values.UnlimitedNaturalValue
		 * @see oclstdlib.impl.OclstdlibPackageImpl#getUnlimitedNatural()
		 * @generated
		 */
		EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

	}

} //OclstdlibPackage
