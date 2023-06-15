/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Console Pack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.ConsolePack#getName <em>Name</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.ConsolePack#getConsolecomponent <em>Consolecomponent</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.ConsolePack#getControllercomponent <em>Controllercomponent</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.ConsolePack#getGamecomponent <em>Gamecomponent</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsolePack()
 * @model
 * @generated
 */
public interface ConsolePack extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsolePack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.ConsolePack#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Consolecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.metamodel.concl.Console}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consolecomponent</em>' containment reference list.
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsolePack_Consolecomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Console> getConsolecomponent();

	/**
	 * Returns the value of the '<em><b>Controllercomponent</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.metamodel.concl.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllercomponent</em>' containment reference list.
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsolePack_Controllercomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Controller> getControllercomponent();

	/**
	 * Returns the value of the '<em><b>Gamecomponent</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.metamodel.concl.Game}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gamecomponent</em>' containment reference list.
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsolePack_Gamecomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Game> getGamecomponent();

} // ConsolePack
