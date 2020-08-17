package sqlparse;

import sqlparse.SQLiteParser.*;

import java.util.LinkedList;
import java.util.List;

public class BaseSqlVisitor extends SQLiteBaseVisitor<Object> {

    @Override
    public Object visitSql_stmt(Sql_stmtContext ctx) {
        if (ctx.factored_select_stmt() != null && ctx.factored_select_stmt().select_core().size() > 0) {
            List<SQLiteParser.Select_coreContext> x = ctx.factored_select_stmt().select_core();
            System.out.println(x);
            return visitSelect_core(ctx.factored_select_stmt().select_core(0));
        }
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Object visitSelect_core(Select_coreContext ctx) {
        Object result;
        String tableName = null;
        List<WhereExpr> whereExprs = null;

        if (ctx.K_FROM() != null) {
            if (ctx.table_or_subquery().size() > 0) {
                List<Table_or_subqueryContext> table_or_subqueryContexts = ctx.table_or_subquery();
                System.out.println(table_or_subqueryContexts);
                tableName = (String) visitTable_or_subquery(ctx.table_or_subquery(0));
            }
        }
        if (ctx.K_WHERE() != null) {
            if (ctx.expr().size() > 0) {
                whereExprs = (List<WhereExpr>) visitExpr(ctx.expr(0));
            }
        }
        result = new SelectStmt(tableName, whereExprs);
        return result;
    }

    @Override
    public Object visitAny_name(Any_nameContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            return ctx.IDENTIFIER().getText();
        }
        return null;
    }


    @Override
    public Object visitColumn_name(Column_nameContext ctx) {
        if (ctx.any_name() != null) {
            return visitAny_name(ctx.any_name());
        }
        return null;
    }
//
//    @Override
//    public Object visitFactored_select_stmt(Factored_select_stmtContext ctx) {
//
//    }
//
//    @Override
//    public Object visitResult_column(Result_columnContext ctx) {
//
//    }
//
    @Override
    public Object visitTable_name(Table_nameContext ctx) {
        if (ctx.any_name() != null) {
            return visitAny_name(ctx.any_name());
        }
        return null;
    }

    @Override
    public Object visitTable_or_subquery(Table_or_subqueryContext ctx) {
        if (ctx.table_name() != null) {
            return visitTable_name(ctx.table_name());
        }
        return null;
    }

    //
    @Override
    public Object visitExpr(ExprContext ctx) {

        if (ctx.K_AND() != null) {
            Object left = visitExpr(ctx.expr(0));
            Object right = visitExpr(ctx.expr(1));
            List<WhereExpr> list = new LinkedList<>();
            addWhereExpr(list, left);
            addWhereExpr(list, right);
            return list;
        } else if (ctx.ASSIGN() != null) {
            String left = (String) visitExpr(ctx.expr(0));
            String right = (String) visitExpr(ctx.expr(1));
            return new WhereExpr(left, "=", right);
        }else if (ctx.literal_value() != null) {
            return visitLiteral_value(ctx.literal_value());
        }else if (ctx.column_name() != null) {
            return visitColumn_name(ctx.column_name());
        }else if(ctx.GT() != null) {
            String left = (String) visitExpr(ctx.expr(0));
            Object right = visitExpr(ctx.expr(1));
            return new WhereExpr(left, ">", right);
        }
        return null;
    }

    //
    @Override
    public Object visitLiteral_value(Literal_valueContext ctx) {
        if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText();
        }else if (ctx.NUMERIC_LITERAL() != null) {
            return ctx.NUMERIC_LITERAL().getText();
        }
        return null;
    }
//
    @SuppressWarnings("unchecked")
    private void addWhereExpr(List<WhereExpr> list, Object obj) {
        if (obj instanceof WhereExpr) {
            list.add((WhereExpr) obj);
        } else if (obj instanceof List) {
            list.addAll((List<WhereExpr>) obj);
        }
    }
}
