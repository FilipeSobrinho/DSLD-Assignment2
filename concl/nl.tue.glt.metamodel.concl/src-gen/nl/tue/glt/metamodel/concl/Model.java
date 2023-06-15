/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.Model#getConsolepack <em>Consolepack</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Consolepack</b></em>' containment reference list.
	 * The list contents are of type {@link nl.tue.glt.metamodel.concl.ConsolePack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consolepack</em>' containment reference list.
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getModel_Consolepack()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConsolePack> getConsolepack();

} // Model
