/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import typhonml.NlpTask;
import typhonml.NlpTaskType;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nlp Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.NlpTaskImpl#getWorkflowName <em>Workflow Name</em>}</li>
 *   <li>{@link typhonml.impl.NlpTaskImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NlpTaskImpl extends MinimalEObjectImpl.Container implements NlpTask {
	/**
	 * The default value of the '{@link #getWorkflowName() <em>Workflow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowName()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKFLOW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkflowName() <em>Workflow Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowName()
	 * @generated
	 * @ordered
	 */
	protected String workflowName = WORKFLOW_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NlpTaskType TYPE_EDEFAULT = NlpTaskType.PARAGRAPH_SEGMENTATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NlpTaskType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NlpTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.NLP_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkflowName() {
		return workflowName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflowName(String newWorkflowName) {
		String oldWorkflowName = workflowName;
		workflowName = newWorkflowName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.NLP_TASK__WORKFLOW_NAME, oldWorkflowName, workflowName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NlpTaskType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(NlpTaskType newType) {
		NlpTaskType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.NLP_TASK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.NLP_TASK__WORKFLOW_NAME:
				return getWorkflowName();
			case TyphonmlPackage.NLP_TASK__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TyphonmlPackage.NLP_TASK__WORKFLOW_NAME:
				setWorkflowName((String)newValue);
				return;
			case TyphonmlPackage.NLP_TASK__TYPE:
				setType((NlpTaskType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TyphonmlPackage.NLP_TASK__WORKFLOW_NAME:
				setWorkflowName(WORKFLOW_NAME_EDEFAULT);
				return;
			case TyphonmlPackage.NLP_TASK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TyphonmlPackage.NLP_TASK__WORKFLOW_NAME:
				return WORKFLOW_NAME_EDEFAULT == null ? workflowName != null : !WORKFLOW_NAME_EDEFAULT.equals(workflowName);
			case TyphonmlPackage.NLP_TASK__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (workflowName: ");
		result.append(workflowName);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NlpTaskImpl
