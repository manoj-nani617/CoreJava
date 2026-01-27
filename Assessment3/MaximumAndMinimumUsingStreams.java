package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class MaximumAndMinimumUsingStreams {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,4,5,2,3,5,1,4,5));
        int max = list.stream().max(Integer::compareTo).get();
        int min = list.stream().min(Integer::compareTo).get();
        System.out.println(max);
        System.out.println(min);
    }
}
