package com.techouts.cj8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceExample {
    MethodReferenceExample(int i) {
        System.out.println("This is a constructor");
    }
    static void method(int i) {
        System.out.println("This is a method");
    }
    public static void main(String[] args) {
//        Method Reference are shorthands, more readable way to use lambda expressions by invoking method or constructor.
//        They allow you to reference a method or constructor by using :: operator.
//        Method Reference does not care about method names, return type it cares about method signature.
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,33,4,54,680,72,8));
        list.forEach(System.out::println);                     // Method Reference working on variables
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                MethodReferenceExample.method(10);
            }
        };
        list.forEach( MethodReferenceExample::method);
        list.forEach( MethodReferenceExample:: new);


    }
}
