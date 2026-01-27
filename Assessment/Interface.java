package com.techouts.Assessment;

// Interface is a blue Print for the class. In Interface all the methods are by default abstract
// And variables inside the interface are by default public static final and the values of the variables cannot be changed.
// The methods which are declared with in the interface must be implemented with in the child class or make the class as abstract.
//Interface allows multiple Interface and cannot have instance variables
//It cannot have Constructors
//
interface interfaceVehicle {
    void start();   // abstract method
}

class Bike implements interfaceVehicle {
    public void start() {
        System.out.println("Bike starts with kick");
    }
}

class Car implements interfaceVehicle {
    public void start() {
        System.out.println("Car starts with key");
    }
}


public class Interface {
    public static void main(String[] args) {
        interfaceVehicle v;

        v = new Bike();
        v.start();

        v = new Car();
        v.start();
    }
}
