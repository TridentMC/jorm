package com.tridevmc.jorm.clauses;

public class ComparisonWhereClause implements WhereClause {
    private final String column;
    private final Object value;
    private final ComparisonOperator operator;

    public ComparisonWhereClause(String column, Object value, ComparisonOperator operator) {
        this.column = column;
        this.value = value;
        this.operator = operator;
    }
}
