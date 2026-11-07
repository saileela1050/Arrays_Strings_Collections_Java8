// first repeated character
//output: First repeated Character:r

package com.example.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstRepeatedCharacter {
    public static void main(String[] args){

        String str="programming";
        Set<Character> set=new LinkedHashSet<>();

        for(char ch:str.toCharArray()){
            if(set.contains(ch)){
                System.out.println("First repeated Character:" +ch);
                return;
            }
            set.add(ch);
        }
       System.out.println("No repeated character found");
    }
}
