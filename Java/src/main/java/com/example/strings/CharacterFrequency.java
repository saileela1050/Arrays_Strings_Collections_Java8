// character frequency in the given string
//output: p=1
//a=1
//r=2
//g=2
//i=1
//m=2
//n=1
//o=1
package com.example.strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args){

        String str="programming";
        Map<Character,Integer> map=new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
