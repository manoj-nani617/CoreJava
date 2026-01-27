package com.techouts.cj4;
class Animal {
    void function() {
        System.out.println("This is the base class method");
    }
}
class Cat extends Animal {
    void function() {
        System.out.println("This is the cat class");
    }
}
class Dog extends Animal {
    void function() {
        System.out.println("This is the Dog class");
    }
}
public class HierarchicalInheritance {
//    When a multiple classes extending a single class is called as Hierarchical inheritance.
    public static void main(String[] args) {
        Dog d =  new Dog();
        d.function();
        Cat c = new Cat();
        c.function();


    }
}
