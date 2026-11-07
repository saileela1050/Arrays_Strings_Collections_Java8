//first non repaeted number in the list
//output : First non repeated :3

package com.example.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeated {

    public static void main(String[] args){

        List<Integer> list= Arrays.asList(1, 2, 3, 2, 1, 4);
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:list){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> maps: map.entrySet()){
            if(maps.getValue()==1){
                System.out.println("First non repeated :" +maps.getKey());
                break;

            }
        }
    }
}
