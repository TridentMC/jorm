package com.tridevmc.jorm.clauses;

public class BetweenWhereClause<T extends Comparable<T>> implements WhereClause {
    private final String column;
    private final T a;
    private final T b;

    public BetweenWhereClause(String column, T a, T b) {
        this.column = column;
        this.a = a;
        this.b = b;
    }
}
