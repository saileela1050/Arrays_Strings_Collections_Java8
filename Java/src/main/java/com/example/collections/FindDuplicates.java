// find duplicate elements in the given list
//output: Dulpicate elements:[20]

package com.example.collections;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args){

        List<Integer> numbers=Arrays.asList(10,20,30,20,80,15);

        Set<Integer> set=new HashSet<>();
        Set<Integer> seen=new HashSet<>();

        for(int num:numbers){
            if(!set.add(num)){
                seen.add(num);
            }
        }
        System.out.println("Dulpicate elements:"+seen);
    }
}
