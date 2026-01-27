package com.techouts.Assessment2;

public class MissingNumberInSortedOrder {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        int index = 1;
        for(int i = arr[0]+1; i < arr[arr.length-1]; i++)
        {
            if(i != arr[index]) {
                System.out.println(i+" is missed");
                break;
            }
            index++;
        }
    }
}
