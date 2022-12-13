package com.eduard.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Strategy pattern
class PlayerTest {

    @Test
    void shouldCreateStriker_aggressiveStrategy() {
        Player striker = new Player("Striker");
        striker.setStrategy(new AggressiveStrategyAction());

        var actualAction = striker.action();

        assertEquals(actualAction, "Player: Striker. Aggressive strategy. Attack.");
    }

    @Test
    void shouldCreateDefender_defensiveStrategy() {
        Player defender = new Player("Defender");

        defender.setStrategy(new DefensiveStrategyAction());

        var actualAction = defender.action();

        assertEquals(actualAction, "Player: Defender. Defensive strategy. Protect.");
    }

    @Test
    void shouldCreateStriker_defensiveStrategy() {
        Player defender = new Player("Striker");

        defender.setStrategy(new DefensiveStrategyAction());

        var actualAction = defender.action();

        assertEquals(actualAction, "Player: Striker. Defensive strategy. Protect.");
    }

}