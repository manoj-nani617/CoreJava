package com.techouts.Assessment;

public class Loops_Java {
    void loop() {
        System.out.println("While Loop:");
        int i = 1; //INITIALIZATION
        while (i <= 5) {    //CONDITION
            System.out.println(i);
            i++;
        }

        // DO-WHILE LOOP AS LONG AS CONDITION IS TRUE. IT ENSURES ONE TIME EXECUTION. IT IS ALSO KNOWN AS EXIT CONTROL LOOP
        System.out.println("\nDo-While Loop:");
        int j = 1; //INITIALIZATION
        do {
            System.out.print(j);
            j++;
        } while (j <= 5);

        // FOR LOOP EXECUTES AS LONG AS CONDITION IS TRUE . IT EXECUTES SPECIFIC NUMBER OF TIMES.
        System.out.println("\nFor Loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.print(k);
        }
    }
}
