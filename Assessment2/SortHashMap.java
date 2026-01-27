package com.techouts.Assessment2;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String>map = new HashMap<>();
        map.put(1,"Banana");
        map.put(2,"Apple");
        map.put(3,"pineapple");
        map.put(4,"Ant");
        map.put(0,"man");
        map.put(-4,"man");
        map.put(-1,"man");
        System.out.println(map);

        ArrayList<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<Integer,String> sortedMap =new LinkedHashMap<>();
        for(Map.Entry<Integer,String> entry : list)
            sortedMap.put(entry.getKey(),entry.getValue());
        System.out.println(sortedMap);

    }
}
