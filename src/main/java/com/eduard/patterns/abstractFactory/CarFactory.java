package com.eduard.patterns.abstractFactory;

/**
https://www.geeksforgeeks.org/abstract-factory-pattern/
 */
public class CarFactory {

    private CarFactory() {
    }

    public static Car buildCar(CarType type) {
        Car car;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location
        Location location = Location.INDIA;

        switch(location) {
            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;
            case USA:
            default:
                car = UsaCarFactory.buildCar(type);
                break;
        }

        return car;
    }
}
