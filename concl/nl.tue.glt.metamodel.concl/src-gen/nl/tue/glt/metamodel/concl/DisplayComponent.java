/**
 */
package nl.tue.glt.metamodel.concl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nl.tue.glt.metamodel.concl.DisplayComponent#getDiagonalSize <em>Diagonal Size</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.DisplayComponent#getDisplayType <em>Display Type</em>}</li>
 *   <li>{@link nl.tue.glt.metamodel.concl.DisplayComponent#getResolution <em>Resolution</em>}</li>
 * </ul>
 *
 * @see nl.tue.glt.metamodel.concl.ConclPackage#getDisplayComponent()
 * @model
 * @generated
 */
public interface DisplayComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Diagonal Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagonal Size</em>' attribute.
	 * @see #setDiagonalSize(float)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getDisplayComponent_DiagonalSize()
	 * @model
	 * @generated
	 */
	float getDiagonalSize();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.DisplayComponent#getDiagonalSize <em>Diagonal Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagonal Size</em>' attribute.
	 * @see #getDiagonalSize()
	 * @generated
	 */
	void setDiagonalSize(float value);

	/**
	 * Returns the value of the '<em><b>Display Type</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.metamodel.concl.DisplayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Type</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.DisplayType
	 * @see #setDisplayType(DisplayType)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getDisplayComponent_DisplayType()
	 * @model
	 * @generated
	 */
	DisplayType getDisplayType();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.DisplayComponent#getDisplayType <em>Display Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Type</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.DisplayType
	 * @see #getDisplayType()
	 * @generated
	 */
	void setDisplayType(DisplayType value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * The literals are from the enumeration {@link nl.tue.glt.metamodel.concl.Resolution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.Resolution
	 * @see #setResolution(Resolution)
	 * @see nl.tue.glt.metamodel.concl.ConclPackage#getDisplayComponent_Resolution()
	 * @model
	 * @generated
	 */
	Resolution getResolution();

	/**
	 * Sets the value of the '{@link nl.tue.glt.metamodel.concl.DisplayComponent#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see nl.tue.glt.metamodel.concl.Resolution
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(Resolution value);

} // DisplayComponent
