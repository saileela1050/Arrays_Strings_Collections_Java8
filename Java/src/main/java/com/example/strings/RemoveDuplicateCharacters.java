// remove duplicate characters in string
//output: original string:programming
//after removing duplicates:progamin


package com.example.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static void main(String[] args){

        String str="programming";

        Set<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        StringBuilder result=new StringBuilder();
        for(char ch:set){
            result.append(ch);
        }
        System.out.println("original string:"+str);
        System.out.println("after removing duplicates:" +result);
    }
}
