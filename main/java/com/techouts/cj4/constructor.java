package com.techouts.cj4;

public class constructor {
    constructor(){
        this(10);
        System.out.println("This is the default Constructor");
    }
    constructor(int a) {
        this(10,20);
        System.out.println("This the parameterized constructor"+a);
    }
    constructor(int a, int b) {
        System.out.println("This is the parameterized constructor"+a+""+b);
    }
    public static void main(String[] args) {
        constructor c = new constructor();
    }
}
