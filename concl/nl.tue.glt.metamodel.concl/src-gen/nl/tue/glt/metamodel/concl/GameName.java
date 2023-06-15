/**
 */
package nl.tue.glt.metamodel.concl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Game Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getGameName()
 * @model
 * @generated
 */
public enum GameName implements Enumerator {
	/**
	 * The '<em><b>NO GAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_GAME_VALUE
	 * @generated
	 * @ordered
	 */
	NO_GAME(0, "NO_GAME", "NO_GAME"),

	/**
	 * The '<em><b>HEDWIG THE HEDGEHOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEDWIG_THE_HEDGEHOG_VALUE
	 * @generated
	 * @ordered
	 */
	HEDWIG_THE_HEDGEHOG(1, "HEDWIG_THE_HEDGEHOG", "HEDWIG_THE_HEDGEHOG"),

	/**
	 * The '<em><b>LINKS RESOLUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKS_RESOLUTION_VALUE
	 * @generated
	 * @ordered
	 */
	LINKS_RESOLUTION(2, "LINKS_RESOLUTION", "LINKS_RESOLUTION");

	/**
	 * The '<em><b>NO GAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_GAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_GAME_VALUE = 0;

	/**
	 * The '<em><b>HEDWIG THE HEDGEHOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEDWIG_THE_HEDGEHOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HEDWIG_THE_HEDGEHOG_VALUE = 1;

	/**
	 * The '<em><b>LINKS RESOLUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKS_RESOLUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINKS_RESOLUTION_VALUE = 2;

	/**
	 * An array of all the '<em><b>Game Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GameName[] VALUES_ARRAY = new GameName[] { NO_GAME, HEDWIG_THE_HEDGEHOG, LINKS_RESOLUTION, };

	/**
	 * A public read-only list of all the '<em><b>Game Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GameName> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Game Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GameName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Game Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GameName get(int value) {
		switch (value) {
		case NO_GAME_VALUE:
			return NO_GAME;
		case HEDWIG_THE_HEDGEHOG_VALUE:
			return HEDWIG_THE_HEDGEHOG;
		case LINKS_RESOLUTION_VALUE:
			return LINKS_RESOLUTION;
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
	private GameName(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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

} //GameName
