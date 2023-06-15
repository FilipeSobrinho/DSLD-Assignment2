/**
 */
package nl.tue.glt.metamodel.concl.impl;

import nl.tue.glt.metamodel.concl.ConclFactory;
import nl.tue.glt.metamodel.concl.ConclPackage;
import nl.tue.glt.metamodel.concl.Console;
import nl.tue.glt.metamodel.concl.ConsolePack;
import nl.tue.glt.metamodel.concl.Controller;
import nl.tue.glt.metamodel.concl.ControllerColor;
import nl.tue.glt.metamodel.concl.DisplayComponent;
import nl.tue.glt.metamodel.concl.DisplayType;
import nl.tue.glt.metamodel.concl.Game;
import nl.tue.glt.metamodel.concl.GameName;
import nl.tue.glt.metamodel.concl.Model;
import nl.tue.glt.metamodel.concl.Resolution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConclPackageImpl extends EPackageImpl implements ConclPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consolePackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resolutionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gameNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controllerColorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConclPackageImpl() {
		super(eNS_URI, ConclFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConclPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConclPackage init() {
		if (isInited)
			return (ConclPackage) EPackage.Registry.INSTANCE.getEPackage(ConclPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConclPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConclPackageImpl theConclPackage = registeredConclPackage instanceof ConclPackageImpl
				? (ConclPackageImpl) registeredConclPackage
				: new ConclPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theConclPackage.createPackageContents();

		// Initialize created meta-data
		theConclPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConclPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConclPackage.eNS_URI, theConclPackage);
		return theConclPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsolePack() {
		return consolePackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsolePack_Name() {
		return (EAttribute) consolePackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsolePack_Consolecomponent() {
		return (EReference) consolePackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsolePack_Controllercomponent() {
		return (EReference) consolePackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsolePack_Gamecomponent() {
		return (EReference) consolePackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsole() {
		return consoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsole_Displaycomponent() {
		return (EReference) consoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConsole_Storage() {
		return (EAttribute) consoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getController_Color() {
		return (EAttribute) controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGame() {
		return gameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGame_GameName() {
		return (EAttribute) gameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayComponent() {
		return displayComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayComponent_DiagonalSize() {
		return (EAttribute) displayComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayComponent_DisplayType() {
		return (EAttribute) displayComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayComponent_Resolution() {
		return (EAttribute) displayComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Consolepack() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResolution() {
		return resolutionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayType() {
		return displayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGameName() {
		return gameNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControllerColor() {
		return controllerColorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConclFactory getConclFactory() {
		return (ConclFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		consolePackEClass = createEClass(CONSOLE_PACK);
		createEAttribute(consolePackEClass, CONSOLE_PACK__NAME);
		createEReference(consolePackEClass, CONSOLE_PACK__CONSOLECOMPONENT);
		createEReference(consolePackEClass, CONSOLE_PACK__CONTROLLERCOMPONENT);
		createEReference(consolePackEClass, CONSOLE_PACK__GAMECOMPONENT);

		consoleEClass = createEClass(CONSOLE);
		createEReference(consoleEClass, CONSOLE__DISPLAYCOMPONENT);
		createEAttribute(consoleEClass, CONSOLE__STORAGE);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__COLOR);

		gameEClass = createEClass(GAME);
		createEAttribute(gameEClass, GAME__GAME_NAME);

		displayComponentEClass = createEClass(DISPLAY_COMPONENT);
		createEAttribute(displayComponentEClass, DISPLAY_COMPONENT__DIAGONAL_SIZE);
		createEAttribute(displayComponentEClass, DISPLAY_COMPONENT__DISPLAY_TYPE);
		createEAttribute(displayComponentEClass, DISPLAY_COMPONENT__RESOLUTION);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__CONSOLEPACK);

		// Create enums
		resolutionEEnum = createEEnum(RESOLUTION);
		displayTypeEEnum = createEEnum(DISPLAY_TYPE);
		gameNameEEnum = createEEnum(GAME_NAME);
		controllerColorEEnum = createEEnum(CONTROLLER_COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(consolePackEClass, ConsolePack.class, "ConsolePack", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConsolePack_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConsolePack.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsolePack_Consolecomponent(), this.getConsole(), null, "consolecomponent", null, 1, -1,
				ConsolePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsolePack_Controllercomponent(), this.getController(), null, "controllercomponent", null, 1,
				-1, ConsolePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsolePack_Gamecomponent(), this.getGame(), null, "gamecomponent", null, 1, -1,
				ConsolePack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consoleEClass, Console.class, "Console", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsole_Displaycomponent(), this.getDisplayComponent(), null, "displaycomponent", null, 1, 1,
				Console.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConsole_Storage(), ecorePackage.getEInt(), "storage", null, 0, 1, Console.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Color(), this.getControllerColor(), "color", null, 0, 1, Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGame_GameName(), this.getGameName(), "gameName", null, 0, 1, Game.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayComponentEClass, DisplayComponent.class, "DisplayComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayComponent_DiagonalSize(), ecorePackage.getEFloat(), "diagonalSize", null, 0, 1,
				DisplayComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayComponent_DisplayType(), this.getDisplayType(), "displayType", null, 0, 1,
				DisplayComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayComponent_Resolution(), this.getResolution(), "resolution", null, 0, 1,
				DisplayComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Consolepack(), this.getConsolePack(), null, "consolepack", null, 1, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resolutionEEnum, Resolution.class, "Resolution");
		addEEnumLiteral(resolutionEEnum, Resolution.HD);
		addEEnumLiteral(resolutionEEnum, Resolution.FULL_HD);
		addEEnumLiteral(resolutionEEnum, Resolution.FOUR_K);
		addEEnumLiteral(resolutionEEnum, Resolution.FIVE_K);

		initEEnum(displayTypeEEnum, DisplayType.class, "DisplayType");
		addEEnumLiteral(displayTypeEEnum, DisplayType.LED);
		addEEnumLiteral(displayTypeEEnum, DisplayType.OLED);

		initEEnum(gameNameEEnum, GameName.class, "GameName");
		addEEnumLiteral(gameNameEEnum, GameName.NO_GAME);
		addEEnumLiteral(gameNameEEnum, GameName.HEDWIG_THE_HEDGEHOG);
		addEEnumLiteral(gameNameEEnum, GameName.LINKS_RESOLUTION);

		initEEnum(controllerColorEEnum, ControllerColor.class, "ControllerColor");
		addEEnumLiteral(controllerColorEEnum, ControllerColor.BLACK);
		addEEnumLiteral(controllerColorEEnum, ControllerColor.WHITE);
		addEEnumLiteral(controllerColorEEnum, ControllerColor.RED);
		addEEnumLiteral(controllerColorEEnum, ControllerColor.BLUE);
		addEEnumLiteral(controllerColorEEnum, ControllerColor.GOLD);
		addEEnumLiteral(controllerColorEEnum, ControllerColor.SILVER);
		addEEnumLiteral(controllerColorEEnum, ControllerColor.GREEN);

		// Create resource
		createResource(eNS_URI);
	}

} //ConclPackageImpl
