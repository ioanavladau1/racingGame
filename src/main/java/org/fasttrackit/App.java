package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
 public static void main( String[] args ) throws Exception {
    Game game= new Game();
    game.start();


  //  //String pool
  //  String a = "test";
  //  String b =  "test";
  //  String c = new String("test");

  //  System.out.println(a ==b);
  //  System.out.println(a==c);
  //  System.out.println(a.equals(c));

    Vehicle vehicle1=new Vehicle();
    vehicle1.setName("Dacia");

    Vehicle vehicle2= new Vehicle();
    vehicle2.setName("Dacia");

     System.out.println(vehicle2.equals(vehicle1));




//
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//
//        Car car = new Car(engine);
//
//
//
//        car.setName("Dacia");
//        car.setColor("blue");
//        car.doorCount = 4;
//        car.setMileage(9.5);
//        car.setFluelLevel(50);
//        car.setRunning(true);
//
//
//
//        System.out.println("Our engine...");
//        System.out.println(car.engine.manufacturer);
//
//
//        Car car1 = new Car(engine);
//        car1.setName("Mercedes");
//        car1.setColor("black");
//        car1.setMaxSpeed(150.5);
//        car1.setFluelLevel(30);
//        car1.setRunning(false);
//
//        Car car3 = car;
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println("Changing values...");
//
//        car.setName("Dacia Logan");
//
//        System.out.println(car.getName());
//        System.out.println(car3.getName());
//
//        System.out.println(car.getMaxSpeed());
//        System.out.println(car.engine);
//
//
//        double distance = car.accelerate(60, 0.5);
//        distance = car.accelerate(60, 0.5);
//
//
//
//        System.out.println("Distance in App.main: " + distance);
//
//        // demo for static variables (class variables)
//        System.out.println("Studying static variables...");
//
//        car.totalCount = 1;
//
//        System.out.println("Total count for car: " + car.totalCount);
//
//        car1.totalCount = 2;
//
//        System.out.println("Total count from car after setting car1:" + car.totalCount);
//                System.out.println("Total count for car1: " + car1.totalCount);
//        System.out.println( "Total count from Vehicle class: " + Vehicle.totalCount);
//
//
//        car1.accelerate(100);
//
//        new AutoVehicle(engine);
//
//        System.out.println("Today...");
//
//        System.out.println(car.toString());
//
//
//        BatMobile batMobile = new BatMobile();
//        batMobile.setName("Cheating vehicle");
//        batMobile.accelerate(60,1);
//        car.accelerate(60,1);
//
//     //polymorphism
//    Vehicle mobile = new BatMobile();
//    // method implementation invoked from object's class,
//    // not from the class of the variable
//    mobile.accelerate(30,2);
//
//    //variable type determines what methods
//    // we can invoke for the stored object
//    Vehicle testCar = new Car();
//    //type casting
//    ((Car)testCar).getDoorCount();
//
//    Car castedCar = (Car) testCar;
//    castedCar.getDoorCount();


    }
}
