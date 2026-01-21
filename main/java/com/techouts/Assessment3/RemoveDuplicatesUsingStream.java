package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesUsingStream {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,4,5,2,3,5,1,4,5));
        List<Integer> newList = list.stream().distinct().toList();
        System.out.println(newList);
    }
}
