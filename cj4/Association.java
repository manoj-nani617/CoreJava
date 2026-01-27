package com.techouts.cj4;
class A {
    int age;
    A(int age) {
        this.age = age;
    }
}
class B  {
    int age;
    A a; // It is Aggregation
    B(int age) {
        this.age = age;
    }
}

public class Association {
    public static void main(String[] args) {
        A a = new A(20);
        B b = new B(30);
    }
}
