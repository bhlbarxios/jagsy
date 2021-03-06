/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bugs Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.opcoach.bugsy.xtext.bugsDsl.BugsModel#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#getBugsModel()
 * @model
 * @generated
 */
public interface BugsModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link com.opcoach.bugsy.xtext.bugsDsl.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#getBugsModel_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // BugsModel
