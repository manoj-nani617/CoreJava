package com.techouts.collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
//        HashSet is the Unordered collection of same elements and doesn't store the duplicates.
        HashSet<String> set = new HashSet<>();
        set.add("car");
        set.add("BMW");
        set.add("RR");
        set.add("MERCEDES");
        set.add("RANGE ROVER");
        System.out.println(set);


//        removing
        set.remove("car");
        set.remove("swift");        //Not throwing error
        System.out.println(set);

//        iterating
        for(String s : set)
            System.out.println(s);

//        For Each
        set.forEach( s -> System.out.println(s));

//        contains
        System.out.println(set.contains("BMW"));
        System.out.println(set.contains("swift"));

//        size
        System.out.println(set.size());

//        CLEAR
        set.clear();

    }
}
