package com.techouts.cj5;
interface FourWheelerVehicle {
    public static final int a = 100;
    abstract void tyres();
    abstract void steering();
    abstract void seats();
    static void method() {

    }
    default
     void method2() {}

}
abstract class Owner {
    int numberOfCars;
}
class child extends Owner implements FourWheelerVehicle{
    child() {}
    child(int number) {
        numberOfCars = number;
    }
    public void tyres(){
        System.out.println("This is the car Tyres");
    }
    public void steering() {
        System.out.println("This is the car Steering");

    }
    public void seats () {
        System.out.println("This is the car Seats");

    }

}
public class Interface {

    // Interface is a collection of abstract methods which does not contain body.
    // Interface cannot be instantiated directly.
    // Interface can be instantiated with the child class object.
    //The methods which are declared in the interface must implements all of its child classes
    //Interface cannot contain Constructors
    //Interface can extend another interfaces
    //class can extend a  subclass and can implement multiple interfaces.

    public static void main(String[] args) {
        child ch  = new child(3);
        ch.tyres();
        ch.steering();
        ch.seats();
    }
}
