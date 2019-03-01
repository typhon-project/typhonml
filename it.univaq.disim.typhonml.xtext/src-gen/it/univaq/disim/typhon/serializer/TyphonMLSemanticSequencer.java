/*
 * generated by Xtext 2.16.0
 */
package it.univaq.disim.typhon.serializer;

import com.google.inject.Inject;
import it.univaq.disim.typhon.services.TyphonMLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import typhonml.AddAttribute;
import typhonml.AddEntity;
import typhonml.AddGraphAttribute;
import typhonml.AddGraphEdge;
import typhonml.AddRelation;
import typhonml.Attribute;
import typhonml.ChangeRelationCardinality;
import typhonml.ChangeRelationContainement;
import typhonml.Collection;
import typhonml.Column;
import typhonml.ColumnDB;
import typhonml.CustomDataType;
import typhonml.DataTypeImplementationPackage;
import typhonml.DataTypeItem;
import typhonml.DocumentDB;
import typhonml.Entity;
import typhonml.EntityIdentifier;
import typhonml.FreeText;
import typhonml.GraphAttribute;
import typhonml.GraphDB;
import typhonml.GraphEdge;
import typhonml.GraphEdgeLabel;
import typhonml.GraphNode;
import typhonml.IdSpec;
import typhonml.IndexSpec;
import typhonml.KeyValueDB;
import typhonml.KeyValueElement;
import typhonml.Model;
import typhonml.PrimitiveDataType;
import typhonml.Relation;
import typhonml.RelationalDB;
import typhonml.RemoveAttribute;
import typhonml.RemoveEntity;
import typhonml.RemoveRelation;
import typhonml.RenameAttribute;
import typhonml.RenameEntity;
import typhonml.RenameRelation;
import typhonml.Table;
import typhonml.TyphonmlPackage;

