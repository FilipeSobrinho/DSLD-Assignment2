/**
 */
package nl.tue.glt.metamodel.concl.impl;

import nl.tue.glt.metamodel.concl.ConclPackage;
import nl.tue.glt.metamodel.concl.Console;
import nl.tue.glt.metamodel.concl.DisplayComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Console</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.ConsoleImpl#getDisplaycomponent <em>Displaycomponent</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.ConsoleImpl#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsoleImpl extends MinimalEObjectImpl.Container implements Console {
	/**
	 * The cached value of the '{@link #getDisplaycomponent() <em>Displaycomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaycomponent()
	 * @generated
	 * @ordered
	 */
	protected DisplayComponent displaycomponent;

	/**
	 * The default value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected static final int STORAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStorage() <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorage()
	 * @generated
	 * @ordered
	 */
	protected int storage = STORAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConclPackage.Literals.CONSOLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayComponent getDisplaycomponent() {
		return displaycomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplaycomponent(DisplayComponent newDisplaycomponent, NotificationChain msgs) {
		DisplayComponent oldDisplaycomponent = displaycomponent;
		displaycomponent = newDisplaycomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ConclPackage.CONSOLE__DISPLAYCOMPONENT, oldDisplaycomponent, newDisplaycomponent);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplaycomponent(DisplayComponent newDisplaycomponent) {
		if (newDisplaycomponent != displaycomponent) {
			NotificationChain msgs = null;
			if (displaycomponent != null)
				msgs = ((InternalEObject) displaycomponent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ConclPackage.CONSOLE__DISPLAYCOMPONENT, null, msgs);
			if (newDisplaycomponent != null)
				msgs = ((InternalEObject) newDisplaycomponent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ConclPackage.CONSOLE__DISPLAYCOMPONENT, null, msgs);
			msgs = basicSetDisplaycomponent(newDisplaycomponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConclPackage.CONSOLE__DISPLAYCOMPONENT,
					newDisplaycomponent, newDisplaycomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStorage() {
		return storage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStorage(int newStorage) {
		int oldStorage = storage;
		storage = newStorage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConclPackage.CONSOLE__STORAGE, oldStorage, storage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ConclPackage.CONSOLE__DISPLAYCOMPONENT:
			return basicSetDisplaycomponent(null, msgs);
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
		case ConclPackage.CONSOLE__DISPLAYCOMPONENT:
			return getDisplaycomponent();
		case ConclPackage.CONSOLE__STORAGE:
			return getStorage();
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
		case ConclPackage.CONSOLE__DISPLAYCOMPONENT:
			setDisplaycomponent((DisplayComponent) newValue);
			return;
		case ConclPackage.CONSOLE__STORAGE:
			setStorage((Integer) newValue);
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
		case ConclPackage.CONSOLE__DISPLAYCOMPONENT:
			setDisplaycomponent((DisplayComponent) null);
			return;
		case ConclPackage.CONSOLE__STORAGE:
			setStorage(STORAGE_EDEFAULT);
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
		case ConclPackage.CONSOLE__DISPLAYCOMPONENT:
			return displaycomponent != null;
		case ConclPackage.CONSOLE__STORAGE:
			return storage != STORAGE_EDEFAULT;
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
		result.append(" (storage: ");
		result.append(storage);
		result.append(')');
		return result.toString();
	}

} //ConsoleImpl
