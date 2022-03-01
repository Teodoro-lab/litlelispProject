public class newVisitor extends ExprBaseVisitor<Object> {

    @Override public Object visitProg(ExprParser.ProgContext ctx) {
        System.out.println("aver");return visitChildren(ctx); }

    @Override public Object visitOperation(ExprParser.OperationContext ctx) { return visitChildren(ctx); }

    @Override public Object visitExpr(ExprParser.ExprContext ctx) { return visitChildren(ctx); }

    @Override public Object visitNumberlist(ExprParser.NumberlistContext ctx) { return visitChildren(ctx); }

    @Override public Object visitNumber(ExprParser.NumberContext ctx) { return visitChildren(ctx); }

    @Override public Object visitOperator(ExprParser.OperatorContext ctx) { return visitChildren(ctx); }

    @Override public Object visitEmpty(ExprParser.EmptyContext ctx) { return visitChildren(ctx); }
}
