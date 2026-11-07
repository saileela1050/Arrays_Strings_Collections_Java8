// remove duplicates in the given array
//output: [10, 20, 70]
package com.example.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args){

        int[] arr={10,20,70,10,20,20};

        Set<Integer> set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int[] result=set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}
