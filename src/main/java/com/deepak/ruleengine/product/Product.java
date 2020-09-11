package com.deepak.ruleengine.product;

import com.deepak.ruleengine.rules.Rules;

import java.util.LinkedList;
import java.util.List;

public abstract class Product {
    private final String name;
    private final String description;
    List<Rules> rules = new LinkedList<>();
    Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public List<Rules> getRules() {
        return rules;
    }
}
