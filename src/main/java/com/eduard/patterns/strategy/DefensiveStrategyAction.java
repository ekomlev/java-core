package com.eduard.patterns.strategy;

public class DefensiveStrategyAction implements StrategyAction {

    @Override
    public String actionCommand() {
        var msg = "Defensive strategy. Protect.";
        System.out.println(msg);
        return msg;
    }
}
