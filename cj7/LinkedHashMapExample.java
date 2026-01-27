package com.techouts.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
//    LinkedHashMap is used to store elements in key value pairs but it maintains order on insertion.
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(134,"Apple");
        map.put(21,"Banana");
        map.put(789,"Carrot");
        map.put(42,"Dragon Fruit");
        map.put(2,"Eating");

//      Accessing The Keys
        for(int i : map.keySet())
            System.out.println(i);

//        Accessing the Values
        for(String i : map.values())
            System.out.println(i);

//        Accessing the keys with values
        for(int i : map.keySet())
            System.out.println(i+" " +map.get(i));

//        Removing
        map.remove(1);

//        update
        map.put(1,"Cucumber");
        System.out.println(map);

//        Clear
        map.clear();
        System.out.println(map);

    }
}
