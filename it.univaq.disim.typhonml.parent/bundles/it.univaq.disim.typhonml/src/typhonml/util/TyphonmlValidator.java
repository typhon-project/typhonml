/**
 */
package typhonml.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import typhonml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see typhonml.TyphonmlPackage
 * @generated
 */
public class TyphonmlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TyphonmlValidator INSTANCE = new TyphonmlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "typhonml";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TyphonmlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TyphonmlPackage.MODEL:
				return validateModel((Model)value, diagnostics, context);
			case TyphonmlPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case TyphonmlPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case TyphonmlPackage.INT_TYPE:
				return validateIntType((IntType)value, diagnostics, context);
			case TyphonmlPackage.BIGINT_TYPE:
				return validateBigintType((BigintType)value, diagnostics, context);
			case TyphonmlPackage.STRING_TYPE:
				return validateStringType((StringType)value, diagnostics, context);
			case TyphonmlPackage.TEXT_TYPE:
				return validateTextType((TextType)value, diagnostics, context);
			case TyphonmlPackage.POINT_TYPE:
				return validatePointType((PointType)value, diagnostics, context);
			case TyphonmlPackage.POLYGON_TYPE:
				return validatePolygonType((PolygonType)value, diagnostics, context);
			case TyphonmlPackage.BOOL_TYPE:
				return validateBoolType((BoolType)value, diagnostics, context);
			case TyphonmlPackage.FLOAT_TYPE:
				return validateFloatType((FloatType)value, diagnostics, context);
			case TyphonmlPackage.BLOB_TYPE:
				return validateBlobType((BlobType)value, diagnostics, context);
			case TyphonmlPackage.FREETEXT_TYPE:
				return validateFreetextType((FreetextType)value, diagnostics, context);
			case TyphonmlPackage.NLP_TASK:
				return validateNlpTask((NlpTask)value, diagnostics, context);
			case TyphonmlPackage.DATE_TYPE:
				return validateDateType((DateType)value, diagnostics, context);
			case TyphonmlPackage.DATETIME_TYPE:
				return validateDatetimeType((DatetimeType)value, diagnostics, context);
			case TyphonmlPackage.CUSTOM_DATA_TYPE:
				return validateCustomDataType((CustomDataType)value, diagnostics, context);
			case TyphonmlPackage.SUPER_DATA_TYPE:
				return validateSuperDataType((SuperDataType)value, diagnostics, context);
			case TyphonmlPackage.COMPLEX_DATA_TYPE:
				return validateComplexDataType((ComplexDataType)value, diagnostics, context);
			case TyphonmlPackage.SIMPLE_DATA_TYPE:
				return validateSimpleDataType((SimpleDataType)value, diagnostics, context);
			case TyphonmlPackage.CUSTOM_DATA_TYPE_IMPLEMENTATION_PACKAGE:
				return validateCustomDataTypeImplementationPackage((CustomDataTypeImplementationPackage)value, diagnostics, context);
			case TyphonmlPackage.FUNCTIONAL_TAG:
				return validateFunctionalTag((FunctionalTag)value, diagnostics, context);
			case TyphonmlPackage.NFUNCTIONAL_TAG:
				return validateNFunctionalTag((NFunctionalTag)value, diagnostics, context);
			case TyphonmlPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case TyphonmlPackage.ENTITY_ATTRIBUTE_KIND:
				return validateEntityAttributeKind((EntityAttributeKind)value, diagnostics, context);
			case TyphonmlPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case TyphonmlPackage.CUSTOM_ATTRIBUTE:
				return validateCustomAttribute((CustomAttribute)value, diagnostics, context);
			case TyphonmlPackage.RELATION:
				return validateRelation((Relation)value, diagnostics, context);
			case TyphonmlPackage.DATABASE:
				return validateDatabase((Database)value, diagnostics, context);
			case TyphonmlPackage.RELATIONAL_DB:
				return validateRelationalDB((RelationalDB)value, diagnostics, context);
			case TyphonmlPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case TyphonmlPackage.INDEX_SPEC:
				return validateIndexSpec((IndexSpec)value, diagnostics, context);
			case TyphonmlPackage.ID_SPEC:
				return validateIdSpec((IdSpec)value, diagnostics, context);
			case TyphonmlPackage.DOCUMENT_DB:
				return validateDocumentDB((DocumentDB)value, diagnostics, context);
			case TyphonmlPackage.COLLECTION:
				return validateCollection((Collection)value, diagnostics, context);
			case TyphonmlPackage.KEY_VALUE_DB:
				return validateKeyValueDB((KeyValueDB)value, diagnostics, context);
			case TyphonmlPackage.KEY_VALUE_ELEMENT:
				return validateKeyValueElement((KeyValueElement)value, diagnostics, context);
			case TyphonmlPackage.GRAPH_DB:
				return validateGraphDB((GraphDB)value, diagnostics, context);
			case TyphonmlPackage.GRAPH_NODE:
				return validateGraphNode((GraphNode)value, diagnostics, context);
			case TyphonmlPackage.GRAPH_ATTRIBUTE:
				return validateGraphAttribute((GraphAttribute)value, diagnostics, context);
			case TyphonmlPackage.GRAPH_EDGE:
				return validateGraphEdge((GraphEdge)value, diagnostics, context);
			case TyphonmlPackage.GRAPH_EDGE_LABEL:
				return validateGraphEdgeLabel((GraphEdgeLabel)value, diagnostics, context);
			case TyphonmlPackage.COLUMN_DB:
				return validateColumnDB((ColumnDB)value, diagnostics, context);
			case TyphonmlPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case TyphonmlPackage.CHANGE_OPERATOR:
				return validateChangeOperator((ChangeOperator)value, diagnostics, context);
			case TyphonmlPackage.ADD_ENTITY:
				return validateAddEntity((AddEntity)value, diagnostics, context);
			case TyphonmlPackage.RENAME_ENTITY:
				return validateRenameEntity((RenameEntity)value, diagnostics, context);
			case TyphonmlPackage.REMOVE_ENTITY:
				return validateRemoveEntity((RemoveEntity)value, diagnostics, context);
			case TyphonmlPackage.ADD_ATTRIBUTE:
				return validateAddAttribute((AddAttribute)value, diagnostics, context);
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE:
				return validateChangeAttributeType((ChangeAttributeType)value, diagnostics, context);
			case TyphonmlPackage.REMOVE_ATTRIBUTE:
				return validateRemoveAttribute((RemoveAttribute)value, diagnostics, context);
			case TyphonmlPackage.RENAME_ATTRIBUTE:
				return validateRenameAttribute((RenameAttribute)value, diagnostics, context);
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT:
				return validateChangeRelationContainement((ChangeRelationContainement)value, diagnostics, context);
			case TyphonmlPackage.ADD_RELATION:
				return validateAddRelation((AddRelation)value, diagnostics, context);
			case TyphonmlPackage.REMOVE_RELATION:
				return validateRemoveRelation((RemoveRelation)value, diagnostics, context);
			case TyphonmlPackage.RENAME_RELATION:
				return validateRenameRelation((RenameRelation)value, diagnostics, context);
			case TyphonmlPackage.ENABLE_RELATION_CONTAINMENT:
				return validateEnableRelationContainment((EnableRelationContainment)value, diagnostics, context);
			case TyphonmlPackage.DISABLE_RELATION_CONTAINMENT:
				return validateDisableRelationContainment((DisableRelationContainment)value, diagnostics, context);
			case TyphonmlPackage.ENABLE_BIDIRECTIONAL_RELATION:
				return validateEnableBidirectionalRelation((EnableBidirectionalRelation)value, diagnostics, context);
			case TyphonmlPackage.DISABLE_BIDIRECTIONAL_RELATION:
				return validateDisableBidirectionalRelation((DisableBidirectionalRelation)value, diagnostics, context);
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY:
				return validateChangeRelationCardinality((ChangeRelationCardinality)value, diagnostics, context);
			case TyphonmlPackage.SPLIT_ENTITY:
				return validateSplitEntity((SplitEntity)value, diagnostics, context);
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL:
				return validateSplitEntityVertical((SplitEntityVertical)value, diagnostics, context);
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL:
				return validateSplitEntityHorizontal((SplitEntityHorizontal)value, diagnostics, context);
			case TyphonmlPackage.MIGRATE_ENTITY:
				return validateMigrateEntity((MigrateEntity)value, diagnostics, context);
			case TyphonmlPackage.MERGE_ENTITY:
				return validateMergeEntity((MergeEntity)value, diagnostics, context);
			case TyphonmlPackage.RENAME_TABLE:
				return validateRenameTable((RenameTable)value, diagnostics, context);
			case TyphonmlPackage.ADD_INDEX:
				return validateAddIndex((AddIndex)value, diagnostics, context);
			case TyphonmlPackage.DROP_INDEX:
				return validateDropIndex((DropIndex)value, diagnostics, context);
			case TyphonmlPackage.ADD_ATTRIBUTES_TO_INDEX:
				return validateAddAttributesToIndex((AddAttributesToIndex)value, diagnostics, context);
			case TyphonmlPackage.REMOVE_ATTRIBUTES_TO_INDEX:
				return validateRemoveAttributesToIndex((RemoveAttributesToIndex)value, diagnostics, context);
			case TyphonmlPackage.RENAME_COLLECTION:
				return validateRenameCollection((RenameCollection)value, diagnostics, context);
			case TyphonmlPackage.ADD_COLLECTION_INDEX:
				return validateAddCollectionIndex((AddCollectionIndex)value, diagnostics, context);
			case TyphonmlPackage.DROP_COLLECTION_INDEX:
				return validateDropCollectionIndex((DropCollectionIndex)value, diagnostics, context);
			case TyphonmlPackage.ADD_GRAPH_ATTRIBUTE:
				return validateAddGraphAttribute((AddGraphAttribute)value, diagnostics, context);
			case TyphonmlPackage.REMOVE_GRAPH_ATTRIBUTE:
				return validateRemoveGraphAttribute((RemoveGraphAttribute)value, diagnostics, context);
			case TyphonmlPackage.ADD_GRAPH_EDGE:
				return validateAddGraphEdge((AddGraphEdge)value, diagnostics, context);
			case TyphonmlPackage.REMOVE_GRAPH_EDGE:
				return validateRemoveGraphEdge((RemoveGraphEdge)value, diagnostics, context);
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL:
				return validateRenabeGraphEdgeLabel((RenabeGraphEdgeLabel)value, diagnostics, context);
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE:
				return validateChangePrimitiveDataTypeAttribute((ChangePrimitiveDataTypeAttribute)value, diagnostics, context);
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE:
				return validateChangeCustomDataTypeAttribute((ChangeCustomDataTypeAttribute)value, diagnostics, context);
			case TyphonmlPackage.ADD_CUSTOM_DATA_TYPE:
				return validateAddCustomDataType((AddCustomDataType)value, diagnostics, context);
			case TyphonmlPackage.ADD_PRIMITIVE_DATA_TYPE_ATTRIBUTE:
				return validateAddPrimitiveDataTypeAttribute((AddPrimitiveDataTypeAttribute)value, diagnostics, context);
			case TyphonmlPackage.ADD_CUSTOM_DATA_TYPE_ATTRIBUTE:
				return validateAddCustomDataTypeAttribute((AddCustomDataTypeAttribute)value, diagnostics, context);
			case TyphonmlPackage.NLP_TASK_TYPE:
				return validateNlpTaskType((NlpTaskType)value, diagnostics, context);
			case TyphonmlPackage.CARDINALITY:
				return validateCardinality((Cardinality)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModel(Model model, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(model, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntType(IntType intType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(intType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBigintType(BigintType bigintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bigintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringType(StringType stringType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextType(TextType textType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointType(PointType pointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolygonType(PolygonType polygonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(polygonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoolType(BoolType boolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFloatType(FloatType floatType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(floatType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlobType(BlobType blobType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blobType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFreetextType(FreetextType freetextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(freetextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNlpTask(NlpTask nlpTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nlpTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateType(DateType dateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatetimeType(DatetimeType datetimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datetimeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomDataType(CustomDataType customDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperDataType(SuperDataType superDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(superDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexDataType(ComplexDataType complexDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleDataType(SimpleDataType simpleDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomDataTypeImplementationPackage(CustomDataTypeImplementationPackage customDataTypeImplementationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customDataTypeImplementationPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalTag(FunctionalTag functionalTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionalTag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNFunctionalTag(NFunctionalTag nFunctionalTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nFunctionalTag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_EmptyEntity(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EmptyEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__EMPTY_ENTITY__EEXPRESSION = "attributes->size() + relations->size() > 0";

	/**
	 * Validates the EmptyEntity constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_EmptyEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EmptyEntity",
				 ENTITY__EMPTY_ENTITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntityAttributeKind(EntityAttributeKind entityAttributeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entityAttributeKind, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomAttribute(CustomAttribute customAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelation(Relation relation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatabase(Database database, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(database, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationalDB(RelationalDB relationalDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationalDB, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(table, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndexSpec(IndexSpec indexSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(indexSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdSpec(IdSpec idSpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(idSpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentDB(DocumentDB documentDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentDB, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollection(Collection collection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyValueDB(KeyValueDB keyValueDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyValueDB, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyValueElement(KeyValueElement keyValueElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keyValueElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keyValueElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeyValueElement_AttributesAreMappedToGraphEdge(keyValueElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the AttributesAreMappedToGraphEdge constraint of '<em>Key Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEY_VALUE_ELEMENT__ATTRIBUTES_ARE_MAPPED_TO_GRAPH_EDGE__EEXPRESSION = "\n" +
		"\t\t\ttyphonml::GraphEdge.allInstances()->select(x | values->collect(Attribute::Entity)->includes(x.entity))->size()=0";

	/**
	 * Validates the AttributesAreMappedToGraphEdge constraint of '<em>Key Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyValueElement_AttributesAreMappedToGraphEdge(KeyValueElement keyValueElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.KEY_VALUE_ELEMENT,
				 keyValueElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AttributesAreMappedToGraphEdge",
				 KEY_VALUE_ELEMENT__ATTRIBUTES_ARE_MAPPED_TO_GRAPH_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphDB(GraphDB graphDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphDB, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphNode(GraphNode graphNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphAttribute(GraphAttribute graphAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(graphEdge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_EntitiesWithoutTwoReferences(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongFrom(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongTo(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongFromCardinality(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongToCardinality(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_BlobAttributesNotSupportedByGraphEdge(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_FromTypeCanNotBeGraphBacked(graphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_ToTypeCanNotBeGraphBacked(graphEdge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EntitiesWithoutTwoReferences constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__ENTITIES_WITHOUT_TWO_REFERENCES__EEXPRESSION = "entity.relations->size()  > 1";

	/**
	 * Validates the EntitiesWithoutTwoReferences constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_EntitiesWithoutTwoReferences(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EntitiesWithoutTwoReferences",
				 GRAPH_EDGE__ENTITIES_WITHOUT_TWO_REFERENCES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the WrongFrom constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__WRONG_FROM__EEXPRESSION = "from.oclContainer() = entity";

	/**
	 * Validates the WrongFrom constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_WrongFrom(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WrongFrom",
				 GRAPH_EDGE__WRONG_FROM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the WrongTo constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__WRONG_TO__EEXPRESSION = "to.oclContainer() = entity";

	/**
	 * Validates the WrongTo constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_WrongTo(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WrongTo",
				 GRAPH_EDGE__WRONG_TO__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the WrongFromCardinality constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__WRONG_FROM_CARDINALITY__EEXPRESSION = "from.cardinality = Cardinality::one";

	/**
	 * Validates the WrongFromCardinality constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_WrongFromCardinality(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WrongFromCardinality",
				 GRAPH_EDGE__WRONG_FROM_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the WrongToCardinality constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__WRONG_TO_CARDINALITY__EEXPRESSION = "to.cardinality = Cardinality::one";

	/**
	 * Validates the WrongToCardinality constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_WrongToCardinality(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "WrongToCardinality",
				 GRAPH_EDGE__WRONG_TO_CARDINALITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BlobAttributesNotSupportedByGraphEdge constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__BLOB_ATTRIBUTES_NOT_SUPPORTED_BY_GRAPH_EDGE__EEXPRESSION = "\n" +
		"\t\t\tentity.attributes->select(z | z.oclIsKindOf(Attribute))\n" +
		"\t\t\t\t->select(z | z.oclAsType(Attribute).type.oclIsTypeOf(BlobType))->size()=0";

	/**
	 * Validates the BlobAttributesNotSupportedByGraphEdge constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_BlobAttributesNotSupportedByGraphEdge(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BlobAttributesNotSupportedByGraphEdge",
				 GRAPH_EDGE__BLOB_ATTRIBUTES_NOT_SUPPORTED_BY_GRAPH_EDGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the FromTypeCanNotBeGraphBacked constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__FROM_TYPE_CAN_NOT_BE_GRAPH_BACKED__EEXPRESSION = "\n" +
		"\t\t\ttyphonml::GraphEdge.allInstances()->select(x | x.entity = from.type)->size() = 0";

	/**
	 * Validates the FromTypeCanNotBeGraphBacked constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_FromTypeCanNotBeGraphBacked(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FromTypeCanNotBeGraphBacked",
				 GRAPH_EDGE__FROM_TYPE_CAN_NOT_BE_GRAPH_BACKED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ToTypeCanNotBeGraphBacked constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GRAPH_EDGE__TO_TYPE_CAN_NOT_BE_GRAPH_BACKED__EEXPRESSION = "\n" +
		"\t\t\ttyphonml::GraphEdge.allInstances()->select(x | x.entity = to.type)->size() = 0";

	/**
	 * Validates the ToTypeCanNotBeGraphBacked constraint of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdge_ToTypeCanNotBeGraphBacked(GraphEdge graphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(TyphonmlPackage.Literals.GRAPH_EDGE,
				 graphEdge,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ToTypeCanNotBeGraphBacked",
				 GRAPH_EDGE__TO_TYPE_CAN_NOT_BE_GRAPH_BACKED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphEdgeLabel(GraphEdgeLabel graphEdgeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphEdgeLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumnDB(ColumnDB columnDB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(columnDB, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeOperator(ChangeOperator changeOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddEntity(AddEntity addEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_EmptyEntity(addEntity, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameEntity(RenameEntity renameEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveEntity(RemoveEntity removeEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddAttribute(AddAttribute addAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeAttributeType(ChangeAttributeType changeAttributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeAttributeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveAttribute(RemoveAttribute removeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameAttribute(RenameAttribute renameAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeRelationContainement(ChangeRelationContainement changeRelationContainement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeRelationContainement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddRelation(AddRelation addRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveRelation(RemoveRelation removeRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameRelation(RenameRelation renameRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableRelationContainment(EnableRelationContainment enableRelationContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableRelationContainment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableRelationContainment(DisableRelationContainment disableRelationContainment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableRelationContainment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableBidirectionalRelation(EnableBidirectionalRelation enableBidirectionalRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enableBidirectionalRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableBidirectionalRelation(DisableBidirectionalRelation disableBidirectionalRelation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableBidirectionalRelation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeRelationCardinality(ChangeRelationCardinality changeRelationCardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeRelationCardinality, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitEntity(SplitEntity splitEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splitEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitEntityVertical(SplitEntityVertical splitEntityVertical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splitEntityVertical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSplitEntityHorizontal(SplitEntityHorizontal splitEntityHorizontal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(splitEntityHorizontal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMigrateEntity(MigrateEntity migrateEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(migrateEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMergeEntity(MergeEntity mergeEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mergeEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameTable(RenameTable renameTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddIndex(AddIndex addIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropIndex(DropIndex dropIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddAttributesToIndex(AddAttributesToIndex addAttributesToIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addAttributesToIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveAttributesToIndex(RemoveAttributesToIndex removeAttributesToIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeAttributesToIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenameCollection(RenameCollection renameCollection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renameCollection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCollectionIndex(AddCollectionIndex addCollectionIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCollectionIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDropCollectionIndex(DropCollectionIndex dropCollectionIndex, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dropCollectionIndex, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddGraphAttribute(AddGraphAttribute addGraphAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addGraphAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveGraphAttribute(RemoveGraphAttribute removeGraphAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeGraphAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddGraphEdge(AddGraphEdge addGraphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(addGraphEdge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_EntitiesWithoutTwoReferences(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongFrom(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongTo(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongFromCardinality(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_WrongToCardinality(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_BlobAttributesNotSupportedByGraphEdge(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_FromTypeCanNotBeGraphBacked(addGraphEdge, diagnostics, context);
		if (result || diagnostics != null) result &= validateGraphEdge_ToTypeCanNotBeGraphBacked(addGraphEdge, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRemoveGraphEdge(RemoveGraphEdge removeGraphEdge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(removeGraphEdge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRenabeGraphEdgeLabel(RenabeGraphEdgeLabel renabeGraphEdgeLabel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(renabeGraphEdgeLabel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCustomDataTypeAttribute(AddCustomDataTypeAttribute addCustomDataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCustomDataTypeAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangePrimitiveDataTypeAttribute(ChangePrimitiveDataTypeAttribute changePrimitiveDataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changePrimitiveDataTypeAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChangeCustomDataTypeAttribute(ChangeCustomDataTypeAttribute changeCustomDataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(changeCustomDataTypeAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddCustomDataType(AddCustomDataType addCustomDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addCustomDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddPrimitiveDataTypeAttribute(AddPrimitiveDataTypeAttribute addPrimitiveDataTypeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addPrimitiveDataTypeAttribute, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNlpTaskType(NlpTaskType nlpTaskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinality(Cardinality cardinality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TyphonmlValidator
