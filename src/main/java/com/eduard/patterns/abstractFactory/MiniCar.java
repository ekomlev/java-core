package com.eduard.patterns.abstractFactory;

public class MiniCar extends Car {

    MiniCar(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {

    }
}
