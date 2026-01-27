package com.techouts.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
//    Arrays are the set of Values of similar type and array is a sequential collection of related data items that shares a common name.
//    Single dimensional array :
//    Single Dimensional array store the value in single row.
    public static void main(String[] args) {
//        Declaration
        int arr0[] ;
        int []arr1 = new int[5];
        int [] arr2 = new int[5];
        int[] arr3 = new int[5];
        int[] a, b ;
        a = new int[5];
        b = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println(a.getClass());

//        Initialization
        int[] arr = {1,2,3,4,5};

//        Initialization using For Loop
//        for(int i = 0; i < arr.length; i++)
//        {
//            arr[i] = sc.nextInt();
//        }
        int[] arr4 = new int[]{1,2,4};

//        Accessing Elements
        for(int i : arr)                    //Enhanced For Loop
            System.out.println(i);

//        For Loop
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);

//        Index
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

//        Quick Access and Debugging
        System.out.println("this is Quick Access "+Arrays.toString(arr));

    }
}
