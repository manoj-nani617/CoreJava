package com.techouts.Assessment2;

public class ReversingString {
    public static void main(String[] args) {
        String string = "manoj";
        int mid = string.length()/2;
        String s="";
        for(int i = string.length()-1; i >= 0 ; i--)
        {
            s +=  string.charAt(i);
        }
//        Two Pointers Approach

        char arr[] = string.toCharArray();
        int left = 0, right = arr.length-1;
        while(left < right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String newString = new String(arr);
        System.out.println(newString);
    }
}
