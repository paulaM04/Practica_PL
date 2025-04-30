// Generated from /Users/paulamarcelabarrosorobleda/Documents/PL/practicaObligatoriaMarzo/src/grupo8.g4 by ANTLR 4.13.2

    import java.io.PrintStream;
    import java.io.FileNotFoundException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grupo8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grupo8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(grupo8Parser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(grupo8Parser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(grupo8Parser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(grupo8Parser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#sentlistPrima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistPrima(grupo8Parser.SentlistPrimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(grupo8Parser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(grupo8Parser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(grupo8Parser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#ctelistPrima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelistPrima(grupo8Parser.CtelistPrimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(grupo8Parser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(grupo8Parser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(grupo8Parser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#defvarlistPrima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlistPrima(grupo8Parser.DefvarlistPrimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(grupo8Parser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#varlistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlistAux(grupo8Parser.VarlistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(grupo8Parser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(grupo8Parser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(grupo8Parser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(grupo8Parser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#formal_paramAux1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramAux1(grupo8Parser.Formal_paramAux1Context ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#formal_paramAux2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramAux2(grupo8Parser.Formal_paramAux2Context ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(grupo8Parser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#sentAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentAux(grupo8Parser.SentAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(grupo8Parser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(grupo8Parser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(grupo8Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#expPrima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpPrima(grupo8Parser.ExpPrimaContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(grupo8Parser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(grupo8Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#subparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubparamlist(grupo8Parser.SubparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(grupo8Parser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#explistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplistAux(grupo8Parser.ExplistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link grupo8Parser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(grupo8Parser.Proc_callContext ctx);
}