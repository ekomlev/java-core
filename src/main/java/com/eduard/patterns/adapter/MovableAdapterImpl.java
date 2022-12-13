package com.eduard.patterns.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    @Override
    public double getSpeed() {
        return convertMphToKmph(luxuryCars.getSpeed());
    }

    private double convertMphToKmph(double mph) {
        return mph * 1.60934;
    }
}
