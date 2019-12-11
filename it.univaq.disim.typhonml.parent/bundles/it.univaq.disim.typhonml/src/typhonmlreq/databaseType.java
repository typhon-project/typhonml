/**
 */
package typhonmlreq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>database Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see typhonmlreq.TyphonmlreqPackage#getdatabaseType()
 * @model
 * @generated
 */
public enum databaseType implements Enumerator {
	/**
	 * The '<em><b>Relational DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONAL_DB_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONAL_DB(0, "RelationalDB", "RelationalDB"),

	/**
	 * The '<em><b>Document DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_DB_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_DB(1, "DocumentDB", "DocumentDB"),

	/**
	 * The '<em><b>Key Value DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE_DB_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_VALUE_DB(2, "KeyValueDB", "KeyValueDB"),

	/**
	 * The '<em><b>Graph DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_DB_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_DB(3, "GraphDB", "GraphDB"),

	/**
	 * The '<em><b>Column DB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLUMN_DB_VALUE
	 * @generated
	 * @ordered
	 */
	COLUMN_DB(4, "ColumnDB", "ColumnDB");

	/**
	 * The '<em><b>Relational DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONAL_DB
	 * @model name="RelationalDB"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_DB_VALUE = 0;

	/**
	 * The '<em><b>Document DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_DB
	 * @model name="DocumentDB"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_DB_VALUE = 1;

	/**
	 * The '<em><b>Key Value DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_VALUE_DB
	 * @model name="KeyValueDB"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_VALUE_DB_VALUE = 2;

	/**
	 * The '<em><b>Graph DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_DB
	 * @model name="GraphDB"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_DB_VALUE = 3;

	/**
	 * The '<em><b>Column DB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLUMN_DB
	 * @model name="ColumnDB"
	 * @generated
	 * @ordered
	 */
	public static final int COLUMN_DB_VALUE = 4;

	/**
	 * An array of all the '<em><b>database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final databaseType[] VALUES_ARRAY =
		new databaseType[] {
			RELATIONAL_DB,
			DOCUMENT_DB,
			KEY_VALUE_DB,
			GRAPH_DB,
			COLUMN_DB,
		};

	/**
	 * A public read-only list of all the '<em><b>database Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<databaseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>database Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static databaseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			databaseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>database Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static databaseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			databaseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>database Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static databaseType get(int value) {
		switch (value) {
			case RELATIONAL_DB_VALUE: return RELATIONAL_DB;
			case DOCUMENT_DB_VALUE: return DOCUMENT_DB;
			case KEY_VALUE_DB_VALUE: return KEY_VALUE_DB;
			case GRAPH_DB_VALUE: return GRAPH_DB;
			case COLUMN_DB_VALUE: return COLUMN_DB;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private databaseType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //databaseType
