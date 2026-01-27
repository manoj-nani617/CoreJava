package com.techouts.cj5;

class FinalParent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // void show() {}
}
final class A {
}

// class B extends A {}  error
public class FinalKeyWord {
    public static void main(String[] args) {
//        when we declare a variable using final keyword it becomes constant.
//        Then the value of the variable cannot be changed.
//        When we declare a method with the help of final keyword the method cannot be overridden in child classes.
//        When a class is declared with the help of final keyword then that cannot be extended.
    }
}
