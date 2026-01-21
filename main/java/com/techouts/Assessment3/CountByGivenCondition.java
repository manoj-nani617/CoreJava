package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.List;

public class CountByGivenCondition {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,3,4,5,2,3,5,1,4,5));
        long count = list.stream().filter(i -> i %2 == 0).count();
        System.out.println(count);
    }
}
