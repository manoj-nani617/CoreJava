package com.techouts.Assessment;
    // This KEYWORD IS USED TO REFERS TO CURRENT OBJECT. THIS KEYWORD IS USED TO INITIALIZE AND ACCESS  THE INSTANCE VARIABLES AND TO CALL
    // INSTANCE METHODS OF THE SAME CLASS.
    // SUPER REFER TO TO PARENT THE OBJECT
    // SUPER IS USED TO CALL SUPER CLASS METHODS
    // SUPER IS USED TO ACCESS SUPER CLASS VARIABLES
    // SUPER IS USED TO CALL SUPER CLASS VARIABLES
public class thisAndSuper {
    int age;
    String name;
    thisAndSuper(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void method()
    {
        System.out.println("This is a normal method");
    }
    public static void main(String[] args) {
        // Overriding Method
        subclassThisAndSuper s = new subclassThisAndSuper();
        s.method();
    }
}
class subclassThisAndSuper extends thisAndSuper {
    subclassThisAndSuper() {
        super(22,"manoj");
    }
    void method() {
        super.method(); // calling super class method
        System.out.println("This Overriding method");
    }
}
