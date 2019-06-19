package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);



        car.setName("Dacia");
        car.setColor("blue");
        car.doorCount = 4;
        car.setMileage(9.5);
        car.setFluelLevel(50);
        car.setRunning(true);



        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);


        Car car1 = new Car(engine);
        car1.setName("Mercedes");
        car1.setColor("black");
        car1.setMaxSpeed(150.5);
        car1.setFluelLevel(30);
        car1.setRunning(false);

        Car car3 = car;

        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println("Changing values...");

        car.setName("Dacia Logan");

        System.out.println(car.getName());
        System.out.println(car3.getName());

        System.out.println(car.getMaxSpeed());
        System.out.println(car.engine);


        double distance = car.accelerate(60, 0.5);
        distance = car.accelerate(60, 0.5);



        System.out.println("Distance in App.main: " + distance);



    }
}
