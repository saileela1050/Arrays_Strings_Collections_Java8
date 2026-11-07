//common elements in the both lists
//output: [2, 4]

package com.example.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args){

        List<Integer> list1= Arrays.asList(10,9,8,2,4);
        List<Integer> list2=Arrays.asList(2,4,6,5);

        Set<Integer> set=new HashSet<>(list1);
        //common elements in the both lists
        set.retainAll(list2);

        System.out.println(set);
    }
}
