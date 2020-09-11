package com.deepak.ruleengine;

import com.deepak.ruleengine.product.Product;
import com.deepak.ruleengine.rules.Rules;

import java.util.List;

public class OrderProcessing {
    public void process(Product product){
        List<Rules> rules = product.getRules();
        for(Rules rule : rules){
            rule.getRulesAction().action();
        }
    }
}
