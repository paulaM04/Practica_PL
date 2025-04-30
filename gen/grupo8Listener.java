// Generated from /Users/paulamarcelabarrosorobleda/Documents/PL/practicaObligatoriaMarzo/src/grupo8.g4 by ANTLR 4.13.2

    import java.io.PrintStream;
    import java.io.FileNotFoundException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grupo8Parser}.
 */
public interface grupo8Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(grupo8Parser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(grupo8Parser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(grupo8Parser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(grupo8Parser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(grupo8Parser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(grupo8Parser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(grupo8Parser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(grupo8Parser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#sentlistPrima}.
	 * @param ctx the parse tree
	 */
	void enterSentlistPrima(grupo8Parser.SentlistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#sentlistPrima}.
	 * @param ctx the parse tree
	 */
	void exitSentlistPrima(grupo8Parser.SentlistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(grupo8Parser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(grupo8Parser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(grupo8Parser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(grupo8Parser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(grupo8Parser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(grupo8Parser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#ctelistPrima}.
	 * @param ctx the parse tree
	 */
	void enterCtelistPrima(grupo8Parser.CtelistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#ctelistPrima}.
	 * @param ctx the parse tree
	 */
	void exitCtelistPrima(grupo8Parser.CtelistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(grupo8Parser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(grupo8Parser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(grupo8Parser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(grupo8Parser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(grupo8Parser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(grupo8Parser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#defvarlistPrima}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlistPrima(grupo8Parser.DefvarlistPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#defvarlistPrima}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlistPrima(grupo8Parser.DefvarlistPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(grupo8Parser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(grupo8Parser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#varlistAux}.
	 * @param ctx the parse tree
	 */
	void enterVarlistAux(grupo8Parser.VarlistAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#varlistAux}.
	 * @param ctx the parse tree
	 */
	void exitVarlistAux(grupo8Parser.VarlistAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(grupo8Parser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(grupo8Parser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(grupo8Parser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(grupo8Parser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(grupo8Parser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(grupo8Parser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(grupo8Parser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(grupo8Parser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#formal_paramAux1}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramAux1(grupo8Parser.Formal_paramAux1Context ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#formal_paramAux1}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramAux1(grupo8Parser.Formal_paramAux1Context ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#formal_paramAux2}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramAux2(grupo8Parser.Formal_paramAux2Context ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#formal_paramAux2}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramAux2(grupo8Parser.Formal_paramAux2Context ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(grupo8Parser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(grupo8Parser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#sentAux}.
	 * @param ctx the parse tree
	 */
	void enterSentAux(grupo8Parser.SentAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#sentAux}.
	 * @param ctx the parse tree
	 */
	void exitSentAux(grupo8Parser.SentAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(grupo8Parser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(grupo8Parser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(grupo8Parser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(grupo8Parser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(grupo8Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(grupo8Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#expPrima}.
	 * @param ctx the parse tree
	 */
	void enterExpPrima(grupo8Parser.ExpPrimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#expPrima}.
	 * @param ctx the parse tree
	 */
	void exitExpPrima(grupo8Parser.ExpPrimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(grupo8Parser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(grupo8Parser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(grupo8Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(grupo8Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubparamlist(grupo8Parser.SubparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#subparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubparamlist(grupo8Parser.SubparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(grupo8Parser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(grupo8Parser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#explistAux}.
	 * @param ctx the parse tree
	 */
	void enterExplistAux(grupo8Parser.ExplistAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#explistAux}.
	 * @param ctx the parse tree
	 */
	void exitExplistAux(grupo8Parser.ExplistAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link grupo8Parser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(grupo8Parser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link grupo8Parser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(grupo8Parser.Proc_callContext ctx);
}