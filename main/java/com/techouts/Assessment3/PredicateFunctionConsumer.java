package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,34,5,6,7,8,94,485));
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer%2 == 0) return true;
                else return false;
            }
        };
        Function<Integer,Integer> f = new Function<>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }

        };
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        list.stream().filter(p).map(f).forEach(con);
    }
}
