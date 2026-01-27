package com.techouts.cj6;

public class ThrowKeyword {
//    Throw is used to explicitly throw a single exception
//    We use throw when something goes wrong
//    We want to  stop normal flow and hand control to exception handling.
    public static void main(String[] args) {
        int age =12;
        if(age < 18) {
            throw new ArithmeticException("This is a Exception");
        }
        else System.out.println("His Applicable");
    }

}
