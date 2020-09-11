package com.deepak.ruleengine.product;

import com.deepak.ruleengine.rules.Rules;

public class Book extends PhysicalProduct {
    private final String authorName;

    public Book(String name, String description, String authorName){
        super(name, description);
        this.authorName = authorName;
        rules.add(Rules.CREATE_DUPLICATE_SLIP_FOR_ROYALITY);
    }
}
