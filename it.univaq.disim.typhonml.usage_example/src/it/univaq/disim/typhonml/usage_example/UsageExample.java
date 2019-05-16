package it.univaq.disim.typhonml.usage_example;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import typhonml.Attribute;
import typhonml.Collection;
import typhonml.DocumentDB;
import typhonml.Entity;
import typhonml.Model;
import typhonml.RelationalDB;
import typhonml.Table;
import typhonml.TyphonmlFactory;
import typhonml.TyphonmlPackage;

public class UsageExample {
	
	private static final String COMPLETE_MODEL_PATH = "resources/generated_demo.xmi";
	final private ResourceSet resourceSet = new ResourceSetImpl();

	
	
	public static void main(String[] args) {
		UsageExample usageExample = new UsageExample();
		usageExample.typhonMLPackageRegistering();
		
		//Create root
		Model root = TyphonmlFactory.eINSTANCE.createModel();
			
		//ENTITY USER
		Entity entityUser = TyphonmlFactory.eINSTANCE.createEntity();
		entityUser.setName("User");
			Attribute userAttributeName = usageExample.createAttribute("name", entityUser);
			entityUser.getAttributes().add(userAttributeName);
			Attribute userAttributeSurname = usageExample.createAttribute("surname", entityUser);
			entityUser.getAttributes().add(userAttributeSurname);
		root.getDataTypes().add(entityUser);
			
		//ENTITY ORDER	
		Entity entityOrder = TyphonmlFactory.eINSTANCE.createEntity();
		entityOrder.setName("Order");
			Attribute orderAttributeName = usageExample.createAttribute("date", entityOrder);
			entityOrder.getAttributes().add(orderAttributeName);
			Attribute orderAttributeTotalAmount = usageExample.createAttribute("totalAmount", entityOrder);
			entityOrder.getAttributes().add(orderAttributeTotalAmount);
		root.getDataTypes().add(entityOrder);
		
		//ENTITY REVIEW
		Entity entityReview = TyphonmlFactory.eINSTANCE.createEntity();
		entityReview.setName("Review");
			Attribute reviewAttributeRaiting = usageExample.createAttribute("raiting", entityReview);
			entityReview.getAttributes().add(reviewAttributeRaiting);
			Attribute reviewAttributeTitle = usageExample.createAttribute("title", entityReview);
			entityReview.getAttributes().add(reviewAttributeTitle);
		root.getDataTypes().add(entityReview);
		
		//ENTITY COMMENT
		Entity entityComment = TyphonmlFactory.eINSTANCE.createEntity();
		entityComment.setName("Comment");
			Attribute commentAttributeContent = usageExample.createAttribute("content", entityComment);
			entityComment.getAttributes().add(commentAttributeContent);
		root.getDataTypes().add(entityComment);
		
		//ENTITY CREDITCARD
		Entity entityCreditCard = TyphonmlFactory.eINSTANCE.createEntity();
		entityCreditCard.setName("CreditCard");
			Attribute creditCardAttributeNumber = usageExample.createAttribute("number", entityCreditCard);
			entityCreditCard.getAttributes().add(creditCardAttributeNumber);
			Attribute creditCardAttributeExpiryDate = usageExample.createAttribute("expiryDate", entityCreditCard);
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

		usageExample.saveModel(root);
		System.out.println("TyphonML model instance created in "+COMPLETE_MODEL_PATH);
	}
	
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
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(TyphonmlPackage.eINSTANCE.getNsURI(), TyphonmlPackage.eINSTANCE);
	}
	
	
	/**
	 * Used to load model from path. It will load as Ecore Resource
	 * @param modelPath
	 * @return
	 */
	private Resource loadModel(String modelPath) {
//		ResourceSet resourceSet = new ResourceSetImpl();
		URI uri = URI.createFileURI(modelPath);
		Resource resource = resourceSet.getResource(uri, true);
		return resource;
	}
	
	
	private void saveModel(Model typhonmlModel) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
        
        Resource resource = resourceSet.createResource(URI.createURI(COMPLETE_MODEL_PATH));
        resource.getContents().add(typhonmlModel);
        
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	

}
