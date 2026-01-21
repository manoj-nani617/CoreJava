package com.techouts.cj8;
@java.lang.FunctionalInterface
interface Parent {
    void heLoveFamily();
}

class child implements Parent {
    public void heLoveFamily() {
        System.out.println("This is the traditional way to implement functional interfaces");
    }
}
public class FunctionalInterface {
    //    Functional Interface is the interface which contain only one abstract method is called as functional interface.
    //    They can be be implemented by using anonymous class, lambda expression and traditional way

    public static void main(String[] args) {
        Parent p =new Parent() {
//      Anonymous class is the local inner class that has no name. It is defined and instantiated in single expression.
//      It is commonly used to implement interface and extend class
            @Override
            public void heLoveFamily() {
                System.out.println("He Loves the family");
            }
        };
        p.heLoveFamily();

//        Lambda Expression is the block of the code which takes in parameters and returns a values.
//        Lambda Expression looks similar to methods, but they don't nee a method  name and they can be written right inside a method body.
        Parent p1 = () -> System.out.println("The method is implemented using Lambda Expression");
        p1.heLoveFamily();

        child c = new child();
        c.heLoveFamily();

    }


}
