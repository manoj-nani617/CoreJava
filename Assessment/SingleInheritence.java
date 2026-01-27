package com.techouts.Assessment;
class Base {
    String Name;
    Base() {} ///Default Constructor If Super is also not used in Child then you wont get error other wise we get an error
    Base(String Name) {
        this.Name = Name;
        System.out.println("This is a Base Class Constructor");
    }
}
class child1 extends Base {
    String Name;
    child1(String Name) {
        super("manoj");  //Calling Parent constructor if not then default constructor called which is created in Base
        this.Name = Name;
        System.out.println("This is a child Class Constructor");

    }
}
public class SingleInheritence {
    public static void main(String[] args) {
       child1 c = new child1("manoj");
    }
}
