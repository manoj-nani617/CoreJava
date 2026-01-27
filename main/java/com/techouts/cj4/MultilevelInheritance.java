package com.techouts.cj4;
class Employee {
    void function() {
        System.out.println("This is the Employee class");
    }
}
class Person1 extends Employee {
    void function() {
        System.out.println("This is Person1 Employee");
        super.function();
    }
}
class Manoj extends Person1 {
    void function() {
        System.out.println("This is the Manoj class");
        super.function();
    }
}
public class MultilevelInheritance {
//    When a class extending another subclass which is extending another subclass is called is Multilevel Inheritance.

    public static void main(String[] args) {
        Manoj m = new Manoj();
        m.function();
    }
}
