package com.techouts.cj1;

public class Variables {
    int instanceVariable; // Each object get its own copy of an instance variable
    static int staticVariable; // class level variable shared by all of the objects of the class
    public static void main(String[] args) {
        // ****************** VARIBLES ARE THE IDENTIFIERS THAT REPRESENTS NAMED MEMORY LOCATION USED TO STORE AND RETRIEVE DATA PROGRAM EXECUTION ****************
        // Rules of Declaring the Variables
        // Variables cannot contain spaces
        // Variables cannot contain Special Characters
        // Variables cannot start with digits
        // Variables cannot contain keywords
        int a; // Valid
        // int @ab ;// not Valid
        // int while; // Not valid
        // double store value ; // Not valid
        System.out.println("This is the instance variable and you can access me with the object and each object have different values");
        System.out.println("This is the static variable and you can access me with class Name and changes done in one object it reflects to every object");
    }
    void function()
    {
        int a ; // Local Variable scope : with in the function
        System.out.println("This is the local variable");
    }

}
