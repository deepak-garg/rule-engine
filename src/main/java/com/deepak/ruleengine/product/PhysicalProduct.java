package com.deepak.ruleengine.product;

import com.deepak.ruleengine.rules.Rules;

import java.util.LinkedList;
import java.util.List;

public abstract class PhysicalProduct extends Product{
    public PhysicalProduct(String name, String description) {
        super(name, description);
        rules.add(Rules.GENERATE_PACKING_SLIP_FOR_SHIPPING);
        rules.add(Rules.GENERATE_COMMISSION_PAYMENT_FOR_AGENT);
    }
}
