package com.tridevmc.jorm.clauses;

import javax.annotation.Nonnull;

/**
 * A {@link WhereClause} that wraps two other {@link WhereClause}s and applies a binary operator
 * to them.
 */
public class BinaryWhereClause implements WhereClause {
    private final WhereClause a, b;
    private final BinaryOperator operator;

    protected BinaryWhereClause(@Nonnull WhereClause a, @Nonnull WhereClause b, @Nonnull BinaryOperator operator) {
        super();
        this.a = a;
        this.b = b;
        this.operator = operator;
    }
}
