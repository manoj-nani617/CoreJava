package com.techouts.cj4;

public class ConstructorChaining {
    ConstructorChaining() {
        this(10);
        System.out.println("This is the default constructor");

    }
    ConstructorChaining(int a) {
        this(10,20);
        System.out.println("This is the parameterized Constructor with one argument");        //Constructor Chaining
    }
    ConstructorChaining(int a, int b) {
        this(10,20,30);
        System.out.println("This is the parameterized Constructor with one argument");
    }
    ConstructorChaining(int a, int b, int c) {
        System.out.println("This is the parameterized Constructor with one argument");
    }

    public static void main(String[] args) {
        ConstructorChaining ch = new ConstructorChaining();
    }
}
