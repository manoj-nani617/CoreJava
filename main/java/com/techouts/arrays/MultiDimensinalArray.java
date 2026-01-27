package com.techouts.arrays;

public class MultiDimensinalArray {
//    Multi Dimensinal Array is an array of arrays
public static void main(String[] args) {
    int[][][] arr = new int [][][] {
            {{1,2,3},{1,2,4}},
            {{1,4,5},{1,3,4}},
            {{1,23,4},{1,4,4}}
    };
    System.out.println(arr[2][1][1]);
    for(int i = 0; i < arr.length; i++)
    {
        for(int j = 0; j < arr[i].length; j++)
        {
            for(int k = 0; k < arr[j].length; k++)
            {
                System.out.print(arr[i][j][k]+"\t");
            }

        }
        System.out.println();
    }

}

}
