//find the maximum subarray sum(kadane's algorithm)
//output: Maximum Subarray sum:6

package com.example.arrays;

public class MaximumSubArraySum {

    public static void main(String[] args){

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5};

        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("Maximum Subarray sum:" +maxSum);
    }
}
