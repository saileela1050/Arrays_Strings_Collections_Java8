// duplicate elements in the given array
//output: Duplicate Elements:[10]

package com.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args){

        int[]arr={10,6,20,50,10,5};

        Set<Integer> set=new HashSet<>();
        Set<Integer> seen=new HashSet<>();

        for(int num:arr){
            if(!set.add(num)){
                seen.add(num);
            }
        }
        System.out.println("Duplicate Elements:" +seen);
    }
}
