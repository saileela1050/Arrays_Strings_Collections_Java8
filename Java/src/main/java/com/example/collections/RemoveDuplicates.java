// remove duplicates in the givn list
//output: [1, 2, 7, 8, 9, 10]

package com.example.collections;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(1,2,7,8,10,10,7,8,9);
        List<Integer> result=new ArrayList<>(new HashSet<>(numbers));

        System.out.println(result);
    }
}
