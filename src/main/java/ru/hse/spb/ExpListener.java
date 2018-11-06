package ru.hse.spb;// Generated from /Users/murfel/scala-2018/src/main/antlr/Exp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpParser}.
 */
public interface ExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(ExpParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(ExpParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#precedence15}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence15(ExpParser.Precedence15Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#precedence15}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence15(ExpParser.Precedence15Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#precedence14}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence14(ExpParser.Precedence14Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#precedence14}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence14(ExpParser.Precedence14Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#precedence10}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence10(ExpParser.Precedence10Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#precedence10}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence10(ExpParser.Precedence10Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#precedence9}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence9(ExpParser.Precedence9Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#precedence9}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence9(ExpParser.Precedence9Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#precedence6}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence6(ExpParser.Precedence6Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#precedence6}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence6(ExpParser.Precedence6Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#precedence5}.
	 * @param ctx the parse tree
	 */
	void enterPrecedence5(ExpParser.Precedence5Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#precedence5}.
	 * @param ctx the parse tree
	 */
	void exitPrecedence5(ExpParser.Precedence5Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(ExpParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(ExpParser.AtomExpContext ctx);
}