package com.techouts.Assessment2;

import java.util.ArrayList;

public class NonRepeatingCharactersString {
    public static void main(String[] args) {
        String s = "manoj is a good boy";
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(list.contains(s.charAt(i))){
                break;
            }
            list.add(s.charAt(i));
        }
        System.out.println(list);
    }
}
