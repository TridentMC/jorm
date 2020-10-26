package com.tridevmc.jorm.clauses;

public class InvertedWhereClause implements WhereClause {
    private final WhereClause wrapped;

    public InvertedWhereClause(WhereClause statement) {
        this.wrapped = statement;
    }
}
