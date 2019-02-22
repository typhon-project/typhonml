/*
 * generated by Xtext 2.14.0
 */
package it.univaq.disim.typhon.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import it.univaq.disim.typhon.ide.contentassist.antlr.internal.InternalTyphonMLParser;
import it.univaq.disim.typhon.services.TyphonMLGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TyphonMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TyphonMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TyphonMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
			builder.put(grammarAccess.getAttributeAccess().getAlternatives(), "rule__Attribute__Alternatives");
			builder.put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
			builder.put(grammarAccess.getGenericListAccess().getAlternatives(), "rule__GenericList__Alternatives");
			builder.put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
			builder.put(grammarAccess.getDatabaseAccess().getAlternatives(), "rule__Database__Alternatives");
			builder.put(grammarAccess.getGraphAttributeAccess().getAlternatives(), "rule__GraphAttribute__Alternatives");
			builder.put(grammarAccess.getGraphEdgeAccess().getAlternatives(), "rule__GraphEdge__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEBooleanObjectAccess().getAlternatives(), "rule__EBooleanObject__Alternatives");
			builder.put(grammarAccess.getCardinalityAccess().getAlternatives(), "rule__Cardinality__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getAddAttributeAccess().getGroup(), "rule__AddAttribute__Group__0");
			builder.put(grammarAccess.getAddAttributeAccess().getGroup_4(), "rule__AddAttribute__Group_4__0");
			builder.put(grammarAccess.getAddAttributeAccess().getGroup_5(), "rule__AddAttribute__Group_5__0");
			builder.put(grammarAccess.getAddEntityAccess().getGroup(), "rule__AddEntity__Group__0");
			builder.put(grammarAccess.getAddEntityAccess().getGroup_3(), "rule__AddEntity__Group_3__0");
			builder.put(grammarAccess.getAddEntityAccess().getGroup_6(), "rule__AddEntity__Group_6__0");
			builder.put(grammarAccess.getAddEntityAccess().getGroup_6_3(), "rule__AddEntity__Group_6_3__0");
			builder.put(grammarAccess.getAddEntityAccess().getGroup_7(), "rule__AddEntity__Group_7__0");
			builder.put(grammarAccess.getAddEntityAccess().getGroup_7_3(), "rule__AddEntity__Group_7_3__0");
			builder.put(grammarAccess.getPrimitiveDataType_ImplAccess().getGroup(), "rule__PrimitiveDataType_Impl__Group__0");
			builder.put(grammarAccess.getPrimitiveDataType_ImplAccess().getGroup_4(), "rule__PrimitiveDataType_Impl__Group_4__0");
			builder.put(grammarAccess.getFreeTextAccess().getGroup(), "rule__FreeText__Group__0");
			builder.put(grammarAccess.getFreeTextAccess().getGroup_4(), "rule__FreeText__Group_4__0");
			builder.put(grammarAccess.getCustomDataTypeAccess().getGroup(), "rule__CustomDataType__Group__0");
			builder.put(grammarAccess.getCustomDataTypeAccess().getGroup_4(), "rule__CustomDataType__Group_4__0");
			builder.put(grammarAccess.getCustomDataTypeAccess().getGroup_5(), "rule__CustomDataType__Group_5__0");
			builder.put(grammarAccess.getCustomDataTypeAccess().getGroup_5_3(), "rule__CustomDataType__Group_5_3__0");
			builder.put(grammarAccess.getEntity_ImplAccess().getGroup(), "rule__Entity_Impl__Group__0");
			builder.put(grammarAccess.getEntity_ImplAccess().getGroup_3(), "rule__Entity_Impl__Group_3__0");
			builder.put(grammarAccess.getEntity_ImplAccess().getGroup_6(), "rule__Entity_Impl__Group_6__0");
			builder.put(grammarAccess.getEntity_ImplAccess().getGroup_6_3(), "rule__Entity_Impl__Group_6_3__0");
			builder.put(grammarAccess.getEntity_ImplAccess().getGroup_7(), "rule__Entity_Impl__Group_7__0");
			builder.put(grammarAccess.getEntity_ImplAccess().getGroup_7_3(), "rule__Entity_Impl__Group_7_3__0");
			builder.put(grammarAccess.getAttribute_ImplAccess().getGroup(), "rule__Attribute_Impl__Group__0");
			builder.put(grammarAccess.getAttribute_ImplAccess().getGroup_4(), "rule__Attribute_Impl__Group_4__0");
			builder.put(grammarAccess.getAttribute_ImplAccess().getGroup_5(), "rule__Attribute_Impl__Group_5__0");
			builder.put(grammarAccess.getRelation_ImplAccess().getGroup(), "rule__Relation_Impl__Group__0");
			builder.put(grammarAccess.getRelation_ImplAccess().getGroup_4(), "rule__Relation_Impl__Group_4__0");
			builder.put(grammarAccess.getRelation_ImplAccess().getGroup_7(), "rule__Relation_Impl__Group_7__0");
			builder.put(grammarAccess.getRelation_ImplAccess().getGroup_8(), "rule__Relation_Impl__Group_8__0");
			builder.put(grammarAccess.getEntityIdentifierAccess().getGroup(), "rule__EntityIdentifier__Group__0");
			builder.put(grammarAccess.getEntityIdentifierAccess().getGroup_3(), "rule__EntityIdentifier__Group_3__0");
			builder.put(grammarAccess.getEntityIdentifierAccess().getGroup_3_3(), "rule__EntityIdentifier__Group_3_3__0");
			builder.put(grammarAccess.getGenericList_ImplAccess().getGroup(), "rule__GenericList_Impl__Group__0");
			builder.put(grammarAccess.getAddRelationAccess().getGroup(), "rule__AddRelation__Group__0");
			builder.put(grammarAccess.getAddRelationAccess().getGroup_4(), "rule__AddRelation__Group_4__0");
			builder.put(grammarAccess.getAddRelationAccess().getGroup_7(), "rule__AddRelation__Group_7__0");
			builder.put(grammarAccess.getAddRelationAccess().getGroup_8(), "rule__AddRelation__Group_8__0");
			builder.put(grammarAccess.getTableAccess().getGroup(), "rule__Table__Group__0");
			builder.put(grammarAccess.getTableAccess().getGroup_3(), "rule__Table__Group_3__0");
			builder.put(grammarAccess.getTableAccess().getGroup_6(), "rule__Table__Group_6__0");
			builder.put(grammarAccess.getTableAccess().getGroup_7(), "rule__Table__Group_7__0");
			builder.put(grammarAccess.getTableAccess().getGroup_8(), "rule__Table__Group_8__0");
			builder.put(grammarAccess.getCollectionAccess().getGroup(), "rule__Collection__Group__0");
			builder.put(grammarAccess.getCollectionAccess().getGroup_3(), "rule__Collection__Group_3__0");
			builder.put(grammarAccess.getKeyValueElementAccess().getGroup(), "rule__KeyValueElement__Group__0");
			builder.put(grammarAccess.getKeyValueElementAccess().getGroup_2(), "rule__KeyValueElement__Group_2__0");
			builder.put(grammarAccess.getKeyValueElementAccess().getGroup_5(), "rule__KeyValueElement__Group_5__0");
			builder.put(grammarAccess.getKeyValueElementAccess().getGroup_5_3(), "rule__KeyValueElement__Group_5_3__0");
			builder.put(grammarAccess.getGraphNodeAccess().getGroup(), "rule__GraphNode__Group__0");
			builder.put(grammarAccess.getGraphNodeAccess().getGroup_3(), "rule__GraphNode__Group_3__0");
			builder.put(grammarAccess.getGraphNodeAccess().getGroup_6(), "rule__GraphNode__Group_6__0");
			builder.put(grammarAccess.getGraphNodeAccess().getGroup_6_3(), "rule__GraphNode__Group_6_3__0");
			builder.put(grammarAccess.getIndexSpecAccess().getGroup(), "rule__IndexSpec__Group__0");
			builder.put(grammarAccess.getIndexSpecAccess().getGroup_4(), "rule__IndexSpec__Group_4__0");
			builder.put(grammarAccess.getIndexSpecAccess().getGroup_5(), "rule__IndexSpec__Group_5__0");
			builder.put(grammarAccess.getIndexSpecAccess().getGroup_5_3(), "rule__IndexSpec__Group_5_3__0");
			builder.put(grammarAccess.getIndexSpecAccess().getGroup_6(), "rule__IndexSpec__Group_6__0");
			builder.put(grammarAccess.getIndexSpecAccess().getGroup_6_3(), "rule__IndexSpec__Group_6_3__0");
			builder.put(grammarAccess.getIdSpecAccess().getGroup(), "rule__IdSpec__Group__0");
			builder.put(grammarAccess.getIdSpecAccess().getGroup_3(), "rule__IdSpec__Group_3__0");
			builder.put(grammarAccess.getIdSpecAccess().getGroup_3_3(), "rule__IdSpec__Group_3_3__0");
			builder.put(grammarAccess.getRelationalDBAccess().getGroup(), "rule__RelationalDB__Group__0");
			builder.put(grammarAccess.getRelationalDBAccess().getGroup_4(), "rule__RelationalDB__Group_4__0");
			builder.put(grammarAccess.getRelationalDBAccess().getGroup_5(), "rule__RelationalDB__Group_5__0");
			builder.put(grammarAccess.getRelationalDBAccess().getGroup_5_3(), "rule__RelationalDB__Group_5_3__0");
			builder.put(grammarAccess.getDocumentDBAccess().getGroup(), "rule__DocumentDB__Group__0");
			builder.put(grammarAccess.getDocumentDBAccess().getGroup_4(), "rule__DocumentDB__Group_4__0");
			builder.put(grammarAccess.getDocumentDBAccess().getGroup_5(), "rule__DocumentDB__Group_5__0");
			builder.put(grammarAccess.getDocumentDBAccess().getGroup_5_3(), "rule__DocumentDB__Group_5_3__0");
			builder.put(grammarAccess.getKeyValueDBAccess().getGroup(), "rule__KeyValueDB__Group__0");
			builder.put(grammarAccess.getKeyValueDBAccess().getGroup_4(), "rule__KeyValueDB__Group_4__0");
			builder.put(grammarAccess.getKeyValueDBAccess().getGroup_5(), "rule__KeyValueDB__Group_5__0");
			builder.put(grammarAccess.getKeyValueDBAccess().getGroup_5_3(), "rule__KeyValueDB__Group_5_3__0");
			builder.put(grammarAccess.getGraphDBAccess().getGroup(), "rule__GraphDB__Group__0");
			builder.put(grammarAccess.getGraphDBAccess().getGroup_4(), "rule__GraphDB__Group_4__0");
			builder.put(grammarAccess.getGraphDBAccess().getGroup_5(), "rule__GraphDB__Group_5__0");
			builder.put(grammarAccess.getGraphDBAccess().getGroup_5_3(), "rule__GraphDB__Group_5_3__0");
			builder.put(grammarAccess.getGraphDBAccess().getGroup_6(), "rule__GraphDB__Group_6__0");
			builder.put(grammarAccess.getGraphDBAccess().getGroup_6_3(), "rule__GraphDB__Group_6_3__0");
			builder.put(grammarAccess.getColumnDBAccess().getGroup(), "rule__ColumnDB__Group__0");
			builder.put(grammarAccess.getColumnDBAccess().getGroup_4(), "rule__ColumnDB__Group_4__0");
			builder.put(grammarAccess.getColumnDBAccess().getGroup_5(), "rule__ColumnDB__Group_5__0");
			builder.put(grammarAccess.getColumnDBAccess().getGroup_5_3(), "rule__ColumnDB__Group_5_3__0");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getGroup(), "rule__GraphEdge_Impl__Group__0");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getGroup_4(), "rule__GraphEdge_Impl__Group_4__0");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getGroup_5(), "rule__GraphEdge_Impl__Group_5__0");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getGroup_6(), "rule__GraphEdge_Impl__Group_6__0");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getGroup_7(), "rule__GraphEdge_Impl__Group_7__0");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getGroup_7_3(), "rule__GraphEdge_Impl__Group_7_3__0");
			builder.put(grammarAccess.getGraphEdgeLabelAccess().getGroup(), "rule__GraphEdgeLabel__Group__0");
			builder.put(grammarAccess.getGraphEdgeLabelAccess().getGroup_4(), "rule__GraphEdgeLabel__Group_4__0");
			builder.put(grammarAccess.getGraphEdgeLabelAccess().getGroup_5(), "rule__GraphEdgeLabel__Group_5__0");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getGroup(), "rule__AddGraphEdge__Group__0");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getGroup_4(), "rule__AddGraphEdge__Group_4__0");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getGroup_5(), "rule__AddGraphEdge__Group_5__0");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getGroup_6(), "rule__AddGraphEdge__Group_6__0");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getGroup_7(), "rule__AddGraphEdge__Group_7__0");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getGroup_7_3(), "rule__AddGraphEdge__Group_7_3__0");
			builder.put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
			builder.put(grammarAccess.getColumnAccess().getGroup_3(), "rule__Column__Group_3__0");
			builder.put(grammarAccess.getColumnAccess().getGroup_3_3(), "rule__Column__Group_3_3__0");
			builder.put(grammarAccess.getGraphAttribute_ImplAccess().getGroup(), "rule__GraphAttribute_Impl__Group__0");
			builder.put(grammarAccess.getGraphAttribute_ImplAccess().getGroup_4(), "rule__GraphAttribute_Impl__Group_4__0");
			builder.put(grammarAccess.getGraphAttribute_ImplAccess().getGroup_5(), "rule__GraphAttribute_Impl__Group_5__0");
			builder.put(grammarAccess.getAddGraphAttributeAccess().getGroup(), "rule__AddGraphAttribute__Group__0");
			builder.put(grammarAccess.getAddGraphAttributeAccess().getGroup_4(), "rule__AddGraphAttribute__Group_4__0");
			builder.put(grammarAccess.getAddGraphAttributeAccess().getGroup_5(), "rule__AddGraphAttribute__Group_5__0");
			builder.put(grammarAccess.getDataTypeItemAccess().getGroup(), "rule__DataTypeItem__Group__0");
			builder.put(grammarAccess.getDataTypeItemAccess().getGroup_3(), "rule__DataTypeItem__Group_3__0");
			builder.put(grammarAccess.getDataTypeItemAccess().getGroup_4(), "rule__DataTypeItem__Group_4__0");
			builder.put(grammarAccess.getDataTypeImplementationPackageAccess().getGroup(), "rule__DataTypeImplementationPackage__Group__0");
			builder.put(grammarAccess.getDataTypeImplementationPackageAccess().getGroup_3(), "rule__DataTypeImplementationPackage__Group_3__0");
			builder.put(grammarAccess.getModelAccess().getDataTypesAssignment_1(), "rule__Model__DataTypesAssignment_1");
			builder.put(grammarAccess.getModelAccess().getDatabasesAssignment_2(), "rule__Model__DatabasesAssignment_2");
			builder.put(grammarAccess.getAddAttributeAccess().getNameAssignment_2(), "rule__AddAttribute__NameAssignment_2");
			builder.put(grammarAccess.getAddAttributeAccess().getImportedNamespaceAssignment_4_1(), "rule__AddAttribute__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getAddAttributeAccess().getTypeAssignment_5_1(), "rule__AddAttribute__TypeAssignment_5_1");
			builder.put(grammarAccess.getAddEntityAccess().getNameAssignment_1(), "rule__AddEntity__NameAssignment_1");
			builder.put(grammarAccess.getAddEntityAccess().getImportedNamespaceAssignment_3_1(), "rule__AddEntity__ImportedNamespaceAssignment_3_1");
			builder.put(grammarAccess.getAddEntityAccess().getGenericListAssignment_5(), "rule__AddEntity__GenericListAssignment_5");
			builder.put(grammarAccess.getAddEntityAccess().getAttributesAssignment_6_2(), "rule__AddEntity__AttributesAssignment_6_2");
			builder.put(grammarAccess.getAddEntityAccess().getAttributesAssignment_6_3_1(), "rule__AddEntity__AttributesAssignment_6_3_1");
			builder.put(grammarAccess.getAddEntityAccess().getRelationsAssignment_7_2(), "rule__AddEntity__RelationsAssignment_7_2");
			builder.put(grammarAccess.getAddEntityAccess().getRelationsAssignment_7_3_1(), "rule__AddEntity__RelationsAssignment_7_3_1");
			builder.put(grammarAccess.getAddEntityAccess().getIdentiferAssignment_9(), "rule__AddEntity__IdentiferAssignment_9");
			builder.put(grammarAccess.getPrimitiveDataType_ImplAccess().getNameAssignment_2(), "rule__PrimitiveDataType_Impl__NameAssignment_2");
			builder.put(grammarAccess.getPrimitiveDataType_ImplAccess().getImportedNamespaceAssignment_4_1(), "rule__PrimitiveDataType_Impl__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getFreeTextAccess().getNameAssignment_2(), "rule__FreeText__NameAssignment_2");
			builder.put(grammarAccess.getFreeTextAccess().getImportedNamespaceAssignment_4_1(), "rule__FreeText__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getCustomDataTypeAccess().getNameAssignment_2(), "rule__CustomDataType__NameAssignment_2");
			builder.put(grammarAccess.getCustomDataTypeAccess().getImportedNamespaceAssignment_4_1(), "rule__CustomDataType__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getCustomDataTypeAccess().getElementsAssignment_5_2(), "rule__CustomDataType__ElementsAssignment_5_2");
			builder.put(grammarAccess.getCustomDataTypeAccess().getElementsAssignment_5_3_1(), "rule__CustomDataType__ElementsAssignment_5_3_1");
			builder.put(grammarAccess.getEntity_ImplAccess().getNameAssignment_1(), "rule__Entity_Impl__NameAssignment_1");
			builder.put(grammarAccess.getEntity_ImplAccess().getImportedNamespaceAssignment_3_1(), "rule__Entity_Impl__ImportedNamespaceAssignment_3_1");
			builder.put(grammarAccess.getEntity_ImplAccess().getGenericListAssignment_5(), "rule__Entity_Impl__GenericListAssignment_5");
			builder.put(grammarAccess.getEntity_ImplAccess().getAttributesAssignment_6_2(), "rule__Entity_Impl__AttributesAssignment_6_2");
			builder.put(grammarAccess.getEntity_ImplAccess().getAttributesAssignment_6_3_1(), "rule__Entity_Impl__AttributesAssignment_6_3_1");
			builder.put(grammarAccess.getEntity_ImplAccess().getRelationsAssignment_7_2(), "rule__Entity_Impl__RelationsAssignment_7_2");
			builder.put(grammarAccess.getEntity_ImplAccess().getRelationsAssignment_7_3_1(), "rule__Entity_Impl__RelationsAssignment_7_3_1");
			builder.put(grammarAccess.getEntity_ImplAccess().getIdentiferAssignment_9(), "rule__Entity_Impl__IdentiferAssignment_9");
			builder.put(grammarAccess.getAttribute_ImplAccess().getNameAssignment_2(), "rule__Attribute_Impl__NameAssignment_2");
			builder.put(grammarAccess.getAttribute_ImplAccess().getImportedNamespaceAssignment_4_1(), "rule__Attribute_Impl__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getAttribute_ImplAccess().getTypeAssignment_5_1(), "rule__Attribute_Impl__TypeAssignment_5_1");
			builder.put(grammarAccess.getRelation_ImplAccess().getIsContainmentAssignment_0(), "rule__Relation_Impl__IsContainmentAssignment_0");
			builder.put(grammarAccess.getRelation_ImplAccess().getNameAssignment_2(), "rule__Relation_Impl__NameAssignment_2");
			builder.put(grammarAccess.getRelation_ImplAccess().getImportedNamespaceAssignment_4_1(), "rule__Relation_Impl__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getRelation_ImplAccess().getCardinalityAssignment_6(), "rule__Relation_Impl__CardinalityAssignment_6");
			builder.put(grammarAccess.getRelation_ImplAccess().getTypeAssignment_7_1(), "rule__Relation_Impl__TypeAssignment_7_1");
			builder.put(grammarAccess.getRelation_ImplAccess().getOppositeAssignment_8_1(), "rule__Relation_Impl__OppositeAssignment_8_1");
			builder.put(grammarAccess.getEntityIdentifierAccess().getAttributesAssignment_3_2(), "rule__EntityIdentifier__AttributesAssignment_3_2");
			builder.put(grammarAccess.getEntityIdentifierAccess().getAttributesAssignment_3_3_1(), "rule__EntityIdentifier__AttributesAssignment_3_3_1");
			builder.put(grammarAccess.getGenericList_ImplAccess().getEntityAssignment_3(), "rule__GenericList_Impl__EntityAssignment_3");
			builder.put(grammarAccess.getAddRelationAccess().getIsContainmentAssignment_0(), "rule__AddRelation__IsContainmentAssignment_0");
			builder.put(grammarAccess.getAddRelationAccess().getNameAssignment_2(), "rule__AddRelation__NameAssignment_2");
			builder.put(grammarAccess.getAddRelationAccess().getImportedNamespaceAssignment_4_1(), "rule__AddRelation__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getAddRelationAccess().getCardinalityAssignment_6(), "rule__AddRelation__CardinalityAssignment_6");
			builder.put(grammarAccess.getAddRelationAccess().getTypeAssignment_7_1(), "rule__AddRelation__TypeAssignment_7_1");
			builder.put(grammarAccess.getAddRelationAccess().getOppositeAssignment_8_1(), "rule__AddRelation__OppositeAssignment_8_1");
			builder.put(grammarAccess.getTableAccess().getNameAssignment_1(), "rule__Table__NameAssignment_1");
			builder.put(grammarAccess.getTableAccess().getImportedNamespaceAssignment_3_1(), "rule__Table__ImportedNamespaceAssignment_3_1");
			builder.put(grammarAccess.getTableAccess().getEntityAssignment_5(), "rule__Table__EntityAssignment_5");
			builder.put(grammarAccess.getTableAccess().getDbAssignment_6_1(), "rule__Table__DbAssignment_6_1");
			builder.put(grammarAccess.getTableAccess().getIndexSpecAssignment_7_1(), "rule__Table__IndexSpecAssignment_7_1");
			builder.put(grammarAccess.getTableAccess().getIdSpecAssignment_8_1(), "rule__Table__IdSpecAssignment_8_1");
			builder.put(grammarAccess.getCollectionAccess().getNameAssignment_1(), "rule__Collection__NameAssignment_1");
			builder.put(grammarAccess.getCollectionAccess().getImportedNamespaceAssignment_3_1(), "rule__Collection__ImportedNamespaceAssignment_3_1");
			builder.put(grammarAccess.getCollectionAccess().getEntityAssignment_5(), "rule__Collection__EntityAssignment_5");
			builder.put(grammarAccess.getKeyValueElementAccess().getKeyAssignment_2_1(), "rule__KeyValueElement__KeyAssignment_2_1");
			builder.put(grammarAccess.getKeyValueElementAccess().getEntityAssignment_4(), "rule__KeyValueElement__EntityAssignment_4");
			builder.put(grammarAccess.getKeyValueElementAccess().getValuesAssignment_5_2(), "rule__KeyValueElement__ValuesAssignment_5_2");
			builder.put(grammarAccess.getKeyValueElementAccess().getValuesAssignment_5_3_1(), "rule__KeyValueElement__ValuesAssignment_5_3_1");
			builder.put(grammarAccess.getGraphNodeAccess().getNameAssignment_1(), "rule__GraphNode__NameAssignment_1");
			builder.put(grammarAccess.getGraphNodeAccess().getImportedNamespaceAssignment_3_1(), "rule__GraphNode__ImportedNamespaceAssignment_3_1");
			builder.put(grammarAccess.getGraphNodeAccess().getEntityAssignment_5(), "rule__GraphNode__EntityAssignment_5");
			builder.put(grammarAccess.getGraphNodeAccess().getAttributesAssignment_6_2(), "rule__GraphNode__AttributesAssignment_6_2");
			builder.put(grammarAccess.getGraphNodeAccess().getAttributesAssignment_6_3_1(), "rule__GraphNode__AttributesAssignment_6_3_1");
			builder.put(grammarAccess.getIndexSpecAccess().getNameAssignment_2(), "rule__IndexSpec__NameAssignment_2");
			builder.put(grammarAccess.getIndexSpecAccess().getImportedNamespaceAssignment_4_1(), "rule__IndexSpec__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getIndexSpecAccess().getAttributesAssignment_5_2(), "rule__IndexSpec__AttributesAssignment_5_2");
			builder.put(grammarAccess.getIndexSpecAccess().getAttributesAssignment_5_3_1(), "rule__IndexSpec__AttributesAssignment_5_3_1");
			builder.put(grammarAccess.getIndexSpecAccess().getReferencesAssignment_6_2(), "rule__IndexSpec__ReferencesAssignment_6_2");
			builder.put(grammarAccess.getIndexSpecAccess().getReferencesAssignment_6_3_1(), "rule__IndexSpec__ReferencesAssignment_6_3_1");
			builder.put(grammarAccess.getIdSpecAccess().getAttributesAssignment_3_2(), "rule__IdSpec__AttributesAssignment_3_2");
			builder.put(grammarAccess.getIdSpecAccess().getAttributesAssignment_3_3_1(), "rule__IdSpec__AttributesAssignment_3_3_1");
			builder.put(grammarAccess.getRelationalDBAccess().getNameAssignment_2(), "rule__RelationalDB__NameAssignment_2");
			builder.put(grammarAccess.getRelationalDBAccess().getImportedNamespaceAssignment_4_1(), "rule__RelationalDB__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getRelationalDBAccess().getTablesAssignment_5_2(), "rule__RelationalDB__TablesAssignment_5_2");
			builder.put(grammarAccess.getRelationalDBAccess().getTablesAssignment_5_3_1(), "rule__RelationalDB__TablesAssignment_5_3_1");
			builder.put(grammarAccess.getDocumentDBAccess().getNameAssignment_2(), "rule__DocumentDB__NameAssignment_2");
			builder.put(grammarAccess.getDocumentDBAccess().getImportedNamespaceAssignment_4_1(), "rule__DocumentDB__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getDocumentDBAccess().getCollectionsAssignment_5_2(), "rule__DocumentDB__CollectionsAssignment_5_2");
			builder.put(grammarAccess.getDocumentDBAccess().getCollectionsAssignment_5_3_1(), "rule__DocumentDB__CollectionsAssignment_5_3_1");
			builder.put(grammarAccess.getKeyValueDBAccess().getNameAssignment_2(), "rule__KeyValueDB__NameAssignment_2");
			builder.put(grammarAccess.getKeyValueDBAccess().getImportedNamespaceAssignment_4_1(), "rule__KeyValueDB__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getKeyValueDBAccess().getElementsAssignment_5_2(), "rule__KeyValueDB__ElementsAssignment_5_2");
			builder.put(grammarAccess.getKeyValueDBAccess().getElementsAssignment_5_3_1(), "rule__KeyValueDB__ElementsAssignment_5_3_1");
			builder.put(grammarAccess.getGraphDBAccess().getNameAssignment_2(), "rule__GraphDB__NameAssignment_2");
			builder.put(grammarAccess.getGraphDBAccess().getImportedNamespaceAssignment_4_1(), "rule__GraphDB__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getGraphDBAccess().getNodesAssignment_5_2(), "rule__GraphDB__NodesAssignment_5_2");
			builder.put(grammarAccess.getGraphDBAccess().getNodesAssignment_5_3_1(), "rule__GraphDB__NodesAssignment_5_3_1");
			builder.put(grammarAccess.getGraphDBAccess().getEdgesAssignment_6_2(), "rule__GraphDB__EdgesAssignment_6_2");
			builder.put(grammarAccess.getGraphDBAccess().getEdgesAssignment_6_3_1(), "rule__GraphDB__EdgesAssignment_6_3_1");
			builder.put(grammarAccess.getColumnDBAccess().getNameAssignment_2(), "rule__ColumnDB__NameAssignment_2");
			builder.put(grammarAccess.getColumnDBAccess().getImportedNamespaceAssignment_4_1(), "rule__ColumnDB__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getColumnDBAccess().getColumnsAssignment_5_2(), "rule__ColumnDB__ColumnsAssignment_5_2");
			builder.put(grammarAccess.getColumnDBAccess().getColumnsAssignment_5_3_1(), "rule__ColumnDB__ColumnsAssignment_5_3_1");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getNameAssignment_2(), "rule__GraphEdge_Impl__NameAssignment_2");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getImportedNamespaceAssignment_4_1(), "rule__GraphEdge_Impl__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getFromAssignment_5_1(), "rule__GraphEdge_Impl__FromAssignment_5_1");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getToAssignment_6_1(), "rule__GraphEdge_Impl__ToAssignment_6_1");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getLabelsAssignment_7_2(), "rule__GraphEdge_Impl__LabelsAssignment_7_2");
			builder.put(grammarAccess.getGraphEdge_ImplAccess().getLabelsAssignment_7_3_1(), "rule__GraphEdge_Impl__LabelsAssignment_7_3_1");
			builder.put(grammarAccess.getGraphEdgeLabelAccess().getNameAssignment_2(), "rule__GraphEdgeLabel__NameAssignment_2");
			builder.put(grammarAccess.getGraphEdgeLabelAccess().getImportedNamespaceAssignment_4_1(), "rule__GraphEdgeLabel__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getGraphEdgeLabelAccess().getTypeAssignment_5_1(), "rule__GraphEdgeLabel__TypeAssignment_5_1");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getNameAssignment_2(), "rule__AddGraphEdge__NameAssignment_2");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getImportedNamespaceAssignment_4_1(), "rule__AddGraphEdge__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getFromAssignment_5_1(), "rule__AddGraphEdge__FromAssignment_5_1");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getToAssignment_6_1(), "rule__AddGraphEdge__ToAssignment_6_1");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getLabelsAssignment_7_2(), "rule__AddGraphEdge__LabelsAssignment_7_2");
			builder.put(grammarAccess.getAddGraphEdgeAccess().getLabelsAssignment_7_3_1(), "rule__AddGraphEdge__LabelsAssignment_7_3_1");
			builder.put(grammarAccess.getColumnAccess().getAttributesAssignment_3_2(), "rule__Column__AttributesAssignment_3_2");
			builder.put(grammarAccess.getColumnAccess().getAttributesAssignment_3_3_1(), "rule__Column__AttributesAssignment_3_3_1");
			builder.put(grammarAccess.getGraphAttribute_ImplAccess().getNameAssignment_2(), "rule__GraphAttribute_Impl__NameAssignment_2");
			builder.put(grammarAccess.getGraphAttribute_ImplAccess().getImportedNamespaceAssignment_4_1(), "rule__GraphAttribute_Impl__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getGraphAttribute_ImplAccess().getValueAssignment_5_1(), "rule__GraphAttribute_Impl__ValueAssignment_5_1");
			builder.put(grammarAccess.getAddGraphAttributeAccess().getNameAssignment_2(), "rule__AddGraphAttribute__NameAssignment_2");
			builder.put(grammarAccess.getAddGraphAttributeAccess().getImportedNamespaceAssignment_4_1(), "rule__AddGraphAttribute__ImportedNamespaceAssignment_4_1");
			builder.put(grammarAccess.getAddGraphAttributeAccess().getValueAssignment_5_1(), "rule__AddGraphAttribute__ValueAssignment_5_1");
			builder.put(grammarAccess.getDataTypeItemAccess().getNameAssignment_1(), "rule__DataTypeItem__NameAssignment_1");
			builder.put(grammarAccess.getDataTypeItemAccess().getImportedNamespaceAssignment_3_1(), "rule__DataTypeItem__ImportedNamespaceAssignment_3_1");
			builder.put(grammarAccess.getDataTypeItemAccess().getTypeAssignment_4_1(), "rule__DataTypeItem__TypeAssignment_4_1");
			builder.put(grammarAccess.getDataTypeItemAccess().getImplementationAssignment_6(), "rule__DataTypeItem__ImplementationAssignment_6");
			builder.put(grammarAccess.getDataTypeImplementationPackageAccess().getLocationAssignment_3_1(), "rule__DataTypeImplementationPackage__LocationAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TyphonMLGrammarAccess grammarAccess;

	@Override
	protected InternalTyphonMLParser createParser() {
		InternalTyphonMLParser result = new InternalTyphonMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TyphonMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TyphonMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
