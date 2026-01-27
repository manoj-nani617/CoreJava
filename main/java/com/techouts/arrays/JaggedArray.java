package com.techouts.arrays;

public class JaggedArray {
    public static void main(String[] args) {
//        In jagged Array each row is stored in the individual memory.
        int[][] arr = new int[][] {
            {1,2,3},
            {1,2,3,4},
            {1,2,3,4,5}
        };
        for(int[] row : arr){
            for(int i : row) {
                System.out.print(i);
            }
            System.out.println();
        }
        int[][] arr1 = new int[3][];
        arr1[0] = new int[]{1,2,3,4};
        arr1[1] = new int[]{1, 2, 3, 4, 5};
        arr1[2] = new int[]{1,2,3,4,5,6};
        for(int row[] : arr) {
            for(int i : row) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}

