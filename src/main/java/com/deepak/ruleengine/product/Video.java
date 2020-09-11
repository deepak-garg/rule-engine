package com.deepak.ruleengine.product;

import com.deepak.ruleengine.rules.Rules;

import java.util.LinkedList;
import java.util.List;

public class Video extends Product{
    public Video(String name, String description) {
        super(name, description);
        rules.add(Rules.ATTACH_FREE_VIDEO);
    }

}
