package com.eduard.patterns.abstractFactory;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//Abstract pattern
class CarFactoryTest {

    @Test
    void  shouldCreateMicroCar() {
        System.out.println(CarFactory.buildCar(CarType.MINI));

        var actualCar = CarFactory.buildCar(CarType.MICRO);

        assertThat(actualCar.location, equalTo(Location.INDIA));
        assertThat(actualCar.getModel(), equalTo(CarType.MICRO));
    }

    @Test
    void  shouldCreateMiniCar() {
        var actualCar = CarFactory.buildCar(CarType.MINI);

        assertThat(actualCar.location, equalTo(Location.INDIA));
        assertThat(actualCar.getModel(), equalTo(CarType.MINI));
    }
}
