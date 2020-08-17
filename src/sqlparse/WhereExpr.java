package sqlparse;

/**
 * 保存where条件的概要信息
 */
public class WhereExpr{
    public String columnName = null;
    public String op = "=";
    public Object value = null;

    public WhereExpr(String columnName, String op, Object value){
        this.columnName = columnName;
        this.op = op;
        this.value = value;
    }
}