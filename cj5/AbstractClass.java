package com.techouts.cj5;
abstract class Vehicle {
    int a;
    abstract void engine();
    abstract void steering();
    abstract void tyres();
    void ac() {
        System.out.println("Optional");
    }
}
class Car extends Vehicle {
    void engine() {
        System.out.println("Car Engine");
    }
    void steering() {
        System.out.println("Car Steering");
    }
    void tyres() {
        System.out.println("Car Tyres");

    }
    void ac() {
        System.out.println("Ac is Optional");
    }

}
public class AbstractClass {
//    Abstract key word used to declare abstract Class .
//    In Abstract class contain abstract methods and normal methods.
//    The abstract methods must implement in child classes.
//    The normal methods must be defined in abstract class.
//    Abstract class can contain any access Specifier (i.e we can include which specifier we want).
//    Abstract class cannot be instantiated directly.
//    Abstract class can be instantiated with the child class.

    public static void main(String[] args) {
        Car c = new Car();
        c.steering();
        c.engine();
        c.tyres();
        c.ac();

    }

}
