package com.tridevmc.jorm.clauses;

import java.util.List;

public class InWhereClause<T> implements WhereClause {
    private final String column;
    private final List<T> values;

    public InWhereClause(String column, List<T> values) {
        this.column = column;
        this.values = values;
    }
}
