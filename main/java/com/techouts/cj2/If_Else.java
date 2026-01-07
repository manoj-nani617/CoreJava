package com.techouts.cj2;

public class If_Else {
    public static void main(String[] args) {
        int n= 10, m = 20;
        int a  = n;
        int b  = m;

        // IF BLOCK
        // IF BLOCK WHEN THE CONDITION IS TRUE
        // BRACES ARE NOT NECESSARY WHEN ONLY ONE STATEMENT RELATED TO THE CONDITION
        if(a > b) {
            System.out.println("Condition True");
        }


        // IF-ELSE BLOCK
        //STATEMENTS IN IF BLOCK GET EXECUTED WHEN THE CONDITION IS TRUE AND
        // STATEMENTS IN THE ELSE BLOCK GET EXECUTED WHEN THE CONDITION FALSE.
        if(a > b) {
            System.out.println("Condition True");
        }
        else {
            System.out.println("condition false");
        }



        // IF-ELSE LADDER BLOCK
        //STATEMENTS IN IF BLOCK GET EXECUTED WHEN THE CONDITION IS TRUE IF CONDITION IS FALSE
        // CONTROL CHECK FOR THE CONDITION IS TRUE .
        // IF ANY ONE OF THE CONDITION IS TRUE CORRESPONDING BLOCK GET EXECUTED.
        // IF ALL THE CONDITIONS ARE FALSE THEN ELSE BLOCK GET EXECUTED.
        if(a > b) {
            System.out.println("A is greater than B");
        }
        else if(b > a) {
            System.out.println(" B is greaterthan A");
        }
        else if(a < b) {
            System.out.println("A is less than B");
        }
        else {
            System.out.println("B is less than A");
        }

        //NESTED IF
        //STATEMENTS IN INNER IF GET EXECUTED WHEN THE OUTER IF CONDITION IS TRUE.
        //WHEN OUTER IF CONDITION IS FALSE THEN INNER IF NEVER GET EXECUTES.
        int c = 30;
        if(a > b) {
            System.out.println("Outer If Condition is True");
            if(b > c) {
                System.out.println("Inner If Condition is True");
            }
            else {
                System.out.println("Inner If Condition is False");
            }
        }
        else {
            System.out.println("Outer If Condition is False");
        }
    }
}
