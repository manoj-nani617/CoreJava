package com.techouts.Assessment2;

import java.util.HashSet;

public class NonRepeatingCharacters {
    public static void main(String[] args) {
        HashSet<Character> ch = new HashSet<>();
        String s = "You can write any string in this line";
        for(char i :  s.toCharArray()) {
//           if(i != ' '){
//               ch.add(i);  if white space are not allowed
//           }
            ch.add(i);

        }
        System.out.println(ch);
    }
}
