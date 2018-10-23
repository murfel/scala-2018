package ru.hse.spb;// Generated from /Users/murfel/IdeaProjects/AntlrExample/src/main/antlr/Exp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(ExpParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#precedence15}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence15(ExpParser.Precedence15Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#precedence14}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence14(ExpParser.Precedence14Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#precedence10}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence10(ExpParser.Precedence10Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#precedence9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence9(ExpParser.Precedence9Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#precedence6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence6(ExpParser.Precedence6Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#precedence5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecedence5(ExpParser.Precedence5Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpParser#atomExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(ExpParser.AtomExpContext ctx);
}