@SuppressWarnings("all")
public class TyphonMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TyphonMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TyphonmlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TyphonmlPackage.ADD_ATTRIBUTE:
				sequence_AddAttribute(context, (AddAttribute) semanticObject); 
				return; 
			case TyphonmlPackage.ADD_ENTITY:
				sequence_AddEntity(context, (AddEntity) semanticObject); 
				return; 
			case TyphonmlPackage.ADD_GRAPH_ATTRIBUTE:
				sequence_AddGraphAttribute(context, (AddGraphAttribute) semanticObject); 
				return; 
			case TyphonmlPackage.ADD_GRAPH_EDGE:
				sequence_AddGraphEdge(context, (AddGraphEdge) semanticObject); 
				return; 
			case TyphonmlPackage.ADD_RELATION:
				sequence_AddRelation(context, (AddRelation) semanticObject); 
				return; 
			case TyphonmlPackage.ATTRIBUTE:
				sequence_Attribute_Impl(context, (Attribute) semanticObject); 
				return; 
			case TyphonmlPackage.CHANGE_RELATION_CARDINALITY:
				sequence_ChangeRelationCardinality(context, (ChangeRelationCardinality) semanticObject); 
				return; 
			case TyphonmlPackage.CHANGE_RELATION_CONTAINEMENT:
				sequence_ChangeRelationContainement(context, (ChangeRelationContainement) semanticObject); 
				return; 
			case TyphonmlPackage.COLLECTION:
				sequence_Collection(context, (Collection) semanticObject); 
				return; 
			case TyphonmlPackage.COLUMN:
				sequence_Column(context, (Column) semanticObject); 
				return; 
			case TyphonmlPackage.COLUMN_DB:
				sequence_ColumnDB(context, (ColumnDB) semanticObject); 
				return; 
			case TyphonmlPackage.CUSTOM_DATA_TYPE:
				sequence_CustomDataType(context, (CustomDataType) semanticObject); 
				return; 
			case TyphonmlPackage.DATA_TYPE_IMPLEMENTATION_PACKAGE:
				sequence_DataTypeImplementationPackage(context, (DataTypeImplementationPackage) semanticObject); 
				return; 
			case TyphonmlPackage.DATA_TYPE_ITEM:
				sequence_DataTypeItem(context, (DataTypeItem) semanticObject); 
				return; 
			case TyphonmlPackage.DOCUMENT_DB:
				sequence_DocumentDB(context, (DocumentDB) semanticObject); 
				return; 
			case TyphonmlPackage.ENTITY:
				sequence_Entity_Impl(context, (Entity) semanticObject); 
				return; 
			case TyphonmlPackage.ENTITY_IDENTIFIER:
				sequence_EntityIdentifier(context, (EntityIdentifier) semanticObject); 
				return; 
			case TyphonmlPackage.FREE_TEXT:
				sequence_FreeText(context, (FreeText) semanticObject); 
				return; 
			case TyphonmlPackage.GRAPH_ATTRIBUTE:
				sequence_GraphAttribute_Impl(context, (GraphAttribute) semanticObject); 
				return; 
			case TyphonmlPackage.GRAPH_DB:
				sequence_GraphDB(context, (GraphDB) semanticObject); 
				return; 
			case TyphonmlPackage.GRAPH_EDGE:
				sequence_GraphEdge_Impl(context, (GraphEdge) semanticObject); 
				return; 
			case TyphonmlPackage.GRAPH_EDGE_LABEL:
				sequence_GraphEdgeLabel(context, (GraphEdgeLabel) semanticObject); 
				return; 
			case TyphonmlPackage.GRAPH_NODE:
				sequence_GraphNode(context, (GraphNode) semanticObject); 
				return; 
			case TyphonmlPackage.ID_SPEC:
				sequence_IdSpec(context, (IdSpec) semanticObject); 
				return; 
			case TyphonmlPackage.INDEX_SPEC:
				sequence_IndexSpec(context, (IndexSpec) semanticObject); 
				return; 
			case TyphonmlPackage.KEY_VALUE_DB:
				sequence_KeyValueDB(context, (KeyValueDB) semanticObject); 
				return; 
			case TyphonmlPackage.KEY_VALUE_ELEMENT:
				sequence_KeyValueElement(context, (KeyValueElement) semanticObject); 
				return; 
			case TyphonmlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TyphonmlPackage.PRIMITIVE_DATA_TYPE:
				sequence_PrimitiveDataType_Impl(context, (PrimitiveDataType) semanticObject); 
				return; 
			case TyphonmlPackage.RELATION:
				sequence_Relation_Impl(context, (Relation) semanticObject); 
				return; 
			case TyphonmlPackage.RELATIONAL_DB:
				sequence_RelationalDB(context, (RelationalDB) semanticObject); 
				return; 
			case TyphonmlPackage.REMOVE_ATTRIBUTE:
				sequence_RemoveAttribute(context, (RemoveAttribute) semanticObject); 
				return; 
			case TyphonmlPackage.REMOVE_ENTITY:
				sequence_RemoveEntity(context, (RemoveEntity) semanticObject); 
				return; 
			case TyphonmlPackage.REMOVE_RELATION:
				sequence_RemoveRelation(context, (RemoveRelation) semanticObject); 
				return; 
			case TyphonmlPackage.RENAME_ATTRIBUTE:
				sequence_RenameAttribute(context, (RenameAttribute) semanticObject); 
				return; 
			case TyphonmlPackage.RENAME_ENTITY:
				sequence_RenameEntity(context, (RenameEntity) semanticObject); 
				return; 
			case TyphonmlPackage.RENAME_RELATION:
				sequence_RenameRelation(context, (RenameRelation) semanticObject); 
				return; 
			case TyphonmlPackage.TABLE:
				sequence_Table(context, (Table) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ChangeOperator returns AddAttribute
	 *     Attribute returns AddAttribute
	 *     AddAttribute returns AddAttribute
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString type=[DataType|EString])
	 */
	protected void sequence_AddAttribute(ISerializationContext context, AddAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns AddEntity
	 *     Entity returns AddEntity
	 *     AddEntity returns AddEntity
	 *
	 * Constraint:
	 *     (
	 *         importedNamespace=EString? 
	 *         name=EString 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (relations+=Relation relations+=Relation*)? 
	 *         identifer=EntityIdentifier
	 *     )
	 */
	protected void sequence_AddEntity(ISerializationContext context, AddEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphAttribute returns AddGraphAttribute
	 *     AddGraphAttribute returns AddGraphAttribute
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString value=[Attribute|EString]?)
	 */
	protected void sequence_AddGraphAttribute(ISerializationContext context, AddGraphAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphEdge returns AddGraphEdge
	 *     AddGraphEdge returns AddGraphEdge
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString from=[GraphNode|EString]? to=[GraphNode|EString]? (labels+=GraphEdgeLabel labels+=GraphEdgeLabel*)?)
	 */
	protected void sequence_AddGraphEdge(ISerializationContext context, AddGraphEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns AddRelation
	 *     Relation returns AddRelation
	 *     AddRelation returns AddRelation
	 *
	 * Constraint:
	 *     (
	 *         importedNamespace=EString? 
	 *         name=EString 
	 *         isContainment?=':'? 
	 *         type=[Entity|EString] 
	 *         opposite=[Relation|EString]? 
	 *         cardinality=Cardinality?
	 *     )
	 */
	protected void sequence_AddRelation(ISerializationContext context, AddRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *     Attribute_Impl returns Attribute
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString type=[DataType|EString])
	 */
	protected void sequence_Attribute_Impl(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeRelationCardinality returns ChangeRelationCardinality
	 *
	 * Constraint:
	 *     (relation=[Relation|ID] newCardinality=Cardinality)
	 */
	protected void sequence_ChangeRelationCardinality(ISerializationContext context, ChangeRelationCardinality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CARDINALITY__RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CARDINALITY__RELATION));
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChangeRelationCardinalityAccess().getRelationRelationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.CHANGE_RELATION_CARDINALITY__RELATION, false));
		feeder.accept(grammarAccess.getChangeRelationCardinalityAccess().getNewCardinalityCardinalityEnumRuleCall_4_0(), semanticObject.getNewCardinality());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeRelationContainement returns ChangeRelationContainement
	 *
	 * Constraint:
	 *     (relation=[Relation|ID] newContainment=EBooleanObject)
	 */
	protected void sequence_ChangeRelationContainement(ISerializationContext context, ChangeRelationContainement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CONTAINEMENT__RELATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CONTAINEMENT__RELATION));
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChangeRelationContainementAccess().getRelationRelationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.CHANGE_RELATION_CONTAINEMENT__RELATION, false));
		feeder.accept(grammarAccess.getChangeRelationContainementAccess().getNewContainmentEBooleanObjectParserRuleCall_4_0(), semanticObject.getNewContainment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GenericList returns Collection
	 *     Collection returns Collection
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString entity=[Entity|EString])
	 */
	protected void sequence_Collection(ISerializationContext context, Collection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns ColumnDB
	 *     ColumnDB returns ColumnDB
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString (columns+=Column columns+=Column*)?)
	 */
	protected void sequence_ColumnDB(ISerializationContext context, ColumnDB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenericList returns Column
	 *     Column returns Column
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString entity=[Entity|EString] (attributes+=[Attribute|EString] attributes+=[Attribute|EString]*)?)
	 */
	protected void sequence_Column(ISerializationContext context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns CustomDataType
	 *     CustomDataType returns CustomDataType
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString (elements+=DataTypeItem elements+=DataTypeItem*)?)
	 */
	protected void sequence_CustomDataType(ISerializationContext context, CustomDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataTypeImplementationPackage returns DataTypeImplementationPackage
	 *
	 * Constraint:
	 *     location=EString
	 */
	protected void sequence_DataTypeImplementationPackage(ISerializationContext context, DataTypeImplementationPackage semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.DATA_TYPE_IMPLEMENTATION_PACKAGE__LOCATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.DATA_TYPE_IMPLEMENTATION_PACKAGE__LOCATION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeImplementationPackageAccess().getLocationEStringParserRuleCall_1_0(), semanticObject.getLocation());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataTypeItem returns DataTypeItem
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString type=[DataType|EString] implementation=DataTypeImplementationPackage)
	 */
	protected void sequence_DataTypeItem(ISerializationContext context, DataTypeItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns DocumentDB
	 *     DocumentDB returns DocumentDB
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString (collections+=Collection collections+=Collection*)?)
	 */
	protected void sequence_DocumentDB(ISerializationContext context, DocumentDB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EntityIdentifier returns EntityIdentifier
	 *
	 * Constraint:
	 *     (attributes+=[Attribute|EString] attributes+=[Attribute|EString]*)?
	 */
	protected void sequence_EntityIdentifier(ISerializationContext context, EntityIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns Entity
	 *     Entity returns Entity
	 *     Entity_Impl returns Entity
	 *
	 * Constraint:
	 *     (
	 *         importedNamespace=EString? 
	 *         name=EString 
	 *         (attributes+=Attribute attributes+=Attribute*)? 
	 *         (relations+=Relation relations+=Relation*)? 
	 *         identifer=EntityIdentifier? 
	 *         genericList=[GenericList|EString]?
	 *     )
	 */
	protected void sequence_Entity_Impl(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns FreeText
	 *     FreeText returns FreeText
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString)
	 */
	protected void sequence_FreeText(ISerializationContext context, FreeText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphAttribute returns GraphAttribute
	 *     GraphAttribute_Impl returns GraphAttribute
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString value=[Attribute|EString]?)
	 */
	protected void sequence_GraphAttribute_Impl(ISerializationContext context, GraphAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns GraphDB
	 *     GraphDB returns GraphDB
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString (nodes+=GraphNode nodes+=GraphNode*)? (edges+=GraphEdge edges+=GraphEdge*)?)
	 */
	protected void sequence_GraphDB(ISerializationContext context, GraphDB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphEdgeLabel returns GraphEdgeLabel
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString type=[DataType|EString])
	 */
	protected void sequence_GraphEdgeLabel(ISerializationContext context, GraphEdgeLabel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GraphEdge returns GraphEdge
	 *     GraphEdge_Impl returns GraphEdge
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString from=[GraphNode|EString]? to=[GraphNode|EString]? (labels+=GraphEdgeLabel labels+=GraphEdgeLabel*)?)
	 */
	protected void sequence_GraphEdge_Impl(ISerializationContext context, GraphEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenericList returns GraphNode
	 *     GraphNode returns GraphNode
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString entity=[Entity|EString] (attributes+=GraphAttribute attributes+=GraphAttribute*)?)
	 */
	protected void sequence_GraphNode(ISerializationContext context, GraphNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IdSpec returns IdSpec
	 *
	 * Constraint:
	 *     (attributes+=[Attribute|EString] attributes+=[Attribute|EString]*)?
	 */
	protected void sequence_IdSpec(ISerializationContext context, IdSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IndexSpec returns IndexSpec
	 *
	 * Constraint:
	 *     (
	 *         importedNamespace=EString? 
	 *         name=EString 
	 *         (attributes+=[Attribute|EString] attributes+=[Attribute|EString]*)? 
	 *         (references+=[Relation|EString] references+=[Relation|EString]*)?
	 *     )
	 */
	protected void sequence_IndexSpec(ISerializationContext context, IndexSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns KeyValueDB
	 *     KeyValueDB returns KeyValueDB
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString (elements+=KeyValueElement elements+=KeyValueElement*)?)
	 */
	protected void sequence_KeyValueDB(ISerializationContext context, KeyValueDB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     GenericList returns KeyValueElement
	 *     KeyValueElement returns KeyValueElement
	 *
	 * Constraint:
	 *     (importedNamespace=EString? key=EString entity=[Entity|EString] (values+=[DataType|EString] values+=[DataType|EString]*)?)
	 */
	protected void sequence_KeyValueElement(ISerializationContext context, KeyValueElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (dataTypes+=DataType* databases+=Database* changeOperators+=ChangeOperator*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns PrimitiveDataType
	 *     PrimitiveDataType_Impl returns PrimitiveDataType
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString)
	 */
	protected void sequence_PrimitiveDataType_Impl(ISerializationContext context, PrimitiveDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Relation returns Relation
	 *     Relation_Impl returns Relation
	 *
	 * Constraint:
	 *     (
	 *         importedNamespace=EString? 
	 *         name=EString 
	 *         isContainment?=':'? 
	 *         type=[Entity|EString] 
	 *         opposite=[Relation|EString]? 
	 *         cardinality=Cardinality?
	 *     )
	 */
	protected void sequence_Relation_Impl(ISerializationContext context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Database returns RelationalDB
	 *     RelationalDB returns RelationalDB
	 *
	 * Constraint:
	 *     (importedNamespace=EString? name=EString (tables+=Table tables+=Table*)?)
	 */
	protected void sequence_RelationalDB(ISerializationContext context, RelationalDB semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns RemoveAttribute
	 *     RemoveAttribute returns RemoveAttribute
	 *
	 * Constraint:
	 *     attributeToRemove=[Attribute|ID]
	 */
	protected void sequence_RemoveAttribute(ISerializationContext context, RemoveAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveAttributeAccess().getAttributeToRemoveAttributeIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns RemoveEntity
	 *     RemoveEntity returns RemoveEntity
	 *
	 * Constraint:
	 *     entityToRemove=[Entity|ID]
	 */
	protected void sequence_RemoveEntity(ISerializationContext context, RemoveEntity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.REMOVE_ENTITY__ENTITY_TO_REMOVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.REMOVE_ENTITY__ENTITY_TO_REMOVE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveEntityAccess().getEntityToRemoveEntityIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.REMOVE_ENTITY__ENTITY_TO_REMOVE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns RemoveRelation
	 *     RemoveRelation returns RemoveRelation
	 *
	 * Constraint:
	 *     relationToRemove=[Relation|ID]
	 */
	protected void sequence_RemoveRelation(ISerializationContext context, RemoveRelation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.REMOVE_RELATION__RELATION_TO_REMOVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.REMOVE_RELATION__RELATION_TO_REMOVE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoveRelationAccess().getRelationToRemoveRelationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.REMOVE_RELATION__RELATION_TO_REMOVE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns RenameAttribute
	 *     RenameAttribute returns RenameAttribute
	 *
	 * Constraint:
	 *     (attributeToRename=[Attribute|ID] newName=EString)
	 */
	protected void sequence_RenameAttribute(ISerializationContext context, RenameAttribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME));
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.RENAME_ATTRIBUTE__NEW_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.RENAME_ATTRIBUTE__NEW_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameAttributeAccess().getAttributeToRenameAttributeIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME, false));
		feeder.accept(grammarAccess.getRenameAttributeAccess().getNewNameEStringParserRuleCall_4_0(), semanticObject.getNewName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns RenameEntity
	 *     RenameEntity returns RenameEntity
	 *
	 * Constraint:
	 *     (entityToRename=[Entity|ID] newEntityName=EString)
	 */
	protected void sequence_RenameEntity(ISerializationContext context, RenameEntity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.RENAME_ENTITY__ENTITY_TO_RENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.RENAME_ENTITY__ENTITY_TO_RENAME));
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.RENAME_ENTITY__NEW_ENTITY_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.RENAME_ENTITY__NEW_ENTITY_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameEntityAccess().getEntityToRenameEntityIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.RENAME_ENTITY__ENTITY_TO_RENAME, false));
		feeder.accept(grammarAccess.getRenameEntityAccess().getNewEntityNameEStringParserRuleCall_4_0(), semanticObject.getNewEntityName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChangeOperator returns RenameRelation
	 *     RenameRelation returns RenameRelation
	 *
	 * Constraint:
	 *     (relationToRename=[Relation|ID] newRelationName=EString)
	 */
	protected void sequence_RenameRelation(ISerializationContext context, RenameRelation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.RENAME_RELATION__RELATION_TO_RENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.RENAME_RELATION__RELATION_TO_RENAME));
			if (transientValues.isValueTransient(semanticObject, TyphonmlPackage.Literals.RENAME_RELATION__NEW_RELATION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TyphonmlPackage.Literals.RENAME_RELATION__NEW_RELATION_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRenameRelationAccess().getRelationToRenameRelationIDTerminalRuleCall_2_0_1(), semanticObject.eGet(TyphonmlPackage.Literals.RENAME_RELATION__RELATION_TO_RENAME, false));
		feeder.accept(grammarAccess.getRenameRelationAccess().getNewRelationNameEStringParserRuleCall_4_0(), semanticObject.getNewRelationName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     GenericList returns Table
	 *     Table returns Table
	 *
	 * Constraint:
	 *     (
	 *         importedNamespace=EString? 
	 *         name=EString 
	 *         entity=[Entity|EString] 
	 *         db=[Database|EString]? 
	 *         indexSpec=IndexSpec? 
	 *         idSpec=IdSpec?
	 *     )
	 */
	protected void sequence_Table(ISerializationContext context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
