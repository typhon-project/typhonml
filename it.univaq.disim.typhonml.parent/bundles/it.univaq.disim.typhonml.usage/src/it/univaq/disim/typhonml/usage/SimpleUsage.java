package it.univaq.disim.typhonml.usage;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import it.univaq.disim.typhon.TyphonMLStandaloneSetup;
import typhonml.AddAttribute;
import typhonml.Attribute;
import typhonml.Collection;
import typhonml.DataType;
import typhonml.DocumentDB;
import typhonml.Entity;
import typhonml.Model;
import typhonml.RelationalDB;
import typhonml.RenameEntity;
import typhonml.Table;
import typhonml.TyphonmlFactory;
import typhonml.TyphonmlPackage;

public class SimpleUsage {
	private static final String COMPLETE_MODEL_PATH = "resources/generated_demo.xmi";
	private static final String COMPLETE_TML_PATH = "resources/my.tml";
	final private static ResourceSet resourceSet = new ResourceSetImpl();
	
	
	public SimpleUsage() {
		//The Typhon Metamodel registring is MANDATORY as first command in order to be able to use it.
		typhonMLPackageRegistering();
	}
	
	
	public static void main(String[] args) {
		SimpleUsage usageExample = new SimpleUsage();
		//Create base test typhon model instance
//		Model typhonModelExample = usageExample.createTyphonModelExample();
//
//		//CHANGE OPERATORS TEST
//		Entity entity = usageExample.getEntityByName(typhonModelExample, "CreditCard");
//		
//		usageExample.changeOperatorRenameEntity(typhonModelExample, entity, "newCreditCardName");
//		usageExample.changeOperatorAddAttributeIntoEntity(typhonModelExample, entity, "New Attribute for "+entity.getName()+ " entity");
		Resource modelResource2 = usageExample.loadModel("resources/My.tmlx");
		
		Model model = (Model) modelResource2.getContents().get(0);
		model.getDataTypes().forEach(z->System.out.println(z.getName()));
		usageExample.generateTMLXFromTML("resources/demo.xmi");
		usageExample.saveTML(model);
	}
	
	
	/**
	 * Simple method to retrieve an Entity by its name
	 * @param typhonModel
	 * @param entityName
	 * @return
	 */
	private Entity getEntityByName(Model typhonModel, String entityName) {
		Entity foundEntity = null;
		
		EList<DataType> entities = typhonModel.getDataTypes();
		for (DataType dataType : entities) {
			if(dataType instanceof Entity && dataType.getName().equalsIgnoreCase(entityName)) {
				foundEntity = (Entity) dataType;
			}
		}
		return foundEntity;
	}
	
	
	/**
	 * Change Operator example that add an attribute inside an entity
	 * @param typhonModel
	 * @param entity
	 * @param attributeName
	 * @return
	 */
	private Entity changeOperatorAddAttributeIntoEntity(Model typhonModel, Entity entity, String attributeName) {
		AddAttribute addAttribute = TyphonmlFactory.eINSTANCE.createAddAttribute();
		addAttribute.setName(attributeName);
		addAttribute.setType(entity);
		entity.getAttributes().add(addAttribute);
		saveModel(typhonModel);
		System.out.println("\tTyphonML model instance update with change operator in "+COMPLETE_MODEL_PATH);
		return entity;
	}
	
	
	/**
	 * Change Operator example that rename an entity
	 * @param typhonModel
	 * @param entityToRename
	 * @param newName
	 */
	private void changeOperatorRenameEntity(Model typhonModel, Entity entityToRename, String newName) {
		RenameEntity renameEntity = TyphonmlFactory.eINSTANCE.createRenameEntity();
		renameEntity.setEntityToRename(entityToRename);
		renameEntity.setNewEntityName(newName);
		typhonModel.getChangeOperators().add(renameEntity);
		saveModel(typhonModel);
		System.out.println("\tTyphonML model instance update with change operator in "+COMPLETE_MODEL_PATH);
	}
	
	
	/**
	 * Actual Typhon Model instance creation
	 * @return
	 */
	private Model createTyphonModelExample() {
		//Create root
		Model root = TyphonmlFactory.eINSTANCE.createModel();
			
		//ENTITY USER
		Entity entityUser = TyphonmlFactory.eINSTANCE.createEntity();
		entityUser.setName("User");
			Attribute userAttributeName = createAttribute("name", entityUser);
			entityUser.getAttributes().add(userAttributeName);
			Attribute userAttributeSurname = createAttribute("surname", entityUser);
			entityUser.getAttributes().add(userAttributeSurname);
		root.getDataTypes().add(entityUser);
			
		//ENTITY ORDER	
		Entity entityOrder = TyphonmlFactory.eINSTANCE.createEntity();
		entityOrder.setName("Order");
			Attribute orderAttributeName = createAttribute("date", entityOrder);
			entityOrder.getAttributes().add(orderAttributeName);
			Attribute orderAttributeTotalAmount = createAttribute("totalAmount", entityOrder);
			entityOrder.getAttributes().add(orderAttributeTotalAmount);
		root.getDataTypes().add(entityOrder);
		
		//ENTITY REVIEW
		Entity entityReview = TyphonmlFactory.eINSTANCE.createEntity();
		entityReview.setName("Review");
			Attribute reviewAttributeRaiting = createAttribute("raiting", entityReview);
			entityReview.getAttributes().add(reviewAttributeRaiting);
			Attribute reviewAttributeTitle = createAttribute("title", entityReview);
			entityReview.getAttributes().add(reviewAttributeTitle);
		root.getDataTypes().add(entityReview);
		
		//ENTITY COMMENT
		Entity entityComment = TyphonmlFactory.eINSTANCE.createEntity();
		entityComment.setName("Comment");
			Attribute commentAttributeContent = createAttribute("content", entityComment);
			entityComment.getAttributes().add(commentAttributeContent);
		root.getDataTypes().add(entityComment);
		
		//ENTITY CREDITCARD
		Entity entityCreditCard = TyphonmlFactory.eINSTANCE.createEntity();
		entityCreditCard.setName("CreditCard");
			Attribute creditCardAttributeNumber = createAttribute("number", entityCreditCard);
			entityCreditCard.getAttributes().add(creditCardAttributeNumber);
			Attribute creditCardAttributeExpiryDate = createAttribute("expiryDate", entityCreditCard);
			entityCreditCard.getAttributes().add(creditCardAttributeExpiryDate);
		root.getDataTypes().add(entityCreditCard);
		
		
		//DOCUMENT DB
		DocumentDB documentDB = TyphonmlFactory.eINSTANCE.createDocumentDB();
			documentDB.setName("MongoDB");
				Collection orderCollection = TyphonmlFactory.eINSTANCE.createCollection();
				orderCollection.setName("orderCollection");
				orderCollection.setEntity(entityOrder);
			documentDB.getCollections().add(orderCollection);
	
		//RELATIONAL DB
		RelationalDB relationalDB = TyphonmlFactory.eINSTANCE.createRelationalDB();
			relationalDB.setName("MySQL");
				Table clientsTable = TyphonmlFactory.eINSTANCE.createTable();
				clientsTable.setName("clientsTable");
				clientsTable.setDb(relationalDB);
				clientsTable.setEntity(entityUser);
			relationalDB.getTables().add(clientsTable);
		
		root.getDatabases().add(documentDB);
		root.getDatabases().add(relationalDB);

		saveModel(root);
		System.out.println("TyphonML model instance created in "+COMPLETE_MODEL_PATH);
		return root;
	}
	
