package com.eduard.patterns.strategy;

public class AggressiveStrategyAction implements StrategyAction {

    @Override
    public String actionCommand() {
        var msg = "Aggressive strategy. Attack.";
        System.out.println(msg);
        return msg;
    }
}
