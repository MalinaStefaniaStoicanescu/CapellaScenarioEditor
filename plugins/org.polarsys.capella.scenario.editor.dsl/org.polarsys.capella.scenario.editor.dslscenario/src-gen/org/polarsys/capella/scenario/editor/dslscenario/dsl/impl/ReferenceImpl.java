/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.ReferenceImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.ReferenceImpl#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link org.polarsys.capella.scenario.editor.dslscenario.dsl.impl.ReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends MinimalEObjectImpl.Container implements Reference
{
  /**
   * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected static final String KEYWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyword()
   * @generated
   * @ordered
   */
  protected String keyword = KEYWORD_EDEFAULT;

  /**
   * The cached value of the '{@link #getTimelines() <em>Timelines</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimelines()
   * @generated
   * @ordered
   */
  protected EList<String> timelines;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getKeyword()
  {
    return keyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setKeyword(String newKeyword)
  {
    String oldKeyword = keyword;
    keyword = newKeyword;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.REFERENCE__KEYWORD, oldKeyword, keyword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getTimelines()
  {
    if (timelines == null)
    {
      timelines = new EDataTypeEList<String>(String.class, this, DslPackage.REFERENCE__TIMELINES);
    }
    return timelines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.REFERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.REFERENCE__KEYWORD:
        return getKeyword();
      case DslPackage.REFERENCE__TIMELINES:
        return getTimelines();
      case DslPackage.REFERENCE__NAME:
        return getName();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.REFERENCE__KEYWORD:
        setKeyword((String)newValue);
        return;
      case DslPackage.REFERENCE__TIMELINES:
        getTimelines().clear();
        getTimelines().addAll((Collection<? extends String>)newValue);
        return;
      case DslPackage.REFERENCE__NAME:
        setName((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.REFERENCE__KEYWORD:
        setKeyword(KEYWORD_EDEFAULT);
        return;
      case DslPackage.REFERENCE__TIMELINES:
        getTimelines().clear();
        return;
      case DslPackage.REFERENCE__NAME:
        setName(NAME_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.REFERENCE__KEYWORD:
        return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
      case DslPackage.REFERENCE__TIMELINES:
        return timelines != null && !timelines.isEmpty();
      case DslPackage.REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (keyword: ");
    result.append(keyword);
    result.append(", timelines: ");
    result.append(timelines);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ReferenceImpl
