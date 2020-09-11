package com.deepak.ruleengine.rules;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public enum Rules {
    GENERATE_PACKING_SLIP_FOR_SHIPPING("generate packing slip for shipping", ()-> System.out.println("packing slip generated")),
    GENERATE_COMMISSION_PAYMENT_FOR_AGENT("generate commission payment for agent" , () -> System.out.println("commission payment generated")),
    SEND_EMAIL("send email", () -> System.out.println("email send")),
    CREATE_DUPLICATE_SLIP_FOR_ROYALITY("create duplicate slip for royality", () -> System.out.println("duplicate slip for royality generated")),
    ATTACH_FREE_VIDEO("attach free video", () -> System.out.println("free video attached")),
    ACTIVATE_MEMBERSHIP("activate membership", ()-> System.out.println("member ship activated")),
    UPGRADE_MEMBERSHIP("upgrade member ship", () -> System.out.println("member ship upgraded"))
    ;


    private String description;
    private RulesAction rulesAction;

    Rules(String description, RulesAction rulesAction) {
        this.description = description;
        this.rulesAction = rulesAction;
    }

    public String getDescription() {
        return description;
    }

    public RulesAction getRulesAction() {
        return rulesAction;
    }

}
