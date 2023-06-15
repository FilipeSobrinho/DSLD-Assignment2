/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Console</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.Console#getDisplaycomponent <em>Displaycomponent</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.Console#getStorage <em>Storage</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsole()
 * @model
 * @generated
 */
public interface Console extends EObject {
	/**
	 * Returns the value of the '<em><b>Displaycomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displaycomponent</em>' containment reference.
	 * @see #setDisplaycomponent(DisplayComponent)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsole_Displaycomponent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DisplayComponent getDisplaycomponent();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.Console#getDisplaycomponent <em>Displaycomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displaycomponent</em>' containment reference.
	 * @see #getDisplaycomponent()
	 * @generated
	 */
	void setDisplaycomponent(DisplayComponent value);

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #setStorage(int)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getConsole_Storage()
	 * @model
	 * @generated
	 */
	int getStorage();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.Console#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(int value);

} // Console
