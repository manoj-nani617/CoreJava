package com.techouts.cj3;

public class ForLoop {
    public static void main(String Args [])
    {
//        A for loop is a control structure used to repeat a block of code a specific number of times.
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //Enhance for loop
        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println();
    }

}
