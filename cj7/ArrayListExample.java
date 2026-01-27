package com.techouts.collections;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
//        ArrayList is the resizable array.
//        The difference between array and arraylist is, we cannot add or remove the elements from the array( The size is fixed)
//        and we can add or remove the elements from the ArrayList.
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

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
