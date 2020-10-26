package com.tridevmc.jorm.clauses;

import java.util.List;

public interface WhereClause {

    static WhereClause equal(String column, Object value) {
        return new ComparisonWhereClause(column, value, ComparisonOperator.EQUAL);
    }

    static WhereClause notEqual(String column, Object value) {
        return new ComparisonWhereClause(column, value, ComparisonOperator.NOT_EQUAL);
    }

    static WhereClause greaterThan(String column, Object value) {
        return new ComparisonWhereClause(column, value, ComparisonOperator.GREATER_THAN);
    }

    static WhereClause lessThan(String column, Object value) {
        return new ComparisonWhereClause(column, value, ComparisonOperator.LESS_THAN);
    }

    static WhereClause greaterThanOrEqual(String column, Object value) {
        return new ComparisonWhereClause(column, value, ComparisonOperator.GREATER_THAN_OR_EQUAL);
    }

    static WhereClause lessThanOrEqual(String column, Object value) {
        return new ComparisonWhereClause(column, value, ComparisonOperator.LESS_THAN_OR_EQUAL);
    }

    static <T> WhereClause in(String column, List<T> values) {
        return new InWhereClause<T>(column, values);
    }

    static <T extends Comparable<T>> WhereClause between(String column, T a, T b) {
        return new BetweenWhereClause<T>(column, a, b);
    }

    default WhereClause not() {
        return new InvertedWhereClause(this);
    }

    default WhereClause and(WhereClause other) {
        return new BinaryWhereClause(this, other, BinaryOperator.AND);
    }

    default WhereClause or(WhereClause other) {
        return new BinaryWhereClause(this, other, BinaryOperator.OR);
    }
}
