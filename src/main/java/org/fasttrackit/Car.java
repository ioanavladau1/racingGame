package org.fasttrackit;

import java.time.LocalDate;

// inheritance or "is-a" relashionship
public class Car extends AutoVehicle {

    int doorCount;

//    public Car(Engine engine) {
//        super(engine);
//    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}