package com.techouts.cj5;
//poly means many the ability to exist many forms is called as polymorphism
//
//There two type of polymorphism
//Compile Time Polymorphism
//This is also called as Method Overloading. Writing a member functions
// with same name,parameter,return type is known as method overriding
//Runtime Polymorphism :
//This is also called as Method Overriding. Writing a member functions of a base class
// with same name,parameter,return type is known as method overriding


 class CompileTimePolymrphism {
    void function() {
        System.out.println("This is a function overloading");
    }
    void function(int a) {
        System.out.println("This is a function overloadings "+a);
    }
    void function(int a, int b) {
        System.out.println("This is a function overloading "+a+" "+b);
    }

}
class RunTimePolymorphism {
     void method() {
         System.out.println("This is a method of run Time Polymorphism");
     }
}
class SubClass extends RunTimePolymorphism {
     @Override
     void method() {     // Writing a member functions of the base class with same name, signatures,return type and parameters is called as method OVerriding
         System.out.println("This is a overriding method");
         super.method(); // Calling super class method
     }
}
public class Polymorphism {
    public static void main(String[] args) {
        CompileTimePolymrphism c = new CompileTimePolymrphism();
        c.function();
        c.function(10);
        c.function(10,20);

//        RunTimePolymorphism

        RunTimePolymorphism r = new RunTimePolymorphism();
        r.method(); //calling child class method
    }
}
