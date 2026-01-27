package com.techouts.Assessment2;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {10,11,12,13,14};
        int size = arr.length+arr2.length;
        int[] arr3 = new int[size];
        for(int i = 0; i < arr.length; i++) arr3[i] = arr[i];
        int index = 0;
        for(int i = arr.length; i < size; i++) arr3[i] = arr2[index++];
        for(int i : arr3) System.out.println(i);
    }
}
