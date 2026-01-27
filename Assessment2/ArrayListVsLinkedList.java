package com.techouts.Assessment2;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
//        ArrayList is resizable array and and elements can be inserted and deleted at same time.
//        LinkedList is resizable array and and elements can be inserted and deleted at same time but these are elements can be stored in the form of container.
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(100);
        list2.add(100);

        list.remove(0);
        list2.remove(0);

        list.forEach(i -> System.out.println(i));
        list2.forEach(i -> System.out.println(i));
    }
}
