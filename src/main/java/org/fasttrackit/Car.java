package org.fasttrackit;

import java.time.LocalDate;

// inheritance or "is-a" relashionship
public class Car extends AutoVehicle {

    int doorCount;

    public Car(Engine engine, int doorCount) {
        super(engine);
    }
}