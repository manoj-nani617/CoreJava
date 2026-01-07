package com.techouts.cj3;

public class Continue {
    public static void main(String[] args) {
//        continue is used inside loops to skip the current iteration and move to the next one.
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}
