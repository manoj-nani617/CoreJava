package com.techouts.cj4;

public class ParameterizedConstructor {
    int a,b;
//    Constructor with parameters is called as Parameterized Constructor.
    ParameterizedConstructor(int a, int b) {
        this.a = a;
        this.b =b;
        System.out.println("This is the parameterized constructor "+a+" value "+b );
    }
    public static void main(String[] args) {
        ParameterizedConstructor pc = new ParameterizedConstructor(10,30);

    }
}
