//sort the list of integers
//output: [1, 2, 5, 9, 16]
package com.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String [] args){

        List<Integer> numbers=new ArrayList<>(Arrays.asList(5,2,9,1,16));
      //ascending order
        Collections.sort(numbers);
        //descending order
     //  numbers.sort(Collections.reverseOrder());

        System.out.println(numbers);
    }
}
