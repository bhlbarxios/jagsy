/**
 * generated by Xtext 2.12.0
 */
package com.opcoach.bugsy.xtext.bugsDsl.impl;

import com.opcoach.bugsy.xtext.bugsDsl.BugsDslFactory;
import com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage;
import com.opcoach.bugsy.xtext.bugsDsl.BugsModel;
import com.opcoach.bugsy.xtext.bugsDsl.Distribution;
import com.opcoach.bugsy.xtext.bugsDsl.For;
import com.opcoach.bugsy.xtext.bugsDsl.Function;
import com.opcoach.bugsy.xtext.bugsDsl.Instruction;
import com.opcoach.bugsy.xtext.bugsDsl.Operation;
import com.opcoach.bugsy.xtext.bugsDsl.Parameter;
import com.opcoach.bugsy.xtext.bugsDsl.Relation;
import com.opcoach.bugsy.xtext.bugsDsl.RelationType;

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
public class BugsDslPackageImpl extends EPackageImpl implements BugsDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bugsModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum distributionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum functionEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum relationTypeEEnum = null;

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
   * @see com.opcoach.bugsy.xtext.bugsDsl.BugsDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BugsDslPackageImpl()
  {
    super(eNS_URI, BugsDslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link BugsDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BugsDslPackage init()
  {
    if (isInited) return (BugsDslPackage)EPackage.Registry.INSTANCE.getEPackage(BugsDslPackage.eNS_URI);

    // Obtain or create and register package
    BugsDslPackageImpl theBugsDslPackage = (BugsDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BugsDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BugsDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBugsDslPackage.createPackageContents();

    // Initialize created meta-data
    theBugsDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBugsDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BugsDslPackage.eNS_URI, theBugsDslPackage);
    return theBugsDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBugsModel()
  {
    return bugsModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBugsModel_Instructions()
  {
    return (EReference)bugsModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor()
  {
    return forEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_Variable()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_Low()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFor_High()
  {
    return (EAttribute)forEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Contents()
  {
    return (EReference)forEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelation()
  {
    return relationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_Name()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelation_RelationType()
  {
    return (EAttribute)relationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelation_LeftExpr()
  {
    return (EReference)relationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Distrib()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Function()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Elements()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Value()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDistribution()
  {
    return distributionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFunction()
  {
    return functionEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getRelationType()
  {
    return relationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BugsDslFactory getBugsDslFactory()
  {
    return (BugsDslFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    bugsModelEClass = createEClass(BUGS_MODEL);
    createEReference(bugsModelEClass, BUGS_MODEL__INSTRUCTIONS);

    instructionEClass = createEClass(INSTRUCTION);

    forEClass = createEClass(FOR);
    createEAttribute(forEClass, FOR__VARIABLE);
    createEAttribute(forEClass, FOR__LOW);
    createEAttribute(forEClass, FOR__HIGH);
    createEReference(forEClass, FOR__CONTENTS);

    relationEClass = createEClass(RELATION);
    createEAttribute(relationEClass, RELATION__NAME);
    createEAttribute(relationEClass, RELATION__RELATION_TYPE);
    createEReference(relationEClass, RELATION__LEFT_EXPR);

    operationEClass = createEClass(OPERATION);
    createEAttribute(operationEClass, OPERATION__DISTRIB);
    createEAttribute(operationEClass, OPERATION__FUNCTION);
    createEReference(operationEClass, OPERATION__ELEMENTS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__VALUE);

    // Create enums
    distributionEEnum = createEEnum(DISTRIBUTION);
    functionEEnum = createEEnum(FUNCTION);
    relationTypeEEnum = createEEnum(RELATION_TYPE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    forEClass.getESuperTypes().add(this.getInstruction());
    relationEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(bugsModelEClass, BugsModel.class, "BugsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBugsModel_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, BugsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(forEClass, For.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFor_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFor_Low(), ecorePackage.getEInt(), "low", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFor_High(), ecorePackage.getEString(), "high", null, 0, 1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Contents(), this.getInstruction(), null, "contents", null, 0, -1, For.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRelation_RelationType(), this.getRelationType(), "relationType", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRelation_LeftExpr(), this.getOperation(), null, "leftExpr", null, 0, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperation_Distrib(), this.getDistribution(), "distrib", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOperation_Function(), this.getFunction(), "function", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOperation_Elements(), this.getParameter(), null, "elements", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(distributionEEnum, Distribution.class, "Distribution");
    addEEnumLiteral(distributionEEnum, Distribution.DBERN);
    addEEnumLiteral(distributionEEnum, Distribution.DBETA);
    addEEnumLiteral(distributionEEnum, Distribution.DBIN);
    addEEnumLiteral(distributionEEnum, Distribution.DCHISQR);
    addEEnumLiteral(distributionEEnum, Distribution.DDEXP);
    addEEnumLiteral(distributionEEnum, Distribution.DEXP);
    addEEnumLiteral(distributionEEnum, Distribution.DF);
    addEEnumLiteral(distributionEEnum, Distribution.DGAMMA);
    addEEnumLiteral(distributionEEnum, Distribution.DGENGAMM);
    addEEnumLiteral(distributionEEnum, Distribution.DHYPER);
    addEEnumLiteral(distributionEEnum, Distribution.DLOGIS);
    addEEnumLiteral(distributionEEnum, Distribution.DLNORM);
    addEEnumLiteral(distributionEEnum, Distribution.DNEGBIN);
    addEEnumLiteral(distributionEEnum, Distribution.DNCHISQR);
    addEEnumLiteral(distributionEEnum, Distribution.DNORM);
    addEEnumLiteral(distributionEEnum, Distribution.DPAR);
    addEEnumLiteral(distributionEEnum, Distribution.DPOIS);
    addEEnumLiteral(distributionEEnum, Distribution.DT);
    addEEnumLiteral(distributionEEnum, Distribution.DWEIB);

    initEEnum(functionEEnum, Function.class, "Function");
    addEEnumLiteral(functionEEnum, Function.ACOS);
    addEEnumLiteral(functionEEnum, Function.ACOSH);
    addEEnumLiteral(functionEEnum, Function.ASIN);
    addEEnumLiteral(functionEEnum, Function.ASINH);
    addEEnumLiteral(functionEEnum, Function.ATAN);
    addEEnumLiteral(functionEEnum, Function.LOG);
    addEEnumLiteral(functionEEnum, Function.EP);
    addEEnumLiteral(functionEEnum, Function.C);

    initEEnum(relationTypeEEnum, RelationType.class, "RelationType");
    addEEnumLiteral(relationTypeEEnum, RelationType.STOCHASTIC);
    addEEnumLiteral(relationTypeEEnum, RelationType.DETERMIN1);
    addEEnumLiteral(relationTypeEEnum, RelationType.DETERMIN2);

    // Create resource
    createResource(eNS_URI);
  }

} //BugsDslPackageImpl
