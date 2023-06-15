/**
 */
package nl.tue.glt.metamodel.concl.impl;

import java.util.Collection;

import nl.tue.glt.metamodel.concl.ConclPackage;
import nl.tue.glt.metamodel.concl.Console;
import nl.tue.glt.metamodel.concl.ConsolePack;
import nl.tue.glt.metamodel.concl.Controller;
import nl.tue.glt.metamodel.concl.Game;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Console Pack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.ConsolePackImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.ConsolePackImpl#getConsolecomponent <em>Consolecomponent</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.ConsolePackImpl#getControllercomponent <em>Controllercomponent</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.ConsolePackImpl#getGamecomponent <em>Gamecomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsolePackImpl extends MinimalEObjectImpl.Container implements ConsolePack {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsolecomponent() <em>Consolecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Console> consolecomponent;

	/**
	 * The cached value of the '{@link #getControllercomponent() <em>Controllercomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllercomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllercomponent;

	/**
	 * The cached value of the '{@link #getGamecomponent() <em>Gamecomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGamecomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Game> gamecomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolePackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConclPackage.Literals.CONSOLE_PACK;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConclPackage.CONSOLE_PACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Console> getConsolecomponent() {
		if (consolecomponent == null) {
			consolecomponent = new EObjectContainmentEList<Console>(Console.class, this,
					ConclPackage.CONSOLE_PACK__CONSOLECOMPONENT);
		}
		return consolecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Controller> getControllercomponent() {
		if (controllercomponent == null) {
			controllercomponent = new EObjectContainmentEList<Controller>(Controller.class, this,
					ConclPackage.CONSOLE_PACK__CONTROLLERCOMPONENT);
		}
		return controllercomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game> getGamecomponent() {
		if (gamecomponent == null) {
			gamecomponent = new EObjectContainmentEList<Game>(Game.class, this,
					ConclPackage.CONSOLE_PACK__GAMECOMPONENT);
		}
		return gamecomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConclPackage.CONSOLE_PACK__CONSOLECOMPONENT:
			return ((InternalEList<?>) getConsolecomponent()).basicRemove(otherEnd, msgs);
		case ConclPackage.CONSOLE_PACK__CONTROLLERCOMPONENT:
			return ((InternalEList<?>) getControllercomponent()).basicRemove(otherEnd, msgs);
		case ConclPackage.CONSOLE_PACK__GAMECOMPONENT:
			return ((InternalEList<?>) getGamecomponent()).basicRemove(otherEnd, msgs);
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
		case ConclPackage.CONSOLE_PACK__NAME:
			return getName();
		case ConclPackage.CONSOLE_PACK__CONSOLECOMPONENT:
			return getConsolecomponent();
		case ConclPackage.CONSOLE_PACK__CONTROLLERCOMPONENT:
			return getControllercomponent();
		case ConclPackage.CONSOLE_PACK__GAMECOMPONENT:
			return getGamecomponent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ConclPackage.CONSOLE_PACK__NAME:
			setName((String) newValue);
			return;
		case ConclPackage.CONSOLE_PACK__CONSOLECOMPONENT:
			getConsolecomponent().clear();
			getConsolecomponent().addAll((Collection<? extends Console>) newValue);
			return;
		case ConclPackage.CONSOLE_PACK__CONTROLLERCOMPONENT:
			getControllercomponent().clear();
			getControllercomponent().addAll((Collection<? extends Controller>) newValue);
			return;
		case ConclPackage.CONSOLE_PACK__GAMECOMPONENT:
			getGamecomponent().clear();
			getGamecomponent().addAll((Collection<? extends Game>) newValue);
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
		case ConclPackage.CONSOLE_PACK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ConclPackage.CONSOLE_PACK__CONSOLECOMPONENT:
			getConsolecomponent().clear();
			return;
		case ConclPackage.CONSOLE_PACK__CONTROLLERCOMPONENT:
			getControllercomponent().clear();
			return;
		case ConclPackage.CONSOLE_PACK__GAMECOMPONENT:
			getGamecomponent().clear();
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
		case ConclPackage.CONSOLE_PACK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ConclPackage.CONSOLE_PACK__CONSOLECOMPONENT:
			return consolecomponent != null && !consolecomponent.isEmpty();
		case ConclPackage.CONSOLE_PACK__CONTROLLERCOMPONENT:
			return controllercomponent != null && !controllercomponent.isEmpty();
		case ConclPackage.CONSOLE_PACK__GAMECOMPONENT:
			return gamecomponent != null && !gamecomponent.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConsolePackImpl
