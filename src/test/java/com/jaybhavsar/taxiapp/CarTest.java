package com.jaybhavsar.taxiapp;

import com.jaybhavsar.taxiapp.model.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    void TestCarObjectCreation() {
        Car car = new Car("jay", "bmw");

        assertEquals("jay", car.getOwnerName());
        assertEquals("bmw", car.getCompanyName());
    }

    @Test
    void getCompanyName() {
        Car car = new Car("jay", "skoda");

        assertEquals("skoda", car.getCompanyName());
    }
}
