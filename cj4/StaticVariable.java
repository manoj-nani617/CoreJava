package com.techouts.cj4;
class CheckingStaticVariable {
    void function() {
        StaticVariable.a = 10;
    }
}
public class StaticVariable {
//    static variable is the variable belong to the class, not to any specific object.
//    Only one copy of the static variable is created, that shares among the all objects.
    static int a = 0;

    public static void main(String[] args) {

        System.out.println(a);
        CheckingStaticVariable cs = new CheckingStaticVariable();
        cs.function();
        System.out.println(a);
    }
}

