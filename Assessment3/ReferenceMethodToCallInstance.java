package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.List;

public class ReferenceMethodToCallInstance {
    void method(int a) {
        System.out.println("This is the instance method");
    }
    public static void main(String[] args) {
        ReferenceMethodToCallInstance r = new ReferenceMethodToCallInstance();
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,4,5));
        list.forEach(r::method);

    }
}
