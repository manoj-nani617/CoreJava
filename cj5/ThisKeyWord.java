package com.techouts.cj5;

import com.sun.security.jgss.GSSUtil;

class Parent {
    int a,b;
    Parent() {
        this(10,20);
    };
    Parent(int a ,int b) {
        this.a = a;
        this.b = b;
    }

    void function() {
        System.out.println("This is Parent Clas Method");

    }
    void display() {
        this.function();
    }

}
public class ThisKeyWord {
//    This is keyword is used to refer its current class object.
//    This keyword is used initialize the instance variables and used to call current class methods and constructors
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();

    }
}
