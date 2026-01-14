package com.techouts.collections;

import java.util.*;

public class VectorExample {
//    Vector is resizable array.
//    In Vector elements can be added and removed.
//    Vector and ArrayList are mostly same but ArrayList is not synchronized so it is not thread safe, it becomes faster.
//    Whereas Vector is synchronized and thread, safe it becomes slow.
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        Vector<Integer> list2 = new Vector<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

//        Adding an element to the list
        list.add(10);
        list2.add(10);
        System.out.println(list);
        System.out.println(list2);

//        removing element from the list
        list.remove(0);
        list2.remove(0);
        System.out.println(list);
        System.out.println(list2);

//        sorting the list
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list);
        System.out.println(list2);

//        accessing the elements
        for(int i =0 ; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();

//        For Each
        for(int i : list2)
            System.out.print(i+"\t");
        System.out.println();

//        Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+"\t");
        }

//        lambda expression
        System.out.println();
        list.forEach(i -> System.out.print(i+"\t"));
        System.out.println();

    }
}
