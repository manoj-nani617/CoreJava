package com.techouts.cj3;

public class WhileLoop {
    public static void main(String[] args) {
//        The loop runs as long as the condition is true.
//        while (condition) {
//              // code to repeat
//          }
        int[] numbers = {10, 20, 30};

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }


    }
}
