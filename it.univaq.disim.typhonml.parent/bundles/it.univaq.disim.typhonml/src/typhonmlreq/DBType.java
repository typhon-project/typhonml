/**
 */
package typhonmlreq;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link typhonmlreq.DBType#getFrequirements <em>Frequirements</em>}</li>
 *   <li>{@link typhonmlreq.DBType#getNfrequirements <em>Nfrequirements</em>}</li>
 *   <li>{@link typhonmlreq.DBType#getDbType <em>Db Type</em>}</li>
 * </ul>
 *
 * @see typhonmlreq.TyphonmlreqPackage#getDBType()
 * @model
 * @generated
 */
public interface DBType extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Frequirements</b></em>' containment reference list.
	 * The list contents are of type {@link typhonmlreq.FRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequirements</em>' containment reference list.
	 * @see typhonmlreq.TyphonmlreqPackage#getDBType_Frequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FRequirement> getFrequirements();

	/**
	 * Returns the value of the '<em><b>Nfrequirements</b></em>' containment reference list.
	 * The list contents are of type {@link typhonmlreq.NFRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nfrequirements</em>' containment reference list.
	 * @see typhonmlreq.TyphonmlreqPackage#getDBType_Nfrequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NFRequirement> getNfrequirements();

	/**
	 * Returns the value of the '<em><b>Db Type</b></em>' attribute.
	 * The literals are from the enumeration {@link typhonmlreq.databaseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Type</em>' attribute.
	 * @see typhonmlreq.databaseType
	 * @see #setDbType(databaseType)
	 * @see typhonmlreq.TyphonmlreqPackage#getDBType_DbType()
	 * @model required="true"
	 * @generated
	 */
	databaseType getDbType();

	/**
	 * Sets the value of the '{@link typhonmlreq.DBType#getDbType <em>Db Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Type</em>' attribute.
	 * @see typhonmlreq.databaseType
	 * @see #getDbType()
	 * @generated
	 */
	void setDbType(databaseType value);

} // DBType
