package com.techouts.Strings;

public class StringBuilderExample {
//    StringBuilder is a mutable class used to create and modify the strings without creating objects.
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("manoj ");
        str.append("is ");
        str.append("a ");
        str.append("good ");
        str.append("boy");
        System.out.println(str);
//        StringBuilder Reverse
        str.reverse();
        System.out.println(str);
//        Deleting Characters
        str.delete(4,6);
        System.out.println(str);
//        inserting Characters at specific positions
        str.insert(4,3);
        System.out.println(str);
        str.lastIndexOf("manojs");
        System.out.println(str);


    }
}
