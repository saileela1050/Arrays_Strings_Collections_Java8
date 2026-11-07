//merge two arrays in the given array
//output: [10, 10, 20, 40, 40, 60, 60, 70, 90]

package com.example.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args){

        int[] arr1={10,20,40,60,70};
        int[] arr2={10,40,60,90};

        int n= arr1.length;
        int m=arr2.length;
        int[] result=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }
            else{
                result[k++]=arr2[j++];
            }
        }

        while(i<n){
            result[k++]=arr1[i++];
        }
        while(j<m){
            result[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(result));
    }
}
