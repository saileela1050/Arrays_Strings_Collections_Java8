//first non repeated character in the given string
//output: First non repeated Characters:w

package com.example.strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args){

        String str="swiss";
        Map<Character,Integer> map=new HashMap<>();

        //count character frequency
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        //find first non repeated character
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("First non repeated Characters:" +entry.getKey());
                return;
            }
        }

        System.out.println("no non repeated character found");
    }
}
