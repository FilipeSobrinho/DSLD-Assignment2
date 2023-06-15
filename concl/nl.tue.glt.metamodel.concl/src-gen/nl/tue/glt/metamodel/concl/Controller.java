/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.Controller#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getController()
 * @model
 * @generated
 */
public interface Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.metamodel.concl.ControllerColor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.ControllerColor
	 * @see #setColor(ControllerColor)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getController_Color()
	 * @model
	 * @generated
	 */
	ControllerColor getColor();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.Controller#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.ControllerColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(ControllerColor value);

} // Controller
