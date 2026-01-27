package com.techouts.cj3;

public class Break {
    public static void main(String[] args) {
//        In Java, break is used to exit a loop immediately (or a switch statement).
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

    }
}
