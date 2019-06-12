package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    String name;
    double mileage;
    String color;
    double maxSpeed;
    boolean running;
    double fluelLevel;
    double travelDistance;
    LocalDate createdDate;

    public double accelerate(double speed, double durationInHours) {
        //concatenation
        System.out.println(name + " is accelerating with " + speed + " km/h for" + durationInHours + " h.");

        double distance = speed * durationInHours;
        System.out.println("Travel" + distance + " km");


        //travelDistance = travelDistance + distance;
        travelDistance += distance;

        //logs
        System.out.println("Total traveled distance: " + travelDistance + " km.");

        double spentFuel = distance / 100 * mileage;
        System.out.println("Spent fuel: " + spentFuel + " l.");

        //fluelLevel = fluelLevel - spentFuel;
        fluelLevel-= spentFuel;
        System.out.println("Remaining fuel: " + fluelLevel + " 1");






        return distance;
    }

}
