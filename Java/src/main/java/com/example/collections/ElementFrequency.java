// frequency of ecah element in the given list
//output: {20=1, 5=1, 10=2, 26=1, 90=1}

package com.example.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFrequency {

    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(10,20,10,5,26,90);

        Map<Integer,Integer> map=new HashMap<>();

        for(int num:numbers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map);
    }
}
