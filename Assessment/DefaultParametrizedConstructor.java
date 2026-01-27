package com.techouts.Assessment;
class Constructor {
    public Constructor() {              //Default Constructor
        this(10,20);          //Calling Parameterized Constructor
        System.out.println("This is a constructor");
    }
    public Constructor(int a, int b){
        //Parameterized Constructor
        System.out.println("This is the Parameterized Constructor");
    }

}
public class DefaultParametrizedConstructor {
    public static void main(String[] args) {
        Constructor c = new Constructor();      //Calls Default Constructor
    }

}
