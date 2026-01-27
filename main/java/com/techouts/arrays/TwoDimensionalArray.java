package com.techouts.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
//    Two Dimensional array stores the values in row and column.
    public static void main(String[] args) {
//        Declaration
        int[][] arr;
        int [] arr1[] ;
        int[] arr2[];
        int[] arr3 [];
        int [][]arr4;
        int [] [] arr5;
        int [][] arr6;
        Scanner sc = new Scanner(System.in);

//        Initialization
        int[][] arr7 = {{1,2,3,4},{1,2,3,5},{1,5,5,6}};

//        For Loop
//        for(int i = 0; i < arr7.length; i++)
//        {
//            for(int j = 0; j < arr7[i].length; j++)
//            {
//                arr7[i][j] = sc.nextInt();
//
//            }
//        }
//       Using New Keyword
        int[][] arr8 = new int[][] {
                {1,2,4,5},
                {1,2,4,5},
                {2,3,4,5}
        };
//        Jagged Array
        int[][] arr9 = new int[3][];
        arr9[0] = new int[]{1,2,4,5};
        arr9[1] = new int[]{1,2};
        arr9[2] = new int[]{1,2,4,5};




//        Accessing Elements
//        Indexes
        System.out.println(arr8[0][0]);
        System.out.println(arr8[0][1]);
        System.out.println(arr8[0][2]);
//        For Loop
        for(int i = 0; i < arr8.length ; i++)
        {
            for(int j = 0; j < arr8[i].length; j++)
            {
                System.out.println(arr8[i][j]);
            }
        }
//        Enhanced For Loop
        for(int[] row : arr8)
        {
            for(int i : row)
                System.out.print(i+"\t");
            System.out.println();
        }
//        Utility classes for debugging
        System.out.println(Arrays.deepToString(arr8));

    }
}
