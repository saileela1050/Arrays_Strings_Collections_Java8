package com.example.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public static void main(String[] args){

        String str="abcabcbb";
        Set<Character> set=new HashSet<>();
        int left=0;
        int maxLength=0;
        String longest="";

        for(int right=0;right<str.length();right++){
            char ch=str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            if(right-left+1>maxLength){
                maxLength=right-left+1;
                longest=str.substring(left,right+1);
            }
        }
        System.out.println("Longest substring:" +longest);
        System.out.println("Length:" +maxLength);
    }
}
