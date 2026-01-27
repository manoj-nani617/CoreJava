package com.techouts.Strings;

import com.sun.security.jgss.GSSUtil;

public class StringExample {
//    String is a mutable class
    public static void main(String[] args) {
        String str = new String();
        str = "manoj";
        String str2  = new String();
        str2 = "manoj";
        if(str.equals(str2))
            System.out.println("yes");
        else
            System.out.println("NO");

    }
}
