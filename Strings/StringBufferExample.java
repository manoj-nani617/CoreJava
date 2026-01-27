package com.techouts.Strings;

import com.sun.security.jgss.GSSUtil;

public class StringBufferExample {
//    String Buffer is mutable class and used to create and modify strings without creating new objects.
public static void main(String[] args) {
    StringBuffer str = new StringBuffer();
//    Adding into the strings
    str.append("manoj");
    System.out.println(str);

//    Deleting the elements
    str.delete(1,3);
    System.out.println(str);

//    Reversing the String
    str.reverse();
    System.out.println(str);


}
}
