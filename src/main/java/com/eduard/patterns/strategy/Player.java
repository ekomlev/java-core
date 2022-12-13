package com.eduard.patterns.strategy;

public class Player {
    StrategyAction strategy;
    String type;

    public Player(String type) {
        this.type = type;
    }

    public void setStrategy(StrategyAction strategy) {
        this.strategy = strategy;
    }

    public String action() {
        var msg = "Player: " + this.type;
        return msg + ". " + strategy.actionCommand();
    }
}
