/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see nl.tue.glt.metamodel.concl.ConclFactory
 * @model kind="package"
 * @generated
 */
public interface ConclPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "concl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/concl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "concl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConclPackage eINSTANCE = nl.tue.glt.metamodel.concl.impl.ConclPackageImpl.init();

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.impl.ConsolePackImpl <em>Console Pack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.impl.ConsolePackImpl
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getConsolePack()
	 * @generated
	 */
	int CONSOLE_PACK = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_PACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Consolecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_PACK__CONSOLECOMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Controllercomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_PACK__CONTROLLERCOMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Gamecomponent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_PACK__GAMECOMPONENT = 3;

	/**
	 * The number of structural features of the '<em>Console Pack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_PACK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Console Pack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_PACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.impl.ConsoleImpl <em>Console</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.impl.ConsoleImpl
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getConsole()
	 * @generated
	 */
	int CONSOLE = 1;

	/**
	 * The feature id for the '<em><b>Displaycomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE__DISPLAYCOMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE__STORAGE = 1;

	/**
	 * The number of structural features of the '<em>Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.impl.ControllerImpl
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.impl.GameImpl
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 3;

	/**
	 * The feature id for the '<em><b>Game Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_NAME = 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl <em>Display Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getDisplayComponent()
	 * @generated
	 */
	int DISPLAY_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Diagonal Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_COMPONENT__DIAGONAL_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Display Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_COMPONENT__DISPLAY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_COMPONENT__RESOLUTION = 2;

	/**
	 * The number of structural features of the '<em>Display Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Display Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.impl.ModelImpl
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Consolepack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CONSOLEPACK = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.Resolution <em>Resolution</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.Resolution
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getResolution()
	 * @generated
	 */
	int RESOLUTION = 6;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.DisplayType <em>Display Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.DisplayType
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getDisplayType()
	 * @generated
	 */
	int DISPLAY_TYPE = 7;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.GameName <em>Game Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.GameName
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getGameName()
	 * @generated
	 */
	int GAME_NAME = 8;

	/**
	 * The meta object id for the '{@link nl.tue.glt.metamodel.concl.ControllerColor <em>Controller Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see nl.tue.glt.metamodel.concl.ControllerColor
	 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getControllerColor()
	 * @generated
	 */
	int CONTROLLER_COLOR = 9;

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.metamodel.concl.ConsolePack <em>Console Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console Pack</em>'.
	 * @see nl.tue.glt.metamodel.concl.ConsolePack
	 * @generated
	 */
	EClass getConsolePack();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.ConsolePack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see nl.tue.glt.metamodel.concl.ConsolePack#getName()
	 * @see #getConsolePack()
	 * @generated
	 */
	EAttribute getConsolePack_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.metamodel.concl.ConsolePack#getConsolecomponent <em>Consolecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consolecomponent</em>'.
	 * @see nl.tue.glt.metamodel.concl.ConsolePack#getConsolecomponent()
	 * @see #getConsolePack()
	 * @generated
	 */
	EReference getConsolePack_Consolecomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.metamodel.concl.ConsolePack#getControllercomponent <em>Controllercomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllercomponent</em>'.
	 * @see nl.tue.glt.metamodel.concl.ConsolePack#getControllercomponent()
	 * @see #getConsolePack()
	 * @generated
	 */
	EReference getConsolePack_Controllercomponent();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.metamodel.concl.ConsolePack#getGamecomponent <em>Gamecomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gamecomponent</em>'.
	 * @see nl.tue.glt.metamodel.concl.ConsolePack#getGamecomponent()
	 * @see #getConsolePack()
	 * @generated
	 */
	EReference getConsolePack_Gamecomponent();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.metamodel.concl.Console <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console</em>'.
	 * @see nl.tue.glt.metamodel.concl.Console
	 * @generated
	 */
	EClass getConsole();

	/**
	 * Returns the meta object for the containment reference '{@link nl.tue.glt.metamodel.concl.Console#getDisplaycomponent <em>Displaycomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Displaycomponent</em>'.
	 * @see nl.tue.glt.metamodel.concl.Console#getDisplaycomponent()
	 * @see #getConsole()
	 * @generated
	 */
	EReference getConsole_Displaycomponent();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.Console#getStorage <em>Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage</em>'.
	 * @see nl.tue.glt.metamodel.concl.Console#getStorage()
	 * @see #getConsole()
	 * @generated
	 */
	EAttribute getConsole_Storage();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.metamodel.concl.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see nl.tue.glt.metamodel.concl.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.Controller#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see nl.tue.glt.metamodel.concl.Controller#getColor()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Color();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.metamodel.concl.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see nl.tue.glt.metamodel.concl.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.Game#getGameName <em>Game Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Name</em>'.
	 * @see nl.tue.glt.metamodel.concl.Game#getGameName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameName();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.metamodel.concl.DisplayComponent <em>Display Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Component</em>'.
	 * @see nl.tue.glt.metamodel.concl.DisplayComponent
	 * @generated
	 */
	EClass getDisplayComponent();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.DisplayComponent#getDiagonalSize <em>Diagonal Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diagonal Size</em>'.
	 * @see nl.tue.glt.metamodel.concl.DisplayComponent#getDiagonalSize()
	 * @see #getDisplayComponent()
	 * @generated
	 */
	EAttribute getDisplayComponent_DiagonalSize();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.DisplayComponent#getDisplayType <em>Display Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Type</em>'.
	 * @see nl.tue.glt.metamodel.concl.DisplayComponent#getDisplayType()
	 * @see #getDisplayComponent()
	 * @generated
	 */
	EAttribute getDisplayComponent_DisplayType();

	/**
	 * Returns the meta object for the attribute '{@link nl.tue.glt.metamodel.concl.DisplayComponent#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see nl.tue.glt.metamodel.concl.DisplayComponent#getResolution()
	 * @see #getDisplayComponent()
	 * @generated
	 */
	EAttribute getDisplayComponent_Resolution();

	/**
	 * Returns the meta object for class '{@link nl.tue.glt.metamodel.concl.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see nl.tue.glt.metamodel.concl.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link nl.tue.glt.metamodel.concl.Model#getConsolepack <em>Consolepack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consolepack</em>'.
	 * @see nl.tue.glt.metamodel.concl.Model#getConsolepack()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Consolepack();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.metamodel.concl.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Resolution</em>'.
	 * @see nl.tue.glt.metamodel.concl.Resolution
	 * @generated
	 */
	EEnum getResolution();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.metamodel.concl.DisplayType <em>Display Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Type</em>'.
	 * @see nl.tue.glt.metamodel.concl.DisplayType
	 * @generated
	 */
	EEnum getDisplayType();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.metamodel.concl.GameName <em>Game Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Game Name</em>'.
	 * @see nl.tue.glt.metamodel.concl.GameName
	 * @generated
	 */
	EEnum getGameName();

	/**
	 * Returns the meta object for enum '{@link nl.tue.glt.metamodel.concl.ControllerColor <em>Controller Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Controller Color</em>'.
	 * @see nl.tue.glt.metamodel.concl.ControllerColor
	 * @generated
	 */
	EEnum getControllerColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConclFactory getConclFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.impl.ConsolePackImpl <em>Console Pack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.impl.ConsolePackImpl
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getConsolePack()
		 * @generated
		 */
		EClass CONSOLE_PACK = eINSTANCE.getConsolePack();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLE_PACK__NAME = eINSTANCE.getConsolePack_Name();

		/**
		 * The meta object literal for the '<em><b>Consolecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSOLE_PACK__CONSOLECOMPONENT = eINSTANCE.getConsolePack_Consolecomponent();

		/**
		 * The meta object literal for the '<em><b>Controllercomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSOLE_PACK__CONTROLLERCOMPONENT = eINSTANCE.getConsolePack_Controllercomponent();

		/**
		 * The meta object literal for the '<em><b>Gamecomponent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSOLE_PACK__GAMECOMPONENT = eINSTANCE.getConsolePack_Gamecomponent();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.impl.ConsoleImpl <em>Console</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.impl.ConsoleImpl
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getConsole()
		 * @generated
		 */
		EClass CONSOLE = eINSTANCE.getConsole();

		/**
		 * The meta object literal for the '<em><b>Displaycomponent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSOLE__DISPLAYCOMPONENT = eINSTANCE.getConsole_Displaycomponent();

		/**
		 * The meta object literal for the '<em><b>Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSOLE__STORAGE = eINSTANCE.getConsole_Storage();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.impl.ControllerImpl
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__COLOR = eINSTANCE.getController_Color();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.impl.GameImpl
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Game Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_NAME = eINSTANCE.getGame_GameName();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl <em>Display Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getDisplayComponent()
		 * @generated
		 */
		EClass DISPLAY_COMPONENT = eINSTANCE.getDisplayComponent();

		/**
		 * The meta object literal for the '<em><b>Diagonal Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_COMPONENT__DIAGONAL_SIZE = eINSTANCE.getDisplayComponent_DiagonalSize();

		/**
		 * The meta object literal for the '<em><b>Display Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_COMPONENT__DISPLAY_TYPE = eINSTANCE.getDisplayComponent_DisplayType();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_COMPONENT__RESOLUTION = eINSTANCE.getDisplayComponent_Resolution();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.impl.ModelImpl
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Consolepack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CONSOLEPACK = eINSTANCE.getModel_Consolepack();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.Resolution <em>Resolution</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.Resolution
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getResolution()
		 * @generated
		 */
		EEnum RESOLUTION = eINSTANCE.getResolution();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.DisplayType <em>Display Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.DisplayType
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getDisplayType()
		 * @generated
		 */
		EEnum DISPLAY_TYPE = eINSTANCE.getDisplayType();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.GameName <em>Game Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.GameName
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getGameName()
		 * @generated
		 */
		EEnum GAME_NAME = eINSTANCE.getGameName();

		/**
		 * The meta object literal for the '{@link nl.tue.glt.metamodel.concl.ControllerColor <em>Controller Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see nl.tue.glt.metamodel.concl.ControllerColor
		 * @see nl.tue.glt.metamodel.concl.impl.ConclPackageImpl#getControllerColor()
		 * @generated
		 */
		EEnum CONTROLLER_COLOR = eINSTANCE.getControllerColor();

	}

} //ConclPackage
