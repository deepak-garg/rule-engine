package com.deepak.ruleengine.product;

import com.deepak.ruleengine.rules.Rules;

import java.util.LinkedList;
import java.util.List;

public class Membership extends Product {
    public Membership(String name, String description) {
        super(name, description);
        rules.add(Rules.ACTIVATE_MEMBERSHIP);
        rules.add(Rules.UPGRADE_MEMBERSHIP);
    }
}
