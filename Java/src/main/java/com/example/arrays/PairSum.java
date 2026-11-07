// find pairs whose sum equals target value
//output: pairs
//(4,5)
//(2,7)
package com.example.arrays;

import java.util.HashSet;
import java.util.Set;

public class PairSum {

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 7, 8};
        int target=9;

        Set<Integer> set=new HashSet<>();
        System.out.println("pairs");
        for(int num:arr){
            int complement=target-num;
            if(set.contains(complement)){
                System.out.println("(" +complement+","+num+")");
            }
            set.add(num);
        }

    }
}
