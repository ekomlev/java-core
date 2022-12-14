package com.eduard.patterns.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Adapter pattern
class MovableAdapterImplTest {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }
}