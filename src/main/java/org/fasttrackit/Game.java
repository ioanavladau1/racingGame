package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Track[] tracks = new Track[3];
    private List<Vehicle> competitors = new ArrayList<>();


    public void start() {
        initializeTracks();
        displayTracks();

        int competitorCount = 2;

        for (int i=0; i< competitorCount; i++){
        addcompetitor();}
        displayCompetitors();
    }

    private void addcompetitor() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Test");
        vehicle.setFluelLevel(60);
        vehicle.setMaxSpeed(200);
        vehicle.setMileage(ThreadLocalRandom.current().nextDouble(4.5, 20));

        competitors.add(vehicle);
    }

    private void displayCompetitors() {
        System.out.println("Today's competitors are:");

        for (int i = 0; i < competitors.size(); i++) {
            if (competitors.get(i) != null) {
                System.out.println(competitors.get(i).getName());
            }
        }
    }

    private void initializeTracks() {
        Track city = new Track();
        city.setName("Cluj Track");
        city.setLeght(100);

        tracks[0] = city;

        Track forest = new Track();
        forest.setName("Faget Tracks");
        forest.setLeght(20);

        tracks[1] = forest;
    }

    private void displayTracks() {
        System.out.println("Available tracks:");
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println((i + 1) + ". " + tracks[i].getName());
            }

        }
    }
}