	/**
	 * Utility method that helps in create attributes
	 * @param name
	 * @param entity
	 * @return
	 */
	private Attribute createAttribute(String name, Entity entity) {
		Attribute attribute = TyphonmlFactory.eINSTANCE.createAttribute();
		attribute.setName(name);
		attribute.setType(entity);
		return attribute;
	}
	
	/**
	 * Method needed before use TyphonML classes. It register all the needed resources.
	 */
	public void typhonMLPackageRegistering() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("tmlx", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("tml", new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(XtextResourceSet.class));
		resourceSet.getPackageRegistry().put(TyphonmlPackage.eINSTANCE.getNsURI(), TyphonmlPackage.eINSTANCE);
	}
	
	
	/**
	 * Method used to save the typhon instance model
	 * @param typhonmlModel
	 */
	private void saveModel(Model typhonmlModel) {
		Resource resource = resourceSet.createResource(URI.createURI(COMPLETE_MODEL_PATH));
        resource.getContents().add(typhonmlModel);
        
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	private void saveTML(Model typhonmlModel) {
		XtextResourceSet resourceSetXText = new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration()
				.getInstance(XtextResourceSet.class);
		resourceSetXText.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSetXText.createResource(URI.createURI(COMPLETE_TML_PATH));
        resource.getContents().add(typhonmlModel);
        
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * Used to load model from path. It will load as Ecore Resource
	 * @param modelPath
	 * @return
	 */
	private Resource loadModel(String modelPath) {
		URI uri = URI.createFileURI(modelPath);
		Resource resource = resourceSet.getResource(uri, true);
		return resource;
	}
	
	private  Resource loadTml(String modelPath) {
		XtextResourceSet resourceSetXText = new TyphonMLStandaloneSetup().createInjectorAndDoEMFRegistration()
				.getInstance(XtextResourceSet.class);
		resourceSetXText.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		URI uri = URI.createURI(modelPath);
		Resource resource = resourceSetXText.getResource(uri, true);		
		return resource;
	}
	
	public void generateTMLXFromTML(String tmlxPath) {
		Resource resource = loadTml(tmlxPath);
		Model model = (Model) resource.getContents().get(0);
		saveModel(model);
		
	}

}
