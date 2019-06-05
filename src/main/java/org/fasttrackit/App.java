package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "blue";
        car.doorCount = 4;
        car.mileage = 9.5;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        car.engine = engine;

        System.out.println("Our engine...");
        System.out.println(car.engine.manufacturer);


        Car car1 = new Car();
        car1.name = "Mercedes";
        car1.color = "black";
        car1.maxSpeed = 150.5;
        car1.running = false;

        Car car3 = car;

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println("Changing values...");

        car.name = "Dacia Logan";

        System.out.println(car.name);
        System.out.println(car3.name);

        System.out.println(car.maxSpeed);
        System.out.println(car.engine);
    }
}
