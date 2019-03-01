/**
 */
package typhonml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import typhonml.AddAttribute;
import typhonml.AddAttributesToIdenfifier;
import typhonml.AddEntity;
import typhonml.AddGraphAttribute;
import typhonml.AddGraphEdge;
import typhonml.AddIdentifier;
import typhonml.AddIndex;
import typhonml.AddRelation;
import typhonml.Attribute;
import typhonml.Cardinality;
import typhonml.ChangeAttributeType;
import typhonml.ChangeOperator;
import typhonml.ChangeRelationCardinality;
import typhonml.ChangeRelationContainement;
import typhonml.Collection;
import typhonml.Column;
import typhonml.ColumnDB;
import typhonml.CustomDataType;
import typhonml.DataType;
import typhonml.DataTypeImplementationPackage;
import typhonml.DataTypeItem;
import typhonml.Database;
import typhonml.DisableBidirectionalRelation;
import typhonml.DisableRelationContainment;
import typhonml.DocumentDB;
import typhonml.DropIndex;
import typhonml.EnableBidirectionalRelation;
import typhonml.EnableRelationContainment;
import typhonml.Entity;
import typhonml.EntityIdentifier;
import typhonml.FreeText;
import typhonml.GenericList;
import typhonml.GraphAttribute;
import typhonml.GraphDB;
import typhonml.GraphEdge;
import typhonml.GraphEdgeLabel;
import typhonml.GraphNode;
import typhonml.IdSpec;
import typhonml.IndexSpec;
import typhonml.KeyValueDB;
import typhonml.KeyValueElement;
import typhonml.MergeEntity;
import typhonml.MigrateEntity;
import typhonml.Model;
import typhonml.NamedElement;
import typhonml.PrimitiveDataType;
import typhonml.Relation;
import typhonml.RelationalDB;
import typhonml.RemoveAttribute;
import typhonml.RemoveAttributesToIdenfifier;
import typhonml.RemoveEntity;
import typhonml.RemoveGraphAttribute;
import typhonml.RemoveGraphEdge;
import typhonml.RemoveIdentifier;
import typhonml.RemoveRelation;
import typhonml.RenabeGraphEdgeLabel;
import typhonml.RenameAttribute;
import typhonml.RenameEntity;
import typhonml.RenameIdentifier;
import typhonml.RenameRelation;
import typhonml.RenameTable;
import typhonml.SplitEntity;
import typhonml.Table;
import typhonml.TyphonmlFactory;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TyphonmlPackageImpl extends EPackageImpl implements TyphonmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrateEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableRelationContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableRelationContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableBidirectionalRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableBidirectionalRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRelationCardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAttributesToIdenfifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeAttributesToIdenfifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addGraphAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeGraphAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addGraphEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeGraphEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renabeGraphEdgeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeImplementationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityIdentifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentDBEClass = null;

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
	private EClass keyValueDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEdgeLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRelationContainementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cardinalityEEnum = null;

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
	 * @see typhonml.TyphonmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TyphonmlPackageImpl() {
		super(eNS_URI, TyphonmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TyphonmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TyphonmlPackage init() {
		if (isInited) return (TyphonmlPackage)EPackage.Registry.INSTANCE.getEPackage(TyphonmlPackage.eNS_URI);

		// Obtain or create and register package
		TyphonmlPackageImpl theTyphonmlPackage = (TyphonmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TyphonmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TyphonmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTyphonmlPackage.createPackageContents();

		// Initialize created meta-data
		theTyphonmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTyphonmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TyphonmlPackage.eNS_URI, theTyphonmlPackage);
		return theTyphonmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Databases() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_DataTypes() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_ChangeOperators() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_ImportedNamespace() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeOperator() {
		return changeOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddEntity() {
		return addEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveEntity() {
		return removeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveEntity_EntityToRemove() {
		return (EReference)removeEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplitEntity() {
		return splitEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitEntity_EntityToBeSplit() {
		return (EReference)splitEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitEntity_FirstNewEntity() {
		return (EReference)splitEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSplitEntity_SecondNewEntity() {
		return (EReference)splitEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMigrateEntity() {
		return migrateEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrateEntity_Entity() {
		return (EReference)migrateEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMigrateEntity_NewDatabase() {
		return (EReference)migrateEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeEntity() {
		return mergeEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeEntity_FirstEntityToMerge() {
		return (EReference)mergeEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMergeEntity_SecondEntityToMerge() {
		return (EReference)mergeEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergeEntity_NewEntityName() {
		return (EAttribute)mergeEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddRelation() {
		return addRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveRelation() {
		return removeRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveRelation_RelationToRemove() {
		return (EReference)removeRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameRelation() {
		return renameRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameRelation_RelationToRename() {
		return (EReference)renameRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameRelation_NewRelationName() {
		return (EAttribute)renameRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableRelationContainment() {
		return enableRelationContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnableRelationContainment_Relation() {
		return (EReference)enableRelationContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableRelationContainment() {
		return disableRelationContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisableRelationContainment_Relation() {
		return (EReference)disableRelationContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableBidirectionalRelation() {
		return enableBidirectionalRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnableBidirectionalRelation_Relation() {
		return (EReference)enableBidirectionalRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableBidirectionalRelation() {
		return disableBidirectionalRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisableBidirectionalRelation_Relation() {
		return (EReference)disableBidirectionalRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRelationCardinality() {
		return changeRelationCardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeRelationCardinality_Relation() {
		return (EReference)changeRelationCardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRelationCardinality_NewCardinality() {
		return (EAttribute)changeRelationCardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAttribute() {
		return addAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAttributeType() {
		return changeAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeAttributeType_AttributeToChange() {
		return (EReference)changeAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeAttributeType_NewType() {
		return (EReference)changeAttributeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAttribute() {
		return removeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveAttribute_AttributeToRemove() {
		return (EReference)removeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameAttribute() {
		return renameAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameAttribute_AttributeToRename() {
		return (EReference)renameAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameAttribute_NewName() {
		return (EAttribute)renameAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameTable() {
		return renameTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameTable_TableToRename() {
		return (EReference)renameTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameTable_NewName() {
		return (EAttribute)renameTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddIdentifier() {
		return addIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddIdentifier_Entity() {
		return (EReference)addIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddIdentifier_Name() {
		return (EAttribute)addIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAttributesToIdenfifier() {
		return addAttributesToIdenfifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddAttributesToIdenfifier_Identifier() {
		return (EReference)addAttributesToIdenfifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddAttributesToIdenfifier_Attributes() {
		return (EReference)addAttributesToIdenfifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveIdentifier() {
		return removeIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveIdentifier_EntityIdentifier() {
		return (EReference)removeIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAttributesToIdenfifier() {
		return removeAttributesToIdenfifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveAttributesToIdenfifier_Identifier() {
		return (EReference)removeAttributesToIdenfifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveAttributesToIdenfifier_Attributes() {
		return (EReference)removeAttributesToIdenfifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameIdentifier() {
		return renameIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameIdentifier_Identifier() {
		return (EReference)renameIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameIdentifier_NewName() {
		return (EAttribute)renameIdentifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddIndex() {
		return addIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddIndex_Table() {
		return (EReference)addIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddIndex_Attributes() {
		return (EReference)addIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropIndex() {
		return dropIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDropIndex_Table() {
		return (EReference)dropIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddGraphAttribute() {
		return addGraphAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveGraphAttribute() {
		return removeGraphAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveGraphAttribute_Node() {
		return (EReference)removeGraphAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddGraphEdge() {
		return addGraphEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveGraphEdge() {
		return removeGraphEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveGraphEdge_GraphEdgeToRemove() {
		return (EReference)removeGraphEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenabeGraphEdgeLabel() {
		return renabeGraphEdgeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenabeGraphEdgeLabel_Edge() {
		return (EReference)renabeGraphEdgeLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenabeGraphEdgeLabel_NewName() {
		return (EAttribute)renabeGraphEdgeLabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeText() {
		return freeTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomDataType() {
		return customDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomDataType_Elements() {
		return (EReference)customDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeItem() {
		return dataTypeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeItem_Type() {
		return (EReference)dataTypeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeItem_Implementation() {
		return (EReference)dataTypeItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeImplementationPackage() {
		return dataTypeImplementationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeImplementationPackage_Location() {
		return (EAttribute)dataTypeImplementationPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Relations() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Identifer() {
		return (EReference)entityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_GenericList() {
		return (EReference)entityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityIdentifier() {
		return entityIdentifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityIdentifier_Attributes() {
		return (EReference)entityIdentifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_Type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Type() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_Cardinality() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Opposite() {
		return (EReference)relationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_IsContainment() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalDB() {
		return relationalDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationalDB_Tables() {
		return (EReference)relationalDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_IndexSpec() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_IdSpec() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Db() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexSpec() {
		return indexSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexSpec_Attributes() {
		return (EReference)indexSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexSpec_References() {
		return (EReference)indexSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexSpec_Table() {
		return (EReference)indexSpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdSpec() {
		return idSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdSpec_Attributes() {
		return (EReference)idSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdSpec_Table() {
		return (EReference)idSpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentDB() {
		return documentDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentDB_Collections() {
		return (EReference)documentDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollection() {
		return collectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueDB() {
		return keyValueDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueDB_Elements() {
		return (EReference)keyValueDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueElement() {
		return keyValueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueElement_Key() {
		return (EAttribute)keyValueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyValueElement_Values() {
		return (EReference)keyValueElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphDB() {
		return graphDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphDB_Nodes() {
		return (EReference)graphDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphDB_Edges() {
		return (EReference)graphDBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphNode() {
		return graphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphNode_Attributes() {
		return (EReference)graphNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphAttribute() {
		return graphAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphAttribute_Value() {
		return (EReference)graphAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEdge() {
		return graphEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdge_From() {
		return (EReference)graphEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdge_To() {
		return (EReference)graphEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdge_Labels() {
		return (EReference)graphEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphEdgeLabel() {
		return graphEdgeLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphEdgeLabel_Type() {
		return (EReference)graphEdgeLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnDB() {
		return columnDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnDB_Columns() {
		return (EReference)columnDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Attributes() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericList() {
		return genericListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericList_Entity() {
		return (EReference)genericListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameEntity() {
		return renameEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRenameEntity_EntityToRename() {
		return (EReference)renameEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameEntity_NewEntityName() {
		return (EAttribute)renameEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRelationContainement() {
		return changeRelationContainementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeRelationContainement_Relation() {
		return (EReference)changeRelationContainementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRelationContainement_NewContainment() {
		return (EAttribute)changeRelationContainementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCardinality() {
		return cardinalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TyphonmlFactory getTyphonmlFactory() {
		return (TyphonmlFactory)getEFactoryInstance();
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
		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__DATABASES);
		createEReference(modelEClass, MODEL__DATA_TYPES);
		createEReference(modelEClass, MODEL__CHANGE_OPERATORS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__IMPORTED_NAMESPACE);

		changeOperatorEClass = createEClass(CHANGE_OPERATOR);

		addEntityEClass = createEClass(ADD_ENTITY);

		removeEntityEClass = createEClass(REMOVE_ENTITY);
		createEReference(removeEntityEClass, REMOVE_ENTITY__ENTITY_TO_REMOVE);

		splitEntityEClass = createEClass(SPLIT_ENTITY);
		createEReference(splitEntityEClass, SPLIT_ENTITY__ENTITY_TO_BE_SPLIT);
		createEReference(splitEntityEClass, SPLIT_ENTITY__FIRST_NEW_ENTITY);
		createEReference(splitEntityEClass, SPLIT_ENTITY__SECOND_NEW_ENTITY);

		migrateEntityEClass = createEClass(MIGRATE_ENTITY);
		createEReference(migrateEntityEClass, MIGRATE_ENTITY__ENTITY);
		createEReference(migrateEntityEClass, MIGRATE_ENTITY__NEW_DATABASE);

		mergeEntityEClass = createEClass(MERGE_ENTITY);
		createEReference(mergeEntityEClass, MERGE_ENTITY__FIRST_ENTITY_TO_MERGE);
		createEReference(mergeEntityEClass, MERGE_ENTITY__SECOND_ENTITY_TO_MERGE);
		createEAttribute(mergeEntityEClass, MERGE_ENTITY__NEW_ENTITY_NAME);

		addRelationEClass = createEClass(ADD_RELATION);

		removeRelationEClass = createEClass(REMOVE_RELATION);
		createEReference(removeRelationEClass, REMOVE_RELATION__RELATION_TO_REMOVE);

		renameRelationEClass = createEClass(RENAME_RELATION);
		createEReference(renameRelationEClass, RENAME_RELATION__RELATION_TO_RENAME);
		createEAttribute(renameRelationEClass, RENAME_RELATION__NEW_RELATION_NAME);

		enableRelationContainmentEClass = createEClass(ENABLE_RELATION_CONTAINMENT);
		createEReference(enableRelationContainmentEClass, ENABLE_RELATION_CONTAINMENT__RELATION);

		disableRelationContainmentEClass = createEClass(DISABLE_RELATION_CONTAINMENT);
		createEReference(disableRelationContainmentEClass, DISABLE_RELATION_CONTAINMENT__RELATION);

		enableBidirectionalRelationEClass = createEClass(ENABLE_BIDIRECTIONAL_RELATION);
		createEReference(enableBidirectionalRelationEClass, ENABLE_BIDIRECTIONAL_RELATION__RELATION);

		disableBidirectionalRelationEClass = createEClass(DISABLE_BIDIRECTIONAL_RELATION);
		createEReference(disableBidirectionalRelationEClass, DISABLE_BIDIRECTIONAL_RELATION__RELATION);

		changeRelationCardinalityEClass = createEClass(CHANGE_RELATION_CARDINALITY);
		createEReference(changeRelationCardinalityEClass, CHANGE_RELATION_CARDINALITY__RELATION);
		createEAttribute(changeRelationCardinalityEClass, CHANGE_RELATION_CARDINALITY__NEW_CARDINALITY);

		addAttributeEClass = createEClass(ADD_ATTRIBUTE);

		changeAttributeTypeEClass = createEClass(CHANGE_ATTRIBUTE_TYPE);
		createEReference(changeAttributeTypeEClass, CHANGE_ATTRIBUTE_TYPE__ATTRIBUTE_TO_CHANGE);
		createEReference(changeAttributeTypeEClass, CHANGE_ATTRIBUTE_TYPE__NEW_TYPE);

		removeAttributeEClass = createEClass(REMOVE_ATTRIBUTE);
		createEReference(removeAttributeEClass, REMOVE_ATTRIBUTE__ATTRIBUTE_TO_REMOVE);

		renameAttributeEClass = createEClass(RENAME_ATTRIBUTE);
		createEReference(renameAttributeEClass, RENAME_ATTRIBUTE__ATTRIBUTE_TO_RENAME);
		createEAttribute(renameAttributeEClass, RENAME_ATTRIBUTE__NEW_NAME);

		renameTableEClass = createEClass(RENAME_TABLE);
		createEReference(renameTableEClass, RENAME_TABLE__TABLE_TO_RENAME);
		createEAttribute(renameTableEClass, RENAME_TABLE__NEW_NAME);

		addIdentifierEClass = createEClass(ADD_IDENTIFIER);
		createEReference(addIdentifierEClass, ADD_IDENTIFIER__ENTITY);
		createEAttribute(addIdentifierEClass, ADD_IDENTIFIER__NAME);

		addAttributesToIdenfifierEClass = createEClass(ADD_ATTRIBUTES_TO_IDENFIFIER);
		createEReference(addAttributesToIdenfifierEClass, ADD_ATTRIBUTES_TO_IDENFIFIER__IDENTIFIER);
		createEReference(addAttributesToIdenfifierEClass, ADD_ATTRIBUTES_TO_IDENFIFIER__ATTRIBUTES);

		removeIdentifierEClass = createEClass(REMOVE_IDENTIFIER);
		createEReference(removeIdentifierEClass, REMOVE_IDENTIFIER__ENTITY_IDENTIFIER);

		removeAttributesToIdenfifierEClass = createEClass(REMOVE_ATTRIBUTES_TO_IDENFIFIER);
		createEReference(removeAttributesToIdenfifierEClass, REMOVE_ATTRIBUTES_TO_IDENFIFIER__IDENTIFIER);
		createEReference(removeAttributesToIdenfifierEClass, REMOVE_ATTRIBUTES_TO_IDENFIFIER__ATTRIBUTES);

		renameIdentifierEClass = createEClass(RENAME_IDENTIFIER);
		createEReference(renameIdentifierEClass, RENAME_IDENTIFIER__IDENTIFIER);
		createEAttribute(renameIdentifierEClass, RENAME_IDENTIFIER__NEW_NAME);

		addIndexEClass = createEClass(ADD_INDEX);
		createEReference(addIndexEClass, ADD_INDEX__TABLE);
		createEReference(addIndexEClass, ADD_INDEX__ATTRIBUTES);

		dropIndexEClass = createEClass(DROP_INDEX);
		createEReference(dropIndexEClass, DROP_INDEX__TABLE);

		addGraphAttributeEClass = createEClass(ADD_GRAPH_ATTRIBUTE);

		removeGraphAttributeEClass = createEClass(REMOVE_GRAPH_ATTRIBUTE);
		createEReference(removeGraphAttributeEClass, REMOVE_GRAPH_ATTRIBUTE__NODE);

		addGraphEdgeEClass = createEClass(ADD_GRAPH_EDGE);

		removeGraphEdgeEClass = createEClass(REMOVE_GRAPH_EDGE);
		createEReference(removeGraphEdgeEClass, REMOVE_GRAPH_EDGE__GRAPH_EDGE_TO_REMOVE);

		renabeGraphEdgeLabelEClass = createEClass(RENABE_GRAPH_EDGE_LABEL);
		createEReference(renabeGraphEdgeLabelEClass, RENABE_GRAPH_EDGE_LABEL__EDGE);
		createEAttribute(renabeGraphEdgeLabelEClass, RENABE_GRAPH_EDGE_LABEL__NEW_NAME);

		databaseEClass = createEClass(DATABASE);

		dataTypeEClass = createEClass(DATA_TYPE);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);

		freeTextEClass = createEClass(FREE_TEXT);

		customDataTypeEClass = createEClass(CUSTOM_DATA_TYPE);
		createEReference(customDataTypeEClass, CUSTOM_DATA_TYPE__ELEMENTS);

		dataTypeItemEClass = createEClass(DATA_TYPE_ITEM);
		createEReference(dataTypeItemEClass, DATA_TYPE_ITEM__TYPE);
		createEReference(dataTypeItemEClass, DATA_TYPE_ITEM__IMPLEMENTATION);

		dataTypeImplementationPackageEClass = createEClass(DATA_TYPE_IMPLEMENTATION_PACKAGE);
		createEAttribute(dataTypeImplementationPackageEClass, DATA_TYPE_IMPLEMENTATION_PACKAGE__LOCATION);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__RELATIONS);
		createEReference(entityEClass, ENTITY__IDENTIFER);
		createEReference(entityEClass, ENTITY__GENERIC_LIST);

		entityIdentifierEClass = createEClass(ENTITY_IDENTIFIER);
		createEReference(entityIdentifierEClass, ENTITY_IDENTIFIER__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__TYPE);
		createEAttribute(relationEClass, RELATION__CARDINALITY);
		createEReference(relationEClass, RELATION__OPPOSITE);
		createEAttribute(relationEClass, RELATION__IS_CONTAINMENT);

		relationalDBEClass = createEClass(RELATIONAL_DB);
		createEReference(relationalDBEClass, RELATIONAL_DB__TABLES);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__INDEX_SPEC);
		createEReference(tableEClass, TABLE__ID_SPEC);
		createEReference(tableEClass, TABLE__DB);

		indexSpecEClass = createEClass(INDEX_SPEC);
		createEReference(indexSpecEClass, INDEX_SPEC__ATTRIBUTES);
		createEReference(indexSpecEClass, INDEX_SPEC__REFERENCES);
		createEReference(indexSpecEClass, INDEX_SPEC__TABLE);

		idSpecEClass = createEClass(ID_SPEC);
		createEReference(idSpecEClass, ID_SPEC__ATTRIBUTES);
		createEReference(idSpecEClass, ID_SPEC__TABLE);

		documentDBEClass = createEClass(DOCUMENT_DB);
		createEReference(documentDBEClass, DOCUMENT_DB__COLLECTIONS);

		collectionEClass = createEClass(COLLECTION);

		keyValueDBEClass = createEClass(KEY_VALUE_DB);
		createEReference(keyValueDBEClass, KEY_VALUE_DB__ELEMENTS);

		keyValueElementEClass = createEClass(KEY_VALUE_ELEMENT);
		createEAttribute(keyValueElementEClass, KEY_VALUE_ELEMENT__KEY);
		createEReference(keyValueElementEClass, KEY_VALUE_ELEMENT__VALUES);

		graphDBEClass = createEClass(GRAPH_DB);
		createEReference(graphDBEClass, GRAPH_DB__NODES);
		createEReference(graphDBEClass, GRAPH_DB__EDGES);

		graphNodeEClass = createEClass(GRAPH_NODE);
		createEReference(graphNodeEClass, GRAPH_NODE__ATTRIBUTES);

		graphAttributeEClass = createEClass(GRAPH_ATTRIBUTE);
		createEReference(graphAttributeEClass, GRAPH_ATTRIBUTE__VALUE);

		graphEdgeEClass = createEClass(GRAPH_EDGE);
		createEReference(graphEdgeEClass, GRAPH_EDGE__FROM);
		createEReference(graphEdgeEClass, GRAPH_EDGE__TO);
		createEReference(graphEdgeEClass, GRAPH_EDGE__LABELS);

		graphEdgeLabelEClass = createEClass(GRAPH_EDGE_LABEL);
		createEReference(graphEdgeLabelEClass, GRAPH_EDGE_LABEL__TYPE);

		columnDBEClass = createEClass(COLUMN_DB);
		createEReference(columnDBEClass, COLUMN_DB__COLUMNS);

		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__ATTRIBUTES);

		genericListEClass = createEClass(GENERIC_LIST);
		createEReference(genericListEClass, GENERIC_LIST__ENTITY);

		renameEntityEClass = createEClass(RENAME_ENTITY);
		createEReference(renameEntityEClass, RENAME_ENTITY__ENTITY_TO_RENAME);
		createEAttribute(renameEntityEClass, RENAME_ENTITY__NEW_ENTITY_NAME);

		changeRelationContainementEClass = createEClass(CHANGE_RELATION_CONTAINEMENT);
		createEReference(changeRelationContainementEClass, CHANGE_RELATION_CONTAINEMENT__RELATION);
		createEAttribute(changeRelationContainementEClass, CHANGE_RELATION_CONTAINEMENT__NEW_CONTAINMENT);

		// Create enums
		cardinalityEEnum = createEEnum(CARDINALITY);
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

		// Set bounds for type parameters

		// Add supertypes to classes
		addEntityEClass.getESuperTypes().add(this.getEntity());
		addEntityEClass.getESuperTypes().add(this.getChangeOperator());
		removeEntityEClass.getESuperTypes().add(this.getChangeOperator());
		splitEntityEClass.getESuperTypes().add(this.getChangeOperator());
		migrateEntityEClass.getESuperTypes().add(this.getChangeOperator());
		mergeEntityEClass.getESuperTypes().add(this.getChangeOperator());
		addRelationEClass.getESuperTypes().add(this.getRelation());
		addRelationEClass.getESuperTypes().add(this.getChangeOperator());
		removeRelationEClass.getESuperTypes().add(this.getChangeOperator());
		renameRelationEClass.getESuperTypes().add(this.getChangeOperator());
		enableRelationContainmentEClass.getESuperTypes().add(this.getChangeOperator());
		disableRelationContainmentEClass.getESuperTypes().add(this.getChangeOperator());
		enableBidirectionalRelationEClass.getESuperTypes().add(this.getChangeOperator());
		disableBidirectionalRelationEClass.getESuperTypes().add(this.getChangeOperator());
		changeRelationCardinalityEClass.getESuperTypes().add(this.getChangeOperator());
		addAttributeEClass.getESuperTypes().add(this.getAttribute());
		addAttributeEClass.getESuperTypes().add(this.getChangeOperator());
		changeAttributeTypeEClass.getESuperTypes().add(this.getChangeOperator());
		removeAttributeEClass.getESuperTypes().add(this.getChangeOperator());
		renameAttributeEClass.getESuperTypes().add(this.getChangeOperator());
		renameTableEClass.getESuperTypes().add(this.getChangeOperator());
		addIdentifierEClass.getESuperTypes().add(this.getChangeOperator());
		addAttributesToIdenfifierEClass.getESuperTypes().add(this.getChangeOperator());
		removeIdentifierEClass.getESuperTypes().add(this.getChangeOperator());
		removeAttributesToIdenfifierEClass.getESuperTypes().add(this.getChangeOperator());
		renameIdentifierEClass.getESuperTypes().add(this.getChangeOperator());
		addIndexEClass.getESuperTypes().add(this.getChangeOperator());
		dropIndexEClass.getESuperTypes().add(this.getChangeOperator());
		addGraphAttributeEClass.getESuperTypes().add(this.getGraphAttribute());
		addGraphAttributeEClass.getESuperTypes().add(this.getChangeOperator());
		removeGraphAttributeEClass.getESuperTypes().add(this.getChangeOperator());
		addGraphEdgeEClass.getESuperTypes().add(this.getGraphEdge());
		addGraphEdgeEClass.getESuperTypes().add(this.getChangeOperator());
		removeGraphEdgeEClass.getESuperTypes().add(this.getChangeOperator());
		renabeGraphEdgeLabelEClass.getESuperTypes().add(this.getChangeOperator());
		databaseEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getNamedElement());
		primitiveDataTypeEClass.getESuperTypes().add(this.getDataType());
		freeTextEClass.getESuperTypes().add(this.getPrimitiveDataType());
		customDataTypeEClass.getESuperTypes().add(this.getDataType());
		dataTypeItemEClass.getESuperTypes().add(this.getNamedElement());
		entityEClass.getESuperTypes().add(this.getDataType());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		relationEClass.getESuperTypes().add(this.getNamedElement());
		relationalDBEClass.getESuperTypes().add(this.getDatabase());
		tableEClass.getESuperTypes().add(this.getNamedElement());
		tableEClass.getESuperTypes().add(this.getGenericList());
		indexSpecEClass.getESuperTypes().add(this.getNamedElement());
		documentDBEClass.getESuperTypes().add(this.getDatabase());
		collectionEClass.getESuperTypes().add(this.getGenericList());
		collectionEClass.getESuperTypes().add(this.getNamedElement());
		keyValueDBEClass.getESuperTypes().add(this.getDatabase());
		keyValueElementEClass.getESuperTypes().add(this.getNamedElement());
		keyValueElementEClass.getESuperTypes().add(this.getGenericList());
		graphDBEClass.getESuperTypes().add(this.getDatabase());
		graphNodeEClass.getESuperTypes().add(this.getNamedElement());
		graphNodeEClass.getESuperTypes().add(this.getGenericList());
		graphAttributeEClass.getESuperTypes().add(this.getNamedElement());
		graphEdgeEClass.getESuperTypes().add(this.getNamedElement());
		graphEdgeLabelEClass.getESuperTypes().add(this.getNamedElement());
		columnDBEClass.getESuperTypes().add(this.getDatabase());
		columnEClass.getESuperTypes().add(this.getNamedElement());
		columnEClass.getESuperTypes().add(this.getGenericList());
		renameEntityEClass.getESuperTypes().add(this.getChangeOperator());
		changeRelationContainementEClass.getESuperTypes().add(this.getChangeOperator());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Databases(), this.getDatabase(), null, "databases", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DataTypes(), this.getDataType(), null, "dataTypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_ChangeOperators(), this.getChangeOperator(), null, "changeOperators", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeOperatorEClass, ChangeOperator.class, "ChangeOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addEntityEClass, AddEntity.class, "AddEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeEntityEClass, RemoveEntity.class, "RemoveEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveEntity_EntityToRemove(), this.getEntity(), null, "entityToRemove", null, 1, 1, RemoveEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splitEntityEClass, SplitEntity.class, "SplitEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitEntity_EntityToBeSplit(), this.getEntity(), null, "entityToBeSplit", null, 1, 1, SplitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplitEntity_FirstNewEntity(), this.getEntity(), null, "firstNewEntity", null, 1, 1, SplitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSplitEntity_SecondNewEntity(), this.getEntity(), null, "secondNewEntity", null, 1, 1, SplitEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(migrateEntityEClass, MigrateEntity.class, "MigrateEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMigrateEntity_Entity(), this.getEntity(), null, "entity", null, 1, 1, MigrateEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMigrateEntity_NewDatabase(), this.getDatabase(), null, "newDatabase", null, 1, 1, MigrateEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeEntityEClass, MergeEntity.class, "MergeEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMergeEntity_FirstEntityToMerge(), this.getEntity(), null, "firstEntityToMerge", null, 1, 1, MergeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeEntity_SecondEntityToMerge(), this.getEntity(), null, "secondEntityToMerge", null, 1, 1, MergeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeEntity_NewEntityName(), ecorePackage.getEString(), "newEntityName", null, 0, 1, MergeEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addRelationEClass, AddRelation.class, "AddRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeRelationEClass, RemoveRelation.class, "RemoveRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveRelation_RelationToRemove(), this.getRelation(), null, "relationToRemove", null, 1, 1, RemoveRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameRelationEClass, RenameRelation.class, "RenameRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenameRelation_RelationToRename(), this.getRelation(), null, "relationToRename", null, 1, 1, RenameRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameRelation_NewRelationName(), ecorePackage.getEString(), "newRelationName", null, 0, 1, RenameRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enableRelationContainmentEClass, EnableRelationContainment.class, "EnableRelationContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnableRelationContainment_Relation(), this.getRelation(), null, "relation", null, 1, 1, EnableRelationContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disableRelationContainmentEClass, DisableRelationContainment.class, "DisableRelationContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisableRelationContainment_Relation(), this.getRelation(), null, "relation", null, 1, 1, DisableRelationContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enableBidirectionalRelationEClass, EnableBidirectionalRelation.class, "EnableBidirectionalRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnableBidirectionalRelation_Relation(), this.getRelation(), null, "relation", null, 1, 1, EnableBidirectionalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(disableBidirectionalRelationEClass, DisableBidirectionalRelation.class, "DisableBidirectionalRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisableBidirectionalRelation_Relation(), this.getRelation(), null, "relation", null, 1, 1, DisableBidirectionalRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRelationCardinalityEClass, ChangeRelationCardinality.class, "ChangeRelationCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeRelationCardinality_Relation(), this.getRelation(), null, "relation", null, 1, 1, ChangeRelationCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRelationCardinality_NewCardinality(), this.getCardinality(), "newCardinality", null, 1, 1, ChangeRelationCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAttributeEClass, AddAttribute.class, "AddAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeAttributeTypeEClass, ChangeAttributeType.class, "ChangeAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeAttributeType_AttributeToChange(), this.getAttribute(), null, "attributeToChange", null, 1, 1, ChangeAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeAttributeType_NewType(), this.getDataType(), null, "newType", null, 0, 1, ChangeAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeAttributeEClass, RemoveAttribute.class, "RemoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveAttribute_AttributeToRemove(), this.getAttribute(), null, "attributeToRemove", null, 1, 1, RemoveAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameAttributeEClass, RenameAttribute.class, "RenameAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenameAttribute_AttributeToRename(), this.getAttribute(), null, "attributeToRename", null, 1, 1, RenameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameAttribute_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameTableEClass, RenameTable.class, "RenameTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenameTable_TableToRename(), this.getTable(), null, "tableToRename", null, 1, 1, RenameTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameTable_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addIdentifierEClass, AddIdentifier.class, "AddIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddIdentifier_Entity(), this.getEntity(), null, "entity", null, 1, 1, AddIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddIdentifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, AddIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAttributesToIdenfifierEClass, AddAttributesToIdenfifier.class, "AddAttributesToIdenfifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddAttributesToIdenfifier_Identifier(), this.getEntityIdentifier(), null, "identifier", null, 1, 1, AddAttributesToIdenfifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddAttributesToIdenfifier_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AddAttributesToIdenfifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeIdentifierEClass, RemoveIdentifier.class, "RemoveIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveIdentifier_EntityIdentifier(), this.getEntityIdentifier(), null, "entityIdentifier", null, 1, 1, RemoveIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeAttributesToIdenfifierEClass, RemoveAttributesToIdenfifier.class, "RemoveAttributesToIdenfifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveAttributesToIdenfifier_Identifier(), this.getEntityIdentifier(), null, "identifier", null, 1, 1, RemoveAttributesToIdenfifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRemoveAttributesToIdenfifier_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, RemoveAttributesToIdenfifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameIdentifierEClass, RenameIdentifier.class, "RenameIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenameIdentifier_Identifier(), this.getEntityIdentifier(), null, "identifier", null, 1, 1, RenameIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameIdentifier_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addIndexEClass, AddIndex.class, "AddIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddIndex_Table(), this.getTable(), null, "table", null, 1, 1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddIndex_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AddIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropIndexEClass, DropIndex.class, "DropIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDropIndex_Table(), this.getTable(), null, "table", null, 1, 1, DropIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addGraphAttributeEClass, AddGraphAttribute.class, "AddGraphAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeGraphAttributeEClass, RemoveGraphAttribute.class, "RemoveGraphAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveGraphAttribute_Node(), this.getGraphNode(), null, "node", null, 1, 1, RemoveGraphAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addGraphEdgeEClass, AddGraphEdge.class, "AddGraphEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeGraphEdgeEClass, RemoveGraphEdge.class, "RemoveGraphEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRemoveGraphEdge_GraphEdgeToRemove(), this.getGraphEdge(), null, "graphEdgeToRemove", null, 1, 1, RemoveGraphEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renabeGraphEdgeLabelEClass, RenabeGraphEdgeLabel.class, "RenabeGraphEdgeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenabeGraphEdgeLabel_Edge(), this.getGraphEdge(), null, "edge", null, 1, 1, RenabeGraphEdgeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenabeGraphEdgeLabel_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenabeGraphEdgeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(freeTextEClass, FreeText.class, "FreeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customDataTypeEClass, CustomDataType.class, "CustomDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomDataType_Elements(), this.getDataTypeItem(), null, "elements", null, 0, -1, CustomDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeItemEClass, DataTypeItem.class, "DataTypeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataTypeItem_Type(), this.getDataType(), null, "type", null, 0, 1, DataTypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeItem_Implementation(), this.getDataTypeImplementationPackage(), null, "implementation", null, 1, 1, DataTypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeImplementationPackageEClass, DataTypeImplementationPackage.class, "DataTypeImplementationPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypeImplementationPackage_Location(), ecorePackage.getEString(), "location", null, 0, 1, DataTypeImplementationPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Relations(), this.getRelation(), null, "relations", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_Identifer(), this.getEntityIdentifier(), null, "identifer", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_GenericList(), this.getGenericList(), this.getGenericList_Entity(), "genericList", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityIdentifierEClass, EntityIdentifier.class, "EntityIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityIdentifier_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, EntityIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute_Type(), this.getDataType(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Type(), this.getEntity(), null, "type", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_Cardinality(), this.getCardinality(), "cardinality", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Opposite(), this.getRelation(), null, "opposite", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelation_IsContainment(), ecorePackage.getEBooleanObject(), "isContainment", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationalDBEClass, RelationalDB.class, "RelationalDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationalDB_Tables(), this.getTable(), null, "tables", null, 0, -1, RelationalDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_IndexSpec(), this.getIndexSpec(), this.getIndexSpec_Table(), "indexSpec", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_IdSpec(), this.getIdSpec(), this.getIdSpec_Table(), "idSpec", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Db(), this.getDatabase(), null, "db", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexSpecEClass, IndexSpec.class, "IndexSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexSpec_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, IndexSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexSpec_References(), this.getRelation(), null, "references", null, 0, -1, IndexSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndexSpec_Table(), this.getTable(), this.getTable_IndexSpec(), "table", null, 1, 1, IndexSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idSpecEClass, IdSpec.class, "IdSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdSpec_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, IdSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdSpec_Table(), this.getTable(), this.getTable_IdSpec(), "table", null, 1, 1, IdSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentDBEClass, DocumentDB.class, "DocumentDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentDB_Collections(), this.getCollection(), null, "collections", null, 0, -1, DocumentDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionEClass, Collection.class, "Collection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keyValueDBEClass, KeyValueDB.class, "KeyValueDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKeyValueDB_Elements(), this.getKeyValueElement(), null, "elements", null, 0, -1, KeyValueDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyValueElementEClass, KeyValueElement.class, "KeyValueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyValueElement_Key(), ecorePackage.getEString(), "key", null, 0, 1, KeyValueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKeyValueElement_Values(), this.getDataType(), null, "values", null, 0, -1, KeyValueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphDBEClass, GraphDB.class, "GraphDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphDB_Nodes(), this.getGraphNode(), null, "nodes", null, 0, -1, GraphDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphDB_Edges(), this.getGraphEdge(), null, "edges", null, 0, -1, GraphDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphNodeEClass, GraphNode.class, "GraphNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphNode_Attributes(), this.getGraphAttribute(), null, "attributes", null, 0, -1, GraphNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphAttributeEClass, GraphAttribute.class, "GraphAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphAttribute_Value(), this.getAttribute(), null, "value", null, 0, 1, GraphAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEdgeEClass, GraphEdge.class, "GraphEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphEdge_From(), this.getGraphNode(), null, "from", null, 0, 1, GraphEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphEdge_To(), this.getGraphNode(), null, "to", null, 0, 1, GraphEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphEdge_Labels(), this.getGraphEdgeLabel(), null, "labels", null, 0, -1, GraphEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEdgeLabelEClass, GraphEdgeLabel.class, "GraphEdgeLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphEdgeLabel_Type(), this.getDataType(), null, "type", null, 0, 1, GraphEdgeLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnDBEClass, ColumnDB.class, "ColumnDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnDB_Columns(), this.getColumn(), null, "columns", null, 0, -1, ColumnDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericListEClass, GenericList.class, "GenericList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericList_Entity(), this.getEntity(), this.getEntity_GenericList(), "entity", null, 0, 1, GenericList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameEntityEClass, RenameEntity.class, "RenameEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenameEntity_EntityToRename(), this.getEntity(), null, "entityToRename", null, 0, 1, RenameEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameEntity_NewEntityName(), ecorePackage.getEString(), "newEntityName", null, 0, 1, RenameEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRelationContainementEClass, ChangeRelationContainement.class, "ChangeRelationContainement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeRelationContainement_Relation(), this.getRelation(), null, "relation", null, 1, 1, ChangeRelationContainement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeRelationContainement_NewContainment(), ecorePackage.getEBooleanObject(), "newContainment", null, 1, 1, ChangeRelationContainement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cardinalityEEnum, Cardinality.class, "Cardinality");
		addEEnumLiteral(cardinalityEEnum, Cardinality.ZERO_ONE);
		addEEnumLiteral(cardinalityEEnum, Cardinality.ONE);
		addEEnumLiteral(cardinalityEEnum, Cardinality.ZERO_MANY);
		addEEnumLiteral(cardinalityEEnum, Cardinality.ONE_MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //TyphonmlPackageImpl
