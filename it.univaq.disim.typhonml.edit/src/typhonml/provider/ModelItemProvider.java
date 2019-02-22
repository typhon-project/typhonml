/**
 */
package typhonml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import typhonml.Model;
import typhonml.TyphonmlFactory;
import typhonml.TyphonmlPackage;

/**
 * This is the item provider adapter for a {@link typhonml.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TyphonmlPackage.Literals.MODEL__DATABASES);
			childrenFeatures.add(TyphonmlPackage.Literals.MODEL__DATA_TYPES);
			childrenFeatures.add(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Model_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
			case TyphonmlPackage.MODEL__DATABASES:
			case TyphonmlPackage.MODEL__DATA_TYPES:
			case TyphonmlPackage.MODEL__CHANGE_OPERATORS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATABASES,
				 TyphonmlFactory.eINSTANCE.createRelationalDB()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATABASES,
				 TyphonmlFactory.eINSTANCE.createDocumentDB()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATABASES,
				 TyphonmlFactory.eINSTANCE.createKeyValueDB()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATABASES,
				 TyphonmlFactory.eINSTANCE.createGraphDB()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATABASES,
				 TyphonmlFactory.eINSTANCE.createColumnDB()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATA_TYPES,
				 TyphonmlFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATA_TYPES,
				 TyphonmlFactory.eINSTANCE.createAddEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATA_TYPES,
				 TyphonmlFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATA_TYPES,
				 TyphonmlFactory.eINSTANCE.createFreeText()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__DATA_TYPES,
				 TyphonmlFactory.eINSTANCE.createCustomDataType()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createSplitEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createMigrateEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createMergeEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRenameRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createEnableRelationContainment()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createDisableRelationContainment()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createEnableBidirectionalRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createDisableBidirectionalRelation()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createChangeRelationCardinality()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createChangeAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRenameAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRenameTable()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddAttributesToIdenfifier()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveAttributesToIdenfifier()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRenameIdentifier()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddIndex()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createDropIndex()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddGraphAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveGraphAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createAddGraphEdge()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRemoveGraphEdge()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRenabeGraphEdgeLabel()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createRenameEntity()));

		newChildDescriptors.add
			(createChildParameter
				(TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS,
				 TyphonmlFactory.eINSTANCE.createChangeRelationContainement()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == TyphonmlPackage.Literals.MODEL__DATA_TYPES ||
			childFeature == TyphonmlPackage.Literals.MODEL__CHANGE_OPERATORS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TyphonmlEditPlugin.INSTANCE;
	}

}
