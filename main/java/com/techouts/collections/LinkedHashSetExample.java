package com.techouts.collections;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
//        LinkedHashSet can maintain the insertion order i.e first inserted element will be the first element and second inserted element will be the second element
        var linkedHasset = new LinkedHashSet<Integer>();
        linkedHasset.add(10);
        linkedHasset.add(20);
        linkedHasset.add(30);
        linkedHasset.add(40);
        linkedHasset.add(50);

//        Accessing
        for(int i : linkedHasset) {
            System.out.print(i+"\t");
        }

//        lambda expression
        linkedHasset.forEach(i -> System.out.print(i+"\t"));
        System.out.println();

//        Removing
        linkedHasset.remove(100);

//        size
        System.out.println(linkedHasset.size());
    }
}
