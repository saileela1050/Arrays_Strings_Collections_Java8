//array frequency of each number
//output: 5->1
//70->1
//10->1
//90->1
//30->1

package com.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayFrequency {

    public static void main(String[] args){

        int[] arr={10,30,70,90,5};

        Map<Integer,Integer> map=new HashMap<>();

       for(int num:arr){
           map.put(num,map.getOrDefault(num,0)+1);
       }
       for(Map.Entry<Integer,Integer> entry: map.entrySet()){
           System.out.println(entry.getKey()+"->"+ entry.getValue());
       }
    }
}
