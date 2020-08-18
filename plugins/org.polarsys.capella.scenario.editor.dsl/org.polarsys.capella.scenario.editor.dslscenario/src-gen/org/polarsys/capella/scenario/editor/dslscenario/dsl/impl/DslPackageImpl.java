/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.polarsys.capella.scenario.editor.dslscenario.dsl.Activity;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Actor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ArmTimerMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Component;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ConfigurationItem;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.CreateMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DeleteMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslFactory;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Entity;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Function;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.GenericComponent;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.GenericFunction;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Message;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Participant;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ParticipantDeactivation;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Reference;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.ReturnMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Role;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessageType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslPackageImpl extends EPackageImpl implements DslPackage
{
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
  private EClass participantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass genericFunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configurationItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceMessageTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sequenceMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deleteMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass armTimerMessageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass participantDeactivationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

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
   * @see org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DslPackageImpl()
  {
    super(eNS_URI, DslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link DslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DslPackage init()
  {
    if (isInited) return (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DslPackageImpl theDslPackage = registeredDslPackage instanceof DslPackageImpl ? (DslPackageImpl)registeredDslPackage : new DslPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theDslPackage.createPackageContents();

    // Initialize created meta-data
    theDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDslPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DslPackage.eNS_URI, theDslPackage);
    return theDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_Begin()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Participants()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_MessagesOrReferences()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModel_End()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParticipant()
  {
    return participantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParticipant_Keyword()
  {
    return (EAttribute)participantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParticipant_Name()
  {
    return (EAttribute)participantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGenericComponent()
  {
    return genericComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGenericFunction()
  {
    return genericFunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getActor()
  {
    return actorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComponent_Nature()
  {
    return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConfigurationItem()
  {
    return configurationItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getActivity()
  {
    return activityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMessage_Name()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSequenceMessageType()
  {
    return sequenceMessageTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSequenceMessageType_Return()
  {
    return (EReference)sequenceMessageTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSequenceMessageType_Source()
  {
    return (EAttribute)sequenceMessageTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSequenceMessageType_Target()
  {
    return (EAttribute)sequenceMessageTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSequenceMessage()
  {
    return sequenceMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCreateMessage()
  {
    return createMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeleteMessage()
  {
    return deleteMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReturnMessage()
  {
    return returnMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReturnMessage_Target()
  {
    return (EAttribute)returnMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReturnMessage_Source()
  {
    return (EAttribute)returnMessageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReturnMessage_Name()
  {
    return (EAttribute)returnMessageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getArmTimerMessage()
  {
    return armTimerMessageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getArmTimerMessage_Participant()
  {
    return (EAttribute)armTimerMessageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParticipantDeactivation()
  {
    return participantDeactivationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParticipantDeactivation_Keyword()
  {
    return (EAttribute)participantDeactivationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReference_Keyword()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReference_Timelines()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getReference_Name()
  {
    return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DslFactory getDslFactory()
  {
    return (DslFactory)getEFactoryInstance();
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
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__BEGIN);
    createEReference(modelEClass, MODEL__PARTICIPANTS);
    createEReference(modelEClass, MODEL__MESSAGES_OR_REFERENCES);
    createEAttribute(modelEClass, MODEL__END);

    participantEClass = createEClass(PARTICIPANT);
    createEAttribute(participantEClass, PARTICIPANT__KEYWORD);
    createEAttribute(participantEClass, PARTICIPANT__NAME);

    genericComponentEClass = createEClass(GENERIC_COMPONENT);

    genericFunctionEClass = createEClass(GENERIC_FUNCTION);

    actorEClass = createEClass(ACTOR);

    componentEClass = createEClass(COMPONENT);
    createEAttribute(componentEClass, COMPONENT__NATURE);

    configurationItemEClass = createEClass(CONFIGURATION_ITEM);

    functionEClass = createEClass(FUNCTION);

    activityEClass = createEClass(ACTIVITY);

    entityEClass = createEClass(ENTITY);

    roleEClass = createEClass(ROLE);

    messageEClass = createEClass(MESSAGE);
    createEAttribute(messageEClass, MESSAGE__NAME);

    sequenceMessageTypeEClass = createEClass(SEQUENCE_MESSAGE_TYPE);
    createEReference(sequenceMessageTypeEClass, SEQUENCE_MESSAGE_TYPE__RETURN);
    createEAttribute(sequenceMessageTypeEClass, SEQUENCE_MESSAGE_TYPE__SOURCE);
    createEAttribute(sequenceMessageTypeEClass, SEQUENCE_MESSAGE_TYPE__TARGET);

    sequenceMessageEClass = createEClass(SEQUENCE_MESSAGE);

    createMessageEClass = createEClass(CREATE_MESSAGE);

    deleteMessageEClass = createEClass(DELETE_MESSAGE);

    returnMessageEClass = createEClass(RETURN_MESSAGE);
    createEAttribute(returnMessageEClass, RETURN_MESSAGE__TARGET);
    createEAttribute(returnMessageEClass, RETURN_MESSAGE__SOURCE);
    createEAttribute(returnMessageEClass, RETURN_MESSAGE__NAME);

    armTimerMessageEClass = createEClass(ARM_TIMER_MESSAGE);
    createEAttribute(armTimerMessageEClass, ARM_TIMER_MESSAGE__PARTICIPANT);

    participantDeactivationEClass = createEClass(PARTICIPANT_DEACTIVATION);
    createEAttribute(participantDeactivationEClass, PARTICIPANT_DEACTIVATION__KEYWORD);

    referenceEClass = createEClass(REFERENCE);
    createEAttribute(referenceEClass, REFERENCE__KEYWORD);
    createEAttribute(referenceEClass, REFERENCE__TIMELINES);
    createEAttribute(referenceEClass, REFERENCE__NAME);
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
    genericComponentEClass.getESuperTypes().add(this.getParticipant());
    genericFunctionEClass.getESuperTypes().add(this.getParticipant());
    actorEClass.getESuperTypes().add(this.getGenericComponent());
    componentEClass.getESuperTypes().add(this.getGenericComponent());
    configurationItemEClass.getESuperTypes().add(this.getGenericComponent());
    functionEClass.getESuperTypes().add(this.getGenericFunction());
    activityEClass.getESuperTypes().add(this.getGenericFunction());
    entityEClass.getESuperTypes().add(this.getGenericComponent());
    roleEClass.getESuperTypes().add(this.getGenericComponent());
    sequenceMessageTypeEClass.getESuperTypes().add(this.getMessage());
    sequenceMessageEClass.getESuperTypes().add(this.getSequenceMessageType());
    createMessageEClass.getESuperTypes().add(this.getSequenceMessageType());
    deleteMessageEClass.getESuperTypes().add(this.getSequenceMessageType());
    armTimerMessageEClass.getESuperTypes().add(this.getMessage());
    participantDeactivationEClass.getESuperTypes().add(this.getMessage());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_Begin(), ecorePackage.getEString(), "begin", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Participants(), this.getParticipant(), null, "participants", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_MessagesOrReferences(), ecorePackage.getEObject(), null, "messagesOrReferences", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_End(), ecorePackage.getEString(), "end", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(participantEClass, Participant.class, "Participant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParticipant_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParticipant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Participant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(genericComponentEClass, GenericComponent.class, "GenericComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(genericFunctionEClass, GenericFunction.class, "GenericFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComponent_Nature(), ecorePackage.getEString(), "nature", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(configurationItemEClass, ConfigurationItem.class, "ConfigurationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceMessageTypeEClass, SequenceMessageType.class, "SequenceMessageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSequenceMessageType_Return(), this.getReturnMessage(), null, "return", null, 0, 1, SequenceMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSequenceMessageType_Source(), ecorePackage.getEString(), "source", null, 0, 1, SequenceMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSequenceMessageType_Target(), ecorePackage.getEString(), "target", null, 0, 1, SequenceMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sequenceMessageEClass, SequenceMessage.class, "SequenceMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(createMessageEClass, CreateMessage.class, "CreateMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(deleteMessageEClass, DeleteMessage.class, "DeleteMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnMessageEClass, ReturnMessage.class, "ReturnMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReturnMessage_Target(), ecorePackage.getEString(), "target", null, 0, 1, ReturnMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReturnMessage_Source(), ecorePackage.getEString(), "source", null, 0, 1, ReturnMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReturnMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, ReturnMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(armTimerMessageEClass, ArmTimerMessage.class, "ArmTimerMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArmTimerMessage_Participant(), ecorePackage.getEString(), "participant", null, 0, 1, ArmTimerMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(participantDeactivationEClass, ParticipantDeactivation.class, "ParticipantDeactivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParticipantDeactivation_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, ParticipantDeactivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReference_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_Timelines(), ecorePackage.getEString(), "timelines", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DslPackageImpl
