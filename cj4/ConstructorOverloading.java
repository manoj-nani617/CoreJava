package com.techouts.cj4;

public class ConstructorOverloading {
//    Defining multiple constructors with same name and different parameters is called as constructor overloading.
    ConstructorOverloading() {
        System.out.println("This is the default constructor");
    }
    ConstructorOverloading(int a) {
        System.out.println("This is the parameterized constructor with one argument");
    }
    ConstructorOverloading(int a, int b) {
        System.out.println("This is the parametrized constructor with two arguments");
    }
    ConstructorOverloading(int a, int b, int c) {
        System.out.println("This is the parameterized constructor with three arguments");
    }
public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading();
        ConstructorOverloading co1 = new ConstructorOverloading(10);
        ConstructorOverloading co2 = new ConstructorOverloading(10,20);
        ConstructorOverloading co3 = new ConstructorOverloading(10,20,30);



}
}
