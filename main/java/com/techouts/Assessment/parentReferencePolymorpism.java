package com.techouts.Assessment;
class Animal {
//    When dealing with the parent reference you can access methods which are defined in the parent class . You cannot access child class methods
//    We use parent reference to achieve runtime polymorphism.
    void sound() {
        System.out.println("Animal barks");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat Barks");
    }
    void delete() {
        System.out.println("This is the delete method");
    }
}
public class parentReferencePolymorpism {
    public static void main(String[] args) {
        Animal a ;
        a = new Dog();
        System.out.println(a.getClass());
        a.sound();
        a = new Cat();
        System.out.println(a.getClass());
        a.sound();
//        a.delete();

    }

}
