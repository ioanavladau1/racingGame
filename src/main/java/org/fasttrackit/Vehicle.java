package org.fasttrackit;

import java.time.LocalDate;
import java.util.Objects;

public class Vehicle {

    public static int totalCount;

    private String name;
    private double mileage;
    private String color;
    private double maxSpeed;
    private boolean running;
    private double fluelLevel;
    private double travelDistance;
    private LocalDate createdDate;

    public Vehicle() {
        totalCount++;
    }

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

    public static int getTotalCount() {
        return totalCount;
    }


    public double accelerate(double speed, double durationInHours) {
        if (fluelLevel <= 0){
            System.out.println("You don't have enough fluel to accelerate. " + "Fluel level: " + fluelLevel);
            return 0;
        }

        if (speed > maxSpeed) {
            System.out.println(" Requested speed is too high. Maximum speed allowed " + maxSpeed);
            return 0;
        }

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


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public double accelerate(double speed){
        return accelerate(speed,1);}

        //Method signature must be the same, except:
    // 1.co-variant return type
// (returned olbject must inherit what the overridden method was returning)
    // 2. Overridden method ca allow larger acces than was allowed in the super-class.

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
        return new Vehicle();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", running=" + running +
                ", fluelLevel=" + fluelLevel +
                ", travelDistance=" + travelDistance +
                ", createdDate=" + createdDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.mileage, mileage) == 0 &&
                Double.compare(vehicle.maxSpeed, maxSpeed) == 0 &&
                running == vehicle.running &&
                Double.compare(vehicle.fluelLevel, fluelLevel) == 0 &&
                Double.compare(vehicle.travelDistance, travelDistance) == 0 &&
                Objects.equals(name, vehicle.name) &&
                Objects.equals(color, vehicle.color) &&
                Objects.equals(createdDate, vehicle.createdDate);
    }
}


