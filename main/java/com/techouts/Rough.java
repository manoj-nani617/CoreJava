package com.techouts;

class Engine {
    void method() {
        System.out.println("Engine Started");
    }
}
class Bike {
    void mehtod() {
        System.out.println("This is a Bike");
    }
}
class B{
    B() {
        System.out.println("This is the B constructor");
    }
    void method() {
        System.out.println("This is the B class method");
    }
}
class Car {
    B classb;                                       //Association
    Engine e ;
    Bike b;
    Car(Bike b) {                                   // Aggregation Car is not controlling Bike both are independent objects
        e = new Engine();                    // Car is controlling Engine when car is destroyed engine also destroyed both depending one another
        this.b = b;
    }
    void drive() {
        e.method();
        System.out.println("You can drive()");
    }
}

public class Rough {
    public static void main(String[] args) {
        Bike b = new Bike();
        Car c = new Car(b);
        c.drive();



    }
}