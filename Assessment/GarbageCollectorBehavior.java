package com.techouts.Assessment;
//Garbage collection is the process of automatically destroying unused objects to free memory.
class Demo {
    void function() {
        System.out.println("This is a function");
    }
}

public class GarbageCollectorBehavior {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1 = null;  //making objects eligible for garbage collection
        d2 = null;
       System.gc();
    }
}
