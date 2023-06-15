/**
 */
package nl.tue.glt.metamodel.concl.impl;

import nl.tue.glt.metamodel.concl.ConclPackage;
import nl.tue.glt.metamodel.concl.DisplayComponent;
import nl.tue.glt.metamodel.concl.DisplayType;
import nl.tue.glt.metamodel.concl.Resolution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl#getDiagonalSize <em>Diagonal Size</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.impl.DisplayComponentImpl#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayComponentImpl extends MinimalEObjectImpl.Container implements DisplayComponent {
	/**
	 * The default value of the '{@link #getDiagonalSize() <em>Diagonal Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalSize()
	 * @generated
	 * @ordered
	 */
	protected static final float DIAGONAL_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDiagonalSize() <em>Diagonal Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagonalSize()
	 * @generated
	 * @ordered
	 */
	protected float diagonalSize = DIAGONAL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayType() <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayType()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayType DISPLAY_TYPE_EDEFAULT = DisplayType.LED;

	/**
	 * The cached value of the '{@link #getDisplayType() <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayType()
	 * @generated
	 * @ordered
	 */
	protected DisplayType displayType = DISPLAY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final Resolution RESOLUTION_EDEFAULT = Resolution.HD;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected Resolution resolution = RESOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConclPackage.Literals.DISPLAY_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDiagonalSize() {
		return diagonalSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagonalSize(float newDiagonalSize) {
		float oldDiagonalSize = diagonalSize;
		diagonalSize = newDiagonalSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConclPackage.DISPLAY_COMPONENT__DIAGONAL_SIZE,
					oldDiagonalSize, diagonalSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayType getDisplayType() {
		return displayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayType(DisplayType newDisplayType) {
		DisplayType oldDisplayType = displayType;
		displayType = newDisplayType == null ? DISPLAY_TYPE_EDEFAULT : newDisplayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConclPackage.DISPLAY_COMPONENT__DISPLAY_TYPE,
					oldDisplayType, displayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolution getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolution(Resolution newResolution) {
		Resolution oldResolution = resolution;
		resolution = newResolution == null ? RESOLUTION_EDEFAULT : newResolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConclPackage.DISPLAY_COMPONENT__RESOLUTION,
					oldResolution, resolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ConclPackage.DISPLAY_COMPONENT__DIAGONAL_SIZE:
			return getDiagonalSize();
		case ConclPackage.DISPLAY_COMPONENT__DISPLAY_TYPE:
			return getDisplayType();
		case ConclPackage.DISPLAY_COMPONENT__RESOLUTION:
			return getResolution();
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
		case ConclPackage.DISPLAY_COMPONENT__DIAGONAL_SIZE:
			setDiagonalSize((Float) newValue);
			return;
		case ConclPackage.DISPLAY_COMPONENT__DISPLAY_TYPE:
			setDisplayType((DisplayType) newValue);
			return;
		case ConclPackage.DISPLAY_COMPONENT__RESOLUTION:
			setResolution((Resolution) newValue);
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
		case ConclPackage.DISPLAY_COMPONENT__DIAGONAL_SIZE:
			setDiagonalSize(DIAGONAL_SIZE_EDEFAULT);
			return;
		case ConclPackage.DISPLAY_COMPONENT__DISPLAY_TYPE:
			setDisplayType(DISPLAY_TYPE_EDEFAULT);
			return;
		case ConclPackage.DISPLAY_COMPONENT__RESOLUTION:
			setResolution(RESOLUTION_EDEFAULT);
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
		case ConclPackage.DISPLAY_COMPONENT__DIAGONAL_SIZE:
			return diagonalSize != DIAGONAL_SIZE_EDEFAULT;
		case ConclPackage.DISPLAY_COMPONENT__DISPLAY_TYPE:
			return displayType != DISPLAY_TYPE_EDEFAULT;
		case ConclPackage.DISPLAY_COMPONENT__RESOLUTION:
			return resolution != RESOLUTION_EDEFAULT;
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
		result.append(" (diagonalSize: ");
		result.append(diagonalSize);
		result.append(", displayType: ");
		result.append(displayType);
		result.append(", resolution: ");
		result.append(resolution);
		result.append(')');
		return result.toString();
	}

} //DisplayComponentImpl
