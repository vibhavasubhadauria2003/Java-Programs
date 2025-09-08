// 7 Transportation System
// Problem Statement: Create an abstract class Transport with methods start() and stop().
// Implement subclasses Car, Bike, and Bus that provide specific implementations for these
// methods. Write a program to demonstrate the functionality of different transportation
// modes.

abstract class Transport {

    abstract void start();
    abstract void stop();
}


class Car extends Transport {
    @Override
    void start() {
        System.out.println("Car is starting with a key ignition...");
    }

    @Override
    void stop() {
        System.out.println("Car has stopped with brake and key off.");
    }
}

class Bike extends Transport {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick or self-start...");
    }

    @Override
    void stop() {
        System.out.println("Bike has stopped with disc brakes.");
    }
}


class Bus extends Transport {
    @Override
    void start() {
        System.out.println("Bus is starting with a heavy-duty engine...");
    }

    @Override
    void stop() {
        System.out.println("Bus has stopped at the station.");
    }
}


public class Q7 {
    public static void main(String[] args) {
        // Create objects of different transport modes
        Transport car = new Car();
        Transport bike = new Bike();
        Transport bus = new Bus();

        // Demonstrate functionality
        System.out.println("Car Demo ");
        car.start();
        car.stop();

        System.out.println("Bike Demo");
        bike.start();
        bike.stop();

        System.out.println("Bus Demo ");
        bus.start();
        bus.stop();
    }
}
