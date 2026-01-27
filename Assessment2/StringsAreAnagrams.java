package com.techouts.Assessment2;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class StringsAreAnagrams {
    public static void main(String[] args) {
        String s = "silent";
        String s2 = "listen";
        char[] arr = s.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int count = 0;
        if(arr.length == arr2.length) {
            for(int i = 0;  i < arr.length; i++)
            {
                if(arr[i] != arr2[i])
                {
                System.out.println("Executing");
                  break;
                }
                count++;
            }

        }
        if(count == arr.length) System.out.println("Two strings are anagrams");
        else System.out.println("Not anagrams");
    }
}
