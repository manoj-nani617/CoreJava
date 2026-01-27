package com.techouts.cj4;
class Base {
    void function() {
        System.out.println("This is the Base class Methods");
    }
}
class SubClass extends Base {
    void function() {
        System.out.println("This is the single inheritance");
    }
}
public class Inheritance {
//    Acquiring getting properties and functionalities of existing class is called as Inheritance.
    public static void main(String[] args) {
        SubClass sc = new SubClass();
        sc.function();
    }
}
