//duplicate charcters in string
// Duplicate Characters
//r
//g
//m

package com.example.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

    public static void main(String[] args){

        String str="programming";
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println("Duplicate Characters");

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
