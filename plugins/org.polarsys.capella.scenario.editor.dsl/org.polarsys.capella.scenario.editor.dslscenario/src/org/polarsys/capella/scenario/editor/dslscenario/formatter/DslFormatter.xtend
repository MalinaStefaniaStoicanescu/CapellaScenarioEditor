/*
 * generated by Xtext 2.18.0.M3
 */
package org.polarsys.capella.scenario.editor.dslscenario.formatter

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.polarsys.capella.scenario.editor.dslscenario.dsl.Model
import org.polarsys.capella.scenario.editor.dslscenario.dsl.DslPackage
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion
import org.polarsys.capella.scenario.editor.dslscenario.services.DslGrammarAccess
import com.google.inject.Inject

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class DslFormatter extends AbstractFormatter2 {
	@Inject extension DslGrammarAccess
	
	def dispatch void format(Model model,  extension IFormattableDocument document) { 
		val actor = model.regionFor.feature(DslPackage.Literals.ACTOR__ID)
		actor.append[newLine]
		val open = model.regionFor.keyword("{") 
		val close = model.regionFor.keyword("}")
		open.append[newLine] 
		interior(open, close)[indent] 
	}
}
