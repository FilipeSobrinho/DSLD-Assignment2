/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.Game#getGameName <em>Game Name</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Game Name</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.metamodel.concl.GameName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Name</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.GameName
	 * @see #setGameName(GameName)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getGame_GameName()
	 * @model
	 * @generated
	 */
	GameName getGameName();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.Game#getGameName <em>Game Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Name</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.GameName
	 * @see #getGameName()
	 * @generated
	 */
	void setGameName(GameName value);

} // Game
