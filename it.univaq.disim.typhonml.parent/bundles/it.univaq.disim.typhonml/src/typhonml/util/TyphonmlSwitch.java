/**
 */
package typhonml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import typhonml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see typhonml.TyphonmlPackage
 * @generated
 */
public class TyphonmlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TyphonmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlSwitch() {
		if (modelPackage == null) {
			modelPackage = TyphonmlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TyphonmlPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.PRIMITIVE_DATA_TYPE: {
				PrimitiveDataType primitiveDataType = (PrimitiveDataType)theEObject;
				T result = casePrimitiveDataType(primitiveDataType);
				if (result == null) result = caseDataType(primitiveDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.INT_TYPE: {
				IntType intType = (IntType)theEObject;
				T result = caseIntType(intType);
				if (result == null) result = casePrimitiveDataType(intType);
				if (result == null) result = caseDataType(intType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.BIGINT_TYPE: {
				BigintType bigintType = (BigintType)theEObject;
				T result = caseBigintType(bigintType);
				if (result == null) result = casePrimitiveDataType(bigintType);
				if (result == null) result = caseDataType(bigintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.STRING_TYPE: {
				StringType stringType = (StringType)theEObject;
				T result = caseStringType(stringType);
				if (result == null) result = casePrimitiveDataType(stringType);
				if (result == null) result = caseDataType(stringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.TEXT_TYPE: {
				TextType textType = (TextType)theEObject;
				T result = caseTextType(textType);
				if (result == null) result = casePrimitiveDataType(textType);
				if (result == null) result = caseDataType(textType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = casePrimitiveDataType(pointType);
				if (result == null) result = caseDataType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = casePrimitiveDataType(polygonType);
				if (result == null) result = caseDataType(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.BOOL_TYPE: {
				BoolType boolType = (BoolType)theEObject;
				T result = caseBoolType(boolType);
				if (result == null) result = casePrimitiveDataType(boolType);
				if (result == null) result = caseDataType(boolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.FLOAT_TYPE: {
				FloatType floatType = (FloatType)theEObject;
				T result = caseFloatType(floatType);
				if (result == null) result = casePrimitiveDataType(floatType);
				if (result == null) result = caseDataType(floatType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.BLOB_TYPE: {
				BlobType blobType = (BlobType)theEObject;
				T result = caseBlobType(blobType);
				if (result == null) result = casePrimitiveDataType(blobType);
				if (result == null) result = caseDataType(blobType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.FREETEXT_TYPE: {
				FreetextType freetextType = (FreetextType)theEObject;
				T result = caseFreetextType(freetextType);
				if (result == null) result = casePrimitiveDataType(freetextType);
				if (result == null) result = caseDataType(freetextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.NLP_TASK: {
				NlpTask nlpTask = (NlpTask)theEObject;
				T result = caseNlpTask(nlpTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = casePrimitiveDataType(dateType);
				if (result == null) result = caseDataType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DATETIME_TYPE: {
				DatetimeType datetimeType = (DatetimeType)theEObject;
				T result = caseDatetimeType(datetimeType);
				if (result == null) result = casePrimitiveDataType(datetimeType);
				if (result == null) result = caseDataType(datetimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CUSTOM_DATA_TYPE: {
				CustomDataType customDataType = (CustomDataType)theEObject;
				T result = caseCustomDataType(customDataType);
				if (result == null) result = caseDataType(customDataType);
				if (result == null) result = caseNamedElement(customDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CUSTOM_DATA_TYPE_ITEM: {
				CustomDataTypeItem customDataTypeItem = (CustomDataTypeItem)theEObject;
				T result = caseCustomDataTypeItem(customDataTypeItem);
				if (result == null) result = caseNamedElement(customDataTypeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CUSTOM_DATA_TYPE_IMPLEMENTATION_PACKAGE: {
				CustomDataTypeImplementationPackage customDataTypeImplementationPackage = (CustomDataTypeImplementationPackage)theEObject;
				T result = caseCustomDataTypeImplementationPackage(customDataTypeImplementationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.FUNCTIONAL_TAG: {
				FunctionalTag functionalTag = (FunctionalTag)theEObject;
				T result = caseFunctionalTag(functionalTag);
				if (result == null) result = caseNamedElement(functionalTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.NFUNCTIONAL_TAG: {
				NFunctionalTag nFunctionalTag = (NFunctionalTag)theEObject;
				T result = caseNFunctionalTag(nFunctionalTag);
				if (result == null) result = caseNamedElement(nFunctionalTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseNamedElement(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ENTITY_ATTRIBUTE: {
				EntityAttribute entityAttribute = (EntityAttribute)theEObject;
				T result = caseEntityAttribute(entityAttribute);
				if (result == null) result = caseNamedElement(entityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseEntityAttribute(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CUSTOM_ATTRIBUTE: {
				CustomAttribute customAttribute = (CustomAttribute)theEObject;
				T result = caseCustomAttribute(customAttribute);
				if (result == null) result = caseEntityAttribute(customAttribute);
				if (result == null) result = caseNamedElement(customAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				T result = caseRelation(relation);
				if (result == null) result = caseNamedElement(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseNamedElement(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RELATIONAL_DB: {
				RelationalDB relationalDB = (RelationalDB)theEObject;
				T result = caseRelationalDB(relationalDB);
				if (result == null) result = caseDatabase(relationalDB);
				if (result == null) result = caseNamedElement(relationalDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.TABLE: {
				Table table = (Table)theEObject;
				T result = caseTable(table);
				if (result == null) result = caseNamedElement(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.INDEX_SPEC: {
				IndexSpec indexSpec = (IndexSpec)theEObject;
				T result = caseIndexSpec(indexSpec);
				if (result == null) result = caseNamedElement(indexSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ID_SPEC: {
				IdSpec idSpec = (IdSpec)theEObject;
				T result = caseIdSpec(idSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DOCUMENT_DB: {
				DocumentDB documentDB = (DocumentDB)theEObject;
				T result = caseDocumentDB(documentDB);
				if (result == null) result = caseDatabase(documentDB);
				if (result == null) result = caseNamedElement(documentDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.COLLECTION: {
				Collection collection = (Collection)theEObject;
				T result = caseCollection(collection);
				if (result == null) result = caseNamedElement(collection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.KEY_VALUE_DB: {
				KeyValueDB keyValueDB = (KeyValueDB)theEObject;
				T result = caseKeyValueDB(keyValueDB);
				if (result == null) result = caseDatabase(keyValueDB);
				if (result == null) result = caseNamedElement(keyValueDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.KEY_VALUE_ELEMENT: {
				KeyValueElement keyValueElement = (KeyValueElement)theEObject;
				T result = caseKeyValueElement(keyValueElement);
				if (result == null) result = caseNamedElement(keyValueElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.GRAPH_DB: {
				GraphDB graphDB = (GraphDB)theEObject;
				T result = caseGraphDB(graphDB);
				if (result == null) result = caseDatabase(graphDB);
				if (result == null) result = caseNamedElement(graphDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.GRAPH_NODE: {
				GraphNode graphNode = (GraphNode)theEObject;
				T result = caseGraphNode(graphNode);
				if (result == null) result = caseNamedElement(graphNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.GRAPH_ATTRIBUTE: {
				GraphAttribute graphAttribute = (GraphAttribute)theEObject;
				T result = caseGraphAttribute(graphAttribute);
				if (result == null) result = caseNamedElement(graphAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.GRAPH_EDGE: {
				GraphEdge graphEdge = (GraphEdge)theEObject;
				T result = caseGraphEdge(graphEdge);
				if (result == null) result = caseNamedElement(graphEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.GRAPH_EDGE_LABEL: {
				GraphEdgeLabel graphEdgeLabel = (GraphEdgeLabel)theEObject;
				T result = caseGraphEdgeLabel(graphEdgeLabel);
				if (result == null) result = caseNamedElement(graphEdgeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.COLUMN_DB: {
				ColumnDB columnDB = (ColumnDB)theEObject;
				T result = caseColumnDB(columnDB);
				if (result == null) result = caseDatabase(columnDB);
				if (result == null) result = caseNamedElement(columnDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.COLUMN: {
				Column column = (Column)theEObject;
				T result = caseColumn(column);
				if (result == null) result = caseNamedElement(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CHANGE_OPERATOR: {
				ChangeOperator changeOperator = (ChangeOperator)theEObject;
				T result = caseChangeOperator(changeOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_ENTITY: {
				AddEntity addEntity = (AddEntity)theEObject;
				T result = caseAddEntity(addEntity);
				if (result == null) result = caseEntity(addEntity);
				if (result == null) result = caseChangeOperator(addEntity);
				if (result == null) result = caseNamedElement(addEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RENAME_ENTITY: {
				RenameEntity renameEntity = (RenameEntity)theEObject;
				T result = caseRenameEntity(renameEntity);
				if (result == null) result = caseChangeOperator(renameEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.REMOVE_ENTITY: {
				RemoveEntity removeEntity = (RemoveEntity)theEObject;
				T result = caseRemoveEntity(removeEntity);
				if (result == null) result = caseChangeOperator(removeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_ATTRIBUTE: {
				AddAttribute addAttribute = (AddAttribute)theEObject;
				T result = caseAddAttribute(addAttribute);
				if (result == null) result = caseAttribute(addAttribute);
				if (result == null) result = caseChangeOperator(addAttribute);
				if (result == null) result = caseEntityAttribute(addAttribute);
				if (result == null) result = caseNamedElement(addAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CHANGE_ATTRIBUTE_TYPE: {
				ChangeAttributeType changeAttributeType = (ChangeAttributeType)theEObject;
				T result = caseChangeAttributeType(changeAttributeType);
				if (result == null) result = caseChangeOperator(changeAttributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.REMOVE_ATTRIBUTE: {
				RemoveAttribute removeAttribute = (RemoveAttribute)theEObject;
				T result = caseRemoveAttribute(removeAttribute);
				if (result == null) result = caseChangeOperator(removeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RENAME_ATTRIBUTE: {
				RenameAttribute renameAttribute = (RenameAttribute)theEObject;
				T result = caseRenameAttribute(renameAttribute);
				if (result == null) result = caseChangeOperator(renameAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT: {
				ChangeRelationContainement changeRelationContainement = (ChangeRelationContainement)theEObject;
				T result = caseChangeRelationContainement(changeRelationContainement);
				if (result == null) result = caseChangeOperator(changeRelationContainement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_RELATION: {
				AddRelation addRelation = (AddRelation)theEObject;
				T result = caseAddRelation(addRelation);
				if (result == null) result = caseRelation(addRelation);
				if (result == null) result = caseChangeOperator(addRelation);
				if (result == null) result = caseNamedElement(addRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.REMOVE_RELATION: {
				RemoveRelation removeRelation = (RemoveRelation)theEObject;
				T result = caseRemoveRelation(removeRelation);
				if (result == null) result = caseChangeOperator(removeRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RENAME_RELATION: {
				RenameRelation renameRelation = (RenameRelation)theEObject;
				T result = caseRenameRelation(renameRelation);
				if (result == null) result = caseChangeOperator(renameRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ENABLE_RELATION_CONTAINMENT: {
				EnableRelationContainment enableRelationContainment = (EnableRelationContainment)theEObject;
				T result = caseEnableRelationContainment(enableRelationContainment);
				if (result == null) result = caseChangeOperator(enableRelationContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DISABLE_RELATION_CONTAINMENT: {
				DisableRelationContainment disableRelationContainment = (DisableRelationContainment)theEObject;
				T result = caseDisableRelationContainment(disableRelationContainment);
				if (result == null) result = caseChangeOperator(disableRelationContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ENABLE_BIDIRECTIONAL_RELATION: {
				EnableBidirectionalRelation enableBidirectionalRelation = (EnableBidirectionalRelation)theEObject;
				T result = caseEnableBidirectionalRelation(enableBidirectionalRelation);
				if (result == null) result = caseChangeOperator(enableBidirectionalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DISABLE_BIDIRECTIONAL_RELATION: {
				DisableBidirectionalRelation disableBidirectionalRelation = (DisableBidirectionalRelation)theEObject;
				T result = caseDisableBidirectionalRelation(disableBidirectionalRelation);
				if (result == null) result = caseChangeOperator(disableBidirectionalRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY: {
				ChangeRelationCardinality changeRelationCardinality = (ChangeRelationCardinality)theEObject;
				T result = caseChangeRelationCardinality(changeRelationCardinality);
				if (result == null) result = caseChangeOperator(changeRelationCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.SPLIT_ENTITY: {
				SplitEntity splitEntity = (SplitEntity)theEObject;
				T result = caseSplitEntity(splitEntity);
				if (result == null) result = caseChangeOperator(splitEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.SPLIT_ENTITY_VERTICAL: {
				SplitEntityVertical splitEntityVertical = (SplitEntityVertical)theEObject;
				T result = caseSplitEntityVertical(splitEntityVertical);
				if (result == null) result = caseChangeOperator(splitEntityVertical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.SPLIT_ENTITY_HORIZONTAL: {
				SplitEntityHorizontal splitEntityHorizontal = (SplitEntityHorizontal)theEObject;
				T result = caseSplitEntityHorizontal(splitEntityHorizontal);
				if (result == null) result = caseChangeOperator(splitEntityHorizontal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.MIGRATE_ENTITY: {
				MigrateEntity migrateEntity = (MigrateEntity)theEObject;
				T result = caseMigrateEntity(migrateEntity);
				if (result == null) result = caseChangeOperator(migrateEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.MERGE_ENTITY: {
				MergeEntity mergeEntity = (MergeEntity)theEObject;
				T result = caseMergeEntity(mergeEntity);
				if (result == null) result = caseChangeOperator(mergeEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RENAME_TABLE: {
				RenameTable renameTable = (RenameTable)theEObject;
				T result = caseRenameTable(renameTable);
				if (result == null) result = caseChangeOperator(renameTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_INDEX: {
				AddIndex addIndex = (AddIndex)theEObject;
				T result = caseAddIndex(addIndex);
				if (result == null) result = caseChangeOperator(addIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DROP_INDEX: {
				DropIndex dropIndex = (DropIndex)theEObject;
				T result = caseDropIndex(dropIndex);
				if (result == null) result = caseChangeOperator(dropIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_ATTRIBUTES_TO_INDEX: {
				AddAttributesToIndex addAttributesToIndex = (AddAttributesToIndex)theEObject;
				T result = caseAddAttributesToIndex(addAttributesToIndex);
				if (result == null) result = caseChangeOperator(addAttributesToIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.REMOVE_ATTRIBUTES_TO_INDEX: {
				RemoveAttributesToIndex removeAttributesToIndex = (RemoveAttributesToIndex)theEObject;
				T result = caseRemoveAttributesToIndex(removeAttributesToIndex);
				if (result == null) result = caseChangeOperator(removeAttributesToIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RENAME_COLLECTION: {
				RenameCollection renameCollection = (RenameCollection)theEObject;
				T result = caseRenameCollection(renameCollection);
				if (result == null) result = caseChangeOperator(renameCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_COLLECTION_INDEX: {
				AddCollectionIndex addCollectionIndex = (AddCollectionIndex)theEObject;
				T result = caseAddCollectionIndex(addCollectionIndex);
				if (result == null) result = caseChangeOperator(addCollectionIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.DROP_COLLECTION_INDEX: {
				DropCollectionIndex dropCollectionIndex = (DropCollectionIndex)theEObject;
				T result = caseDropCollectionIndex(dropCollectionIndex);
				if (result == null) result = caseChangeOperator(dropCollectionIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_GRAPH_ATTRIBUTE: {
				AddGraphAttribute addGraphAttribute = (AddGraphAttribute)theEObject;
				T result = caseAddGraphAttribute(addGraphAttribute);
				if (result == null) result = caseGraphAttribute(addGraphAttribute);
				if (result == null) result = caseChangeOperator(addGraphAttribute);
				if (result == null) result = caseNamedElement(addGraphAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.REMOVE_GRAPH_ATTRIBUTE: {
				RemoveGraphAttribute removeGraphAttribute = (RemoveGraphAttribute)theEObject;
				T result = caseRemoveGraphAttribute(removeGraphAttribute);
				if (result == null) result = caseChangeOperator(removeGraphAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_GRAPH_EDGE: {
				AddGraphEdge addGraphEdge = (AddGraphEdge)theEObject;
				T result = caseAddGraphEdge(addGraphEdge);
				if (result == null) result = caseChangeOperator(addGraphEdge);
				if (result == null) result = caseGraphEdge(addGraphEdge);
				if (result == null) result = caseNamedElement(addGraphEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.REMOVE_GRAPH_EDGE: {
				RemoveGraphEdge removeGraphEdge = (RemoveGraphEdge)theEObject;
				T result = caseRemoveGraphEdge(removeGraphEdge);
				if (result == null) result = caseChangeOperator(removeGraphEdge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.RENABE_GRAPH_EDGE_LABEL: {
				RenabeGraphEdgeLabel renabeGraphEdgeLabel = (RenabeGraphEdgeLabel)theEObject;
				T result = caseRenabeGraphEdgeLabel(renabeGraphEdgeLabel);
				if (result == null) result = caseChangeOperator(renabeGraphEdgeLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.ADD_CUSTOM_DATA_TYPE_ATTRIBUTE: {
				AddCustomDataTypeAttribute addCustomDataTypeAttribute = (AddCustomDataTypeAttribute)theEObject;
				T result = caseAddCustomDataTypeAttribute(addCustomDataTypeAttribute);
				if (result == null) result = caseAddAttribute(addCustomDataTypeAttribute);
				if (result == null) result = caseAttribute(addCustomDataTypeAttribute);
				if (result == null) result = caseChangeOperator(addCustomDataTypeAttribute);
				if (result == null) result = caseEntityAttribute(addCustomDataTypeAttribute);
				if (result == null) result = caseNamedElement(addCustomDataTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CHANGE_PRIMITIVE_DATA_TYPE_ATTRIBUTE: {
				ChangePrimitiveDataTypeAttribute changePrimitiveDataTypeAttribute = (ChangePrimitiveDataTypeAttribute)theEObject;
				T result = caseChangePrimitiveDataTypeAttribute(changePrimitiveDataTypeAttribute);
				if (result == null) result = caseChangeAttributeType(changePrimitiveDataTypeAttribute);
				if (result == null) result = caseChangeOperator(changePrimitiveDataTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TyphonmlPackage.CHANGE_CUSTOM_DATA_TYPE_ATTRIBUTE: {
				ChangeCustomDataTypeAttribute changeCustomDataTypeAttribute = (ChangeCustomDataTypeAttribute)theEObject;
				T result = caseChangeCustomDataTypeAttribute(changeCustomDataTypeAttribute);
				if (result == null) result = caseChangeAttributeType(changeCustomDataTypeAttribute);
				if (result == null) result = caseChangeOperator(changeCustomDataTypeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDataType(PrimitiveDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntType(IntType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bigint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bigint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigintType(BigintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringType(StringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextType(TextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolType(BoolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatType(FloatType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlobType(BlobType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Freetext Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Freetext Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreetextType(FreetextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nlp Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nlp Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNlpTask(NlpTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datetime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datetime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatetimeType(DatetimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDataType(CustomDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Data Type Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Data Type Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDataTypeItem(CustomDataTypeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Data Type Implementation Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Data Type Implementation Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomDataTypeImplementationPackage(CustomDataTypeImplementationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalTag(FunctionalTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFunctional Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFunctional Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNFunctionalTag(NFunctionalTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityAttribute(EntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomAttribute(CustomAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalDB(RelationalDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Index Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Index Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexSpec(IndexSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdSpec(IdSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentDB(DocumentDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollection(Collection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueDB(KeyValueDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueElement(KeyValueElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphDB(GraphDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphNode(GraphNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphAttribute(GraphAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphEdge(GraphEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph Edge Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph Edge Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphEdgeLabel(GraphEdgeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnDB(ColumnDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOperator(ChangeOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddEntity(AddEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameEntity(RenameEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveEntity(RemoveEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAttribute(AddAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAttributeType(ChangeAttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAttribute(RemoveAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameAttribute(RenameAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Relation Containement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Relation Containement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRelationContainement(ChangeRelationContainement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddRelation(AddRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveRelation(RemoveRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameRelation(RenameRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Relation Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Relation Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableRelationContainment(EnableRelationContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Relation Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Relation Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableRelationContainment(DisableRelationContainment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enable Bidirectional Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enable Bidirectional Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnableBidirectionalRelation(EnableBidirectionalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Bidirectional Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Bidirectional Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableBidirectionalRelation(DisableBidirectionalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Relation Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Relation Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRelationCardinality(ChangeRelationCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitEntity(SplitEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Entity Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Entity Vertical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitEntityVertical(SplitEntityVertical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Entity Horizontal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Entity Horizontal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitEntityHorizontal(SplitEntityHorizontal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migrate Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migrate Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMigrateEntity(MigrateEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergeEntity(MergeEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameTable(RenameTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddIndex(AddIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropIndex(DropIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Attributes To Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Attributes To Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAttributesToIndex(AddAttributesToIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Attributes To Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Attributes To Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAttributesToIndex(RemoveAttributesToIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameCollection(RenameCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Collection Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Collection Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCollectionIndex(AddCollectionIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Collection Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Collection Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropCollectionIndex(DropCollectionIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Graph Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Graph Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddGraphAttribute(AddGraphAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Graph Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Graph Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveGraphAttribute(RemoveGraphAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Graph Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddGraphEdge(AddGraphEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Graph Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Graph Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveGraphEdge(RemoveGraphEdge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renabe Graph Edge Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renabe Graph Edge Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenabeGraphEdgeLabel(RenabeGraphEdgeLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Custom Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Custom Data Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCustomDataTypeAttribute(AddCustomDataTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Primitive Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Primitive Data Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangePrimitiveDataTypeAttribute(ChangePrimitiveDataTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Custom Data Type Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Custom Data Type Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeCustomDataTypeAttribute(ChangeCustomDataTypeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TyphonmlSwitch
