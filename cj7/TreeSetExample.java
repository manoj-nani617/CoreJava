package com.techouts.collections;

import java.util.TreeSet;

public class TreeSetExample {
//    TreeSet stores the elements in the sorted order.
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(0);
        System.out.println(set);

//        Accessing
        for(int i : set) System.out.print(i+"\t");
        System.out.println();

//        ForEach
        set.forEach(i -> System.out.println(i));

//        Contains
        if(set.contains(2)) set.remove(20);

//        removing element
        set.remove(100);
        System.out.println(set);

//        Clear
        set.clear();
        System.out.println(set);

//        removeAll
        set.removeAll(set);
        System.out.println(set);
    }
}
