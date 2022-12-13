package com.eduard.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Decorator pattern
class ChristmasTreeTest {

    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess_test1() {
        ChristmasTree garland = new Garland(new ChristmasTreeImpl());
        assertEquals(garland.decorate(), "Christmas tree with Garland");
    }

    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess_test2() {
        ChristmasTree bubbleLights = new BubbleLights(new ChristmasTreeImpl());
        assertEquals(bubbleLights.decorate(), "Christmas tree with Bubble Lights");
    }

    @Test
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess_test3() {
        ChristmasTree multiDecor = new BubbleLights( new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(multiDecor.decorate(), "Christmas tree with Garland with Garland with Bubble Lights");
    }
}