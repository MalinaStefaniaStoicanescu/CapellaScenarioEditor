/**
 * -------------------------------------------------------------------------------
 * Copyright (c) 2020 THALES GLOBAL SERVICES.
 * 
 *  This program and the accompanying materials are made available under the
 *   terms of the Eclipse Public License 2.0 which is available at
 *   http://www.eclipse.org/legal/epl-2.0
 * 
 *   SPDX-License-Identifier: EPL-2.0
 * 
 *   Contributors:
 *      Thales - initial API and implementation
 * -------------------------------------------------------------------------------
 */
package org.polarsys.capella.scenario.editor.dslscenario.ui.contentassist;

import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Participant;
import org.polarsys.capella.scenario.editor.dslscenario.dsl.SequenceMessage;
import org.polarsys.capella.scenario.editor.dslscenario.ui.contentassist.AbstractDslProposalProvider;
import org.polarsys.capella.scenario.editor.helper.EmbeddedEditorInstanceHelper;

/**
 * This class is used to display auto-complete proposals when pressing ctrl+space
 */
@SuppressWarnings("all")
public class DslProposalProvider extends AbstractDslProposalProvider {
  /**
   * filter the proposed keywords based on the context in which we edit the text scenario;
   * check the context of the Capella Diagram - layer (OA, SA, LA, PA), type of scenario (IS, ES FS)
   */
  @Override
  public void completeKeyword(final Keyword keyword, final ContentAssistContext contentAssistContext, final ICompletionProposalAcceptor acceptor) {
    ICompletionProposal _createCompletionProposal = this.createCompletionProposal(keyword.getValue(), this.getKeywordDisplayString(keyword), this.getImage(keyword), contentAssistContext);
    ICompletionProposal proposal = ((ICompletionProposal) _createCompletionProposal);
    boolean _checkValidKeyword = EmbeddedEditorInstanceHelper.checkValidKeyword(proposal.getDisplayString());
    if (_checkValidKeyword) {
      this.getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
      acceptor.accept(proposal);
    }
  }
  
  @Override
  public void completeActor_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("actor", context, acceptor);
  }
  
  @Override
  public void completeComponent_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("component", context, acceptor);
  }
  
  @Override
  public void completeConfigurationItem_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("configuration_item", context, acceptor);
  }
  
  @Override
  public void completeFunction_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("function", context, acceptor);
  }
  
  @Override
  public void completeActivity_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("activity", context, acceptor);
  }
  
  @Override
  public void completeEntity_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("entity", context, acceptor);
  }
  
  @Override
  public void completeRole_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.getExistingParticipants("role", context, acceptor);
  }
  
  public void getExistingParticipants(final String keyword, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    List<String> _availablePartNames = EmbeddedEditorInstanceHelper.getAvailablePartNames(keyword);
    for (final String el : _availablePartNames) {
      acceptor.accept(this.createCompletionProposal((("\"" + el) + "\""), (("\"" + el) + "\""), null, context));
    }
  }
  
  @Override
  public void completeSequenceMessage_Source(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EList<Participant> _variablesDefinedBefore2 = this.variablesDefinedBefore2(((Model) model));
    for (final EObject el : _variablesDefinedBefore2) {
      acceptor.accept(this.createCompletionProposal(((Participant) el).getName(), ((Participant) el).getName(), null, context));
    }
  }
  
  @Override
  public void completeSequenceMessage_Target(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    EList<Participant> _variablesDefinedBefore3 = this.variablesDefinedBefore3(((SequenceMessage) model));
    for (final EObject el : _variablesDefinedBefore3) {
      acceptor.accept(this.createCompletionProposal(((Participant) el).getName(), ((Participant) el).getName(), null, context));
    }
  }
  
  @Override
  public void completeSequenceMessage_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    List<String> _messagesDefinedBefore = this.messagesDefinedBefore(((SequenceMessage) model));
    for (final String el : _messagesDefinedBefore) {
      acceptor.accept(this.createCompletionProposal((("\"" + el) + "\""), (("\"" + el) + "\""), null, context));
    }
  }
  
  public List<String> messagesDefinedBefore(final SequenceMessage message) {
    return EmbeddedEditorInstanceHelper.getMessageSequenceName(message.getSource(), message.getTarget());
  }
  
  public Participant variablesDefinedBefore(final Participant sc) {
    return sc;
  }
  
  public EList<Participant> variablesDefinedBefore2(final Model m) {
    return m.getParticipants();
  }
  
  public EList<Participant> variablesDefinedBefore3(final SequenceMessage seq) {
    EObject _eContainer = seq.eContainer();
    return ((Model) _eContainer).getParticipants();
  }
}
