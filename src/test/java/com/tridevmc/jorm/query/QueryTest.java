package com.tridevmc.jorm.query;

public class QueryTest {
    public void testThatQueryBuilderWorks() {
        Query q = new Query().where().equals("a", "b").and().equals("b", "c").or().where().equals("a", "c");
    }
}
