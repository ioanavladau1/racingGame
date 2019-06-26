package org.fasttrackit;

public class BatMobile extends Vehicle {

    @Override
    protected String clone() throws CloneNotSupportedException {
        return null;
    }

    @Override
    public double accelerate(double speed, double durationInHours) {

        System.out.println(getName() + " is accelerating with "
                + speed + " km/h for" + durationInHours + " h.");

        double distance = speed * durationInHours * 2;
        System.out.println("Travel" + distance + " km Cheater");


        //travelDistance = travelDistance + distance;
        setTravelDistance(getTravelDistance() + distance);



        //logs
        System.out.println("Total traveled distance: " + getTravelDistance() + " km.");



        return distance;
    }
}
