package com.techouts.Assessment2;

public class RotatingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 8;
        int rotations = k%arr.length;
        for(int i = 0 ; i < rotations ;i++)
        {
            int key = arr[arr.length-1];;
            for(int j = arr.length-2; j >= 0; j--)
            {
                arr[j+1] = arr[j];
            }
            arr[0] = key;

        }
        for (int l : arr) System.out.print(l + "\t");
        System.out.println();

    }
}
