// Generated from /home/jamart/IdeaProjects/ANTLR_TLP_PROYECTO01/src/Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ExprParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ExprParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numberlist}.
	 * @param ctx the parse tree
	 */
	void enterNumberlist(ExprParser.NumberlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numberlist}.
	 * @param ctx the parse tree
	 */
	void exitNumberlist(ExprParser.NumberlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ExprParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ExprParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(ExprParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(ExprParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(ExprParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(ExprParser.EmptyContext ctx);
}