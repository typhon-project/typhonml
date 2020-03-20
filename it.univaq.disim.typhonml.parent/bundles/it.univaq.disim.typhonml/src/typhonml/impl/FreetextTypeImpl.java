/**
 */
package typhonml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import typhonml.FreetextType;
import typhonml.NlpTask;
import typhonml.TyphonmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freetext Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link typhonml.impl.FreetextTypeImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link typhonml.impl.FreetextTypeImpl#getWorkflowName <em>Workflow Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreetextTypeImpl extends PrimitiveDataTypeImpl implements FreetextType {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected NlpTask tasks;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreetextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TyphonmlPackage.Literals.FREETEXT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NlpTask getTasks() {
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTasks(NlpTask newTasks, NotificationChain msgs) {
		NlpTask oldTasks = tasks;
		tasks = newTasks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TyphonmlPackage.FREETEXT_TYPE__TASKS, oldTasks, newTasks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTasks(NlpTask newTasks) {
		if (newTasks != tasks) {
			NotificationChain msgs = null;
			if (tasks != null)
				msgs = ((InternalEObject)tasks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.FREETEXT_TYPE__TASKS, null, msgs);
			if (newTasks != null)
				msgs = ((InternalEObject)newTasks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TyphonmlPackage.FREETEXT_TYPE__TASKS, null, msgs);
			msgs = basicSetTasks(newTasks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.FREETEXT_TYPE__TASKS, newTasks, newTasks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TyphonmlPackage.FREETEXT_TYPE__WORKFLOW_NAME, oldWorkflowName, workflowName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TyphonmlPackage.FREETEXT_TYPE__TASKS:
				return basicSetTasks(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TyphonmlPackage.FREETEXT_TYPE__TASKS:
				return getTasks();
			case TyphonmlPackage.FREETEXT_TYPE__WORKFLOW_NAME:
				return getWorkflowName();
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
			case TyphonmlPackage.FREETEXT_TYPE__TASKS:
				setTasks((NlpTask)newValue);
				return;
			case TyphonmlPackage.FREETEXT_TYPE__WORKFLOW_NAME:
				setWorkflowName((String)newValue);
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
			case TyphonmlPackage.FREETEXT_TYPE__TASKS:
				setTasks((NlpTask)null);
				return;
			case TyphonmlPackage.FREETEXT_TYPE__WORKFLOW_NAME:
				setWorkflowName(WORKFLOW_NAME_EDEFAULT);
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
			case TyphonmlPackage.FREETEXT_TYPE__TASKS:
				return tasks != null;
			case TyphonmlPackage.FREETEXT_TYPE__WORKFLOW_NAME:
				return WORKFLOW_NAME_EDEFAULT == null ? workflowName != null : !WORKFLOW_NAME_EDEFAULT.equals(workflowName);
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
		result.append(')');
		return result.toString();
	}

} //FreetextTypeImpl
