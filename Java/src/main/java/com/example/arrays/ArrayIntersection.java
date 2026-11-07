//intersection of two arrays
//output: Common elements:[20, 40, 15]
package com.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args){

        int[] arr1={10,20,15,40};
        int[] arr2={20,15,5,60,40};
        Set<Integer> set=new HashSet<>();
        for(int num:arr1){
            set.add(num);
        }
        Set<Integer> result=new HashSet<>();
        for(int num:arr2){
            if(set.contains(num)){
                result.add(num);
            }
        }
        System.out.println("Common elements:" +result);
    }
}
