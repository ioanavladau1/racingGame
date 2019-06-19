package org.fasttrackit;

import java.time.LocalDate;

public class Vehicle {

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fluelLevel;
    private double travelDistance;
    private LocalDate createdDate;

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isRunning() {
        return running;
    }

    public double getFluelLevel() {
        return fluelLevel;
    }

    public double getTravelDistance() {
        return travelDistance;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setFluelLevel(double fluelLevel) {
        this.fluelLevel = fluelLevel;
    }

    public void setTravelDistance(double travelDistance) {
        this.travelDistance = travelDistance;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

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
