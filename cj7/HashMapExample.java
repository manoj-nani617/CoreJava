package com.techouts.collections;

import java.util.HashMap;

public class HashMapExample {
//    Map is a interface it stores the elements in the form of key value pair.
//    Since it is a interface we cannot create an object directly instead we use HashMap, TreeMap, LinkedHashMap
//    It doesn't care about the order.
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(198,"Apple");
        map.put(22,"Banana");
        map.put(31,"Carrot");
        map.put(400,"Dragon Fruit");
        map.put(5,"Eating");

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
