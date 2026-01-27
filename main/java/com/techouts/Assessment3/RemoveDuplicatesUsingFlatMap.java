package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesUsingFlatMap {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("Apple","banana"),Arrays.asList("Dragon","Apple","PineApple"),Arrays.asList("Orange","Apple"));
        List<String> newList = list.stream().flatMap(List::stream).distinct().toList();
        System.out.println(newList );
    }
}
