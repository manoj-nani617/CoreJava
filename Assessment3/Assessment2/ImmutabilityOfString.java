package com.techouts.Assessment2;

public class ImmutabilityOfString {
    public static void main(String[] args) {
//        String is a class used to create a string and that strings are stored in the heap .
//        String class is final class.
//        Once the value is assigned to it never changes it's value when try to change it stores in the new object.
        String s = new String("manoj");

        System.out.println(s.hashCode());
        s = "vinay";                // new object is created
        System.out.println(s.hashCode());
    }
}
