package com.techouts.Assessment;
class Student {
     String Name;
     static String clg;                // Static Variable
     static void staticMethod() {
         Student s = new Student(); /// creating object to call the instance method
         s.instanceMethod();
         System.out.println("This is the Static Method");
     }
     void instanceMethod() {
         System.out.println(clg);
         System.out.println("This is a the Instance method");
     }

}

public class staticVariablesAndMethods {
    public static void main(String[] args) {
        //  Static Variables are the class level variables used common data for all objects
        // static variables are accessed with the class Name.
        // Same Value reflects on the every Object of the Class.
        Student s = new Student();
        s.Name = "manoj"; // Instance Variable
        Student.clg = "Sri Chaithanya Engineering College";
        s.instanceMethod();


        //Static method are belongs to the class and can be called without the object
        //Instance variables and methods cannot be directly accessed with in the static method .
        //static methods can be directly called with in the static methods.
        //static variables can be directly called with in the static methods;

        Student.staticMethod();


    }
}
