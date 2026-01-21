package com.techouts.cj8;
@FunctionalInterface
interface Vehicle {
    void drive();
}
public class AnnotationsExample {
//    Annotations are the special notes you added to you java program . They start with @ symbol.
//    They don't change how program run but they give additional information to the compiler and tools.
public static void main(String[] args) {
//    Anonymous class is the local inner class that has no name. It is defined and instantiated in single expression.
//    It is commonly used to implement the interface and extend a class.
     Vehicle v = new Vehicle() {
         @Override                                  // Annotations
         public void drive() {
             System.out.println("This is the anonymous class");
         }
     };


}
}
