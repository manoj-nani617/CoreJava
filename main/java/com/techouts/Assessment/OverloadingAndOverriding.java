package com.techouts.Assessment;
class methodOverriding {

    // method Overriding is writing the member function of base class with same name, return type and parameters in derived class is known as method overriding.
    // This is also called as run time polymorphism

    void method()
    {
        System.out.println("This is a normal method");
    }
}
class subclass extends methodOverriding {
    void method() {
        super.method(); // calling super class method
        System.out.println("This Overriding method");
    }
}
public class OverloadingAndOverriding {
  // Creating multiple methods with same name and different signatures is called as Method overloading.
  //It is also known as compile Time Polymorphism.
  int add(int a, int b) {
      return a + b;
  }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingAndOverriding obj = new OverloadingAndOverriding();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(5.5, 4.5));

        // Overriding Method
        subclass s = new subclass();
        s.method();
    }
}
