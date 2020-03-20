/*
 * generated by Xtext 2.20.0
 */
package it.univaq.disim.typhon.serializer;

import com.google.inject.Inject;
import it.univaq.disim.typhon.services.TyphonMLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TyphonMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TyphonMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AddEntity___AttributesKeyword_5_0_LeftSquareBracketKeyword_5_1_RightSquareBracketKeyword_5_3__q;
	protected AbstractElementAlias match_AddEntity___RelationsKeyword_6_0_LeftSquareBracketKeyword_6_1_RightSquareBracketKeyword_6_3__q;
	protected AbstractElementAlias match_Entity_Impl___FunctionalTagsKeyword_0_0_LeftParenthesisKeyword_0_1_RightParenthesisKeyword_0_3__q;
	protected AbstractElementAlias match_Entity_Impl___NFunctionalTagsKeyword_1_0_LeftParenthesisKeyword_1_1_RightParenthesisKeyword_1_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TyphonMLGrammarAccess) access;
		match_AddEntity___AttributesKeyword_5_0_LeftSquareBracketKeyword_5_1_RightSquareBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAddEntityAccess().getAttributesKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getAddEntityAccess().getLeftSquareBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getAddEntityAccess().getRightSquareBracketKeyword_5_3()));
		match_AddEntity___RelationsKeyword_6_0_LeftSquareBracketKeyword_6_1_RightSquareBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAddEntityAccess().getRelationsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getAddEntityAccess().getLeftSquareBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getAddEntityAccess().getRightSquareBracketKeyword_6_3()));
		match_Entity_Impl___FunctionalTagsKeyword_0_0_LeftParenthesisKeyword_0_1_RightParenthesisKeyword_0_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntity_ImplAccess().getFunctionalTagsKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getEntity_ImplAccess().getLeftParenthesisKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getEntity_ImplAccess().getRightParenthesisKeyword_0_3()));
		match_Entity_Impl___NFunctionalTagsKeyword_1_0_LeftParenthesisKeyword_1_1_RightParenthesisKeyword_1_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEntity_ImplAccess().getNFunctionalTagsKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getEntity_ImplAccess().getLeftParenthesisKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getEntity_ImplAccess().getRightParenthesisKeyword_1_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AddEntity___AttributesKeyword_5_0_LeftSquareBracketKeyword_5_1_RightSquareBracketKeyword_5_3__q.equals(syntax))
				emit_AddEntity___AttributesKeyword_5_0_LeftSquareBracketKeyword_5_1_RightSquareBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AddEntity___RelationsKeyword_6_0_LeftSquareBracketKeyword_6_1_RightSquareBracketKeyword_6_3__q.equals(syntax))
				emit_AddEntity___RelationsKeyword_6_0_LeftSquareBracketKeyword_6_1_RightSquareBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity_Impl___FunctionalTagsKeyword_0_0_LeftParenthesisKeyword_0_1_RightParenthesisKeyword_0_3__q.equals(syntax))
				emit_Entity_Impl___FunctionalTagsKeyword_0_0_LeftParenthesisKeyword_0_1_RightParenthesisKeyword_0_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Entity_Impl___NFunctionalTagsKeyword_1_0_LeftParenthesisKeyword_1_1_RightParenthesisKeyword_1_3__q.equals(syntax))
				emit_Entity_Impl___NFunctionalTagsKeyword_1_0_LeftParenthesisKeyword_1_1_RightParenthesisKeyword_1_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('attributes' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=EString '{' (ambiguity) 'relations' '[' relations+=AddRelation
	 *     name=EString '{' (ambiguity) ('relations' '[' ']')? '}' (rule end)
	 */
	protected void emit_AddEntity___AttributesKeyword_5_0_LeftSquareBracketKeyword_5_1_RightSquareBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('relations' '[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     attributes+=Attribute ']' (ambiguity) '}' (rule end)
	 *     name=EString '{' ('attributes' '[' ']')? (ambiguity) '}' (rule end)
	 */
	protected void emit_AddEntity___RelationsKeyword_6_0_LeftSquareBracketKeyword_6_1_RightSquareBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('@functionalTags' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '@nFunctionalTags' '(' nfunctionalTags+=NFunctionalTag_Impl
	 *     (rule start) (ambiguity) ('@nFunctionalTags' '(' ')')? 'entity' name=EString
	 *     (rule start) (ambiguity) ('@nFunctionalTags' '(' ')')? 'importedNamespace' importedNamespace=EString
	 */
	protected void emit_Entity_Impl___FunctionalTagsKeyword_0_0_LeftParenthesisKeyword_0_1_RightParenthesisKeyword_0_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('@nFunctionalTags' '(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('@functionalTags' '(' ')')? (ambiguity) 'entity' name=EString
	 *     (rule start) ('@functionalTags' '(' ')')? (ambiguity) 'importedNamespace' importedNamespace=EString
	 *     functionalTags+=FunctionalTag_Impl ')' (ambiguity) 'entity' name=EString
	 *     functionalTags+=FunctionalTag_Impl ')' (ambiguity) 'importedNamespace' importedNamespace=EString
	 */
	protected void emit_Entity_Impl___NFunctionalTagsKeyword_1_0_LeftParenthesisKeyword_1_1_RightParenthesisKeyword_1_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
