package com.techouts.cj5;

import javax.naming.Binding;
class StaticBinding {
    static void method() {
        System.out.println("This is a static Binding");
    }
}
class Subclass1 extends StaticBinding {
    static void method() {
        System.out.println("This is also a static binding");
        System.out.println("this is a next Statement to print");
    }
}
class DynamicBinding {
    void method() {
        System.out.println("This is a instance method");
    }
}
public class StaticAndDynamicBinding {
//    Static Binding
//            It happens when a method is resolved at compile time is known as Static Binding
//    Dynamic Binding
//            It happens when a method resoleved at run time is known as Dynamic Binding

    public static void main(String[] args) {
        Subclass1.method(); // Static Binding
        DynamicBinding d = new DynamicBinding();
        d.method(); // Dynamic Binding

    }
}
