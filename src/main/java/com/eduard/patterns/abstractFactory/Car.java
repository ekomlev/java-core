package com.eduard.patterns.abstractFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Car {
    CarType model;
    Location location;

    Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    @Override
    public String toString() {
        return "CarModel - " +model + " located in "+location;
    }
}
