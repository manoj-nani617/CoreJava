package com.techouts.Assessment;

import com.sun.security.jgss.GSSUtil;


// ABSTRACT CLASS IS THE CLASS WHICH CONTAIN ABSTRACT METHOD AND NORMAL METHODS. THE METHODS WHICH ARE WRITTEN ABSTRACT THAT MUST BE IMPLEMENTED WITH IN THE CHILD CLASS.
//NORMAL METHODS IN THE ABSTRACT METHOD MUST IMPLEMENT WITH IN THE ABSTRACT CLASS IT IS NOT COMPULSORY TO OVERRIDE WITH IN THE CHILD CLASSES.
// ABSTRACT VARIABLES CANNOT HAVE IN THE JAVA
// VARIABLES MUST HAVE CONCRETE VALUE
abstract class Vehicle {
    int intVar ;
    final int finalIntVar = 10;
    static int staticVar = 30;
    public static final int staticFinalIntVar = 20;
    abstract void wheels();
    abstract void steering();
    abstract void clutch();
    abstract void race();
    void Ac(){
        System.out.println("May Contain Ac or Not");
    }


}

class subClassVehicle extends Vehicle {
    void wheels() {

    }
    void steering() {
        System.out.println("It has Steering");
    }
    void clutch() {
        System.out.println("It has Clutch");
    }
    void race() {
        System.out.println("It has Race");
    }
    void Ac() {

        System.out.println("This is override method");
        super.Ac();
    }
    void print() {
        System.out.println(finalIntVar);
        System.out.println(staticVar);
        System.out.println(staticFinalIntVar);
        System.out.println(intVar);
    }
}
public class abstractClass {
    public static void main(String[] args) {
        subClassVehicle s = new subClassVehicle();
        s.print();
    }
}
