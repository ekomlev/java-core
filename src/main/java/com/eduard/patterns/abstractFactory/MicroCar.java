package com.eduard.patterns.abstractFactory;

public class MicroCar extends Car {

    MicroCar(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {

    }
}
