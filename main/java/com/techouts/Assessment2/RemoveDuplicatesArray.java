package com.techouts.Assessment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1,3,49,56,3,4,2,4,3,57,48};
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++)
        {
            set.add(arr[i]);
        }
        int[] newArray = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int index = 0;
        while(it.hasNext())
        {
            newArray[index] = it.next();
            index++;
        }
        for(int i = 0; i < newArray.length; i++)
        {
            System.out.print(newArray[i]+"\t");
        }


    }
}
