/**
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.validation;

import org.eclipse.xtext.validation.Check;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Participant;
import org.polarsys.capella.scenario.editor.dslscenario.validation.AbstractDslValidator;
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DslValidator extends AbstractDslValidator {
  public static final String INVALID_NAME = "invalidName";
  
  @Check
  public void checkPartExists(final Participant participant) {
    boolean _contains = EmbeddedEditorInstanceHelper.getAvailablePartNames().contains(participant.getName());
    boolean _not = (!_contains);
    if (_not) {
      this.error("Represented part does not exist", DslPackage.Literals.PARTICIPANT__NAME, DslValidator.INVALID_NAME);
    }
  }
  
  @Check
  public void checkParticipantKeywordIsValid(final Participant participant) {
    boolean _checkValidKeyword = EmbeddedEditorInstanceHelper.checkValidKeyword(participant.getKeyword());
    boolean _not = (!_checkValidKeyword);
    if (_not) {
      String _keyword = participant.getKeyword();
      String _plus = ("\'" + _keyword);
      String _plus_1 = (_plus + "\' could not be used in this diagram");
      this.error(_plus_1, 
        DslPackage.Literals.PARTICIPANT__KEYWORD);
    }
  }
}
