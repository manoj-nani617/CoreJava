package com.techouts.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExmple {
//    TreeMap is used to store the value in the form of key value of pairs in sorted order by key.
public static void main(String[] args) {
    TreeMap<Integer,String> map = new TreeMap<>();
    map.put(4,"Apple");
    map.put(2,"Banana");
    map.put(5,"Carrot");
    map.put(12,"Dragon Fruit");
    map.put(10,"Eating");

//      Accessing The Keys
    for(int i : map.keySet())
        System.out.println(i);

//        Accessing the Values
    for(String i : map.values())
        System.out.println(i);

//    iterator
    Iterator<String> it = map.values().iterator();
    while(it.hasNext()) {
        System.out.println(it.next());
    }

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
