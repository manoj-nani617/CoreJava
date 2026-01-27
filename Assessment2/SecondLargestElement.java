package com.techouts.Assessment2;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr= {1,2,3,596,993,0,485,85995,93,8393,575,8595,2,89,67,578,5,47,8996,6869,3995,484};
        int max = 0;
        int secondMax = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
                max = arr[i];

        }
        for(int i = 0; i < arr.length; i++)
        {
            if(secondMax < arr[i] && arr[i] < max)
                secondMax = arr[i];

        }
        System.out.println("max "+max);
        System.out.println("Second Max"+secondMax);
    }
}

// TimeComplexity worst Case O(n)
//  SpaceComplexity  worst case O(n)