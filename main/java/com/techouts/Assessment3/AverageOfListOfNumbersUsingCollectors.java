package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageOfListOfNumbersUsingCollectors {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,4,5,2,3,5,1,4,5));
        Map<String, Double> map = list.stream().collect(Collectors.groupingBy(n -> "All",Collectors.averagingDouble(n-> n)));
        System.out.println(map);
    }
}
