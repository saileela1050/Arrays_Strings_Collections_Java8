//anagram check between two strings
//output: Anagrams
package com.example.strings;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args){

        String str1="race";
        String str2="care";

        if(str1.length()!=str2.length()){
            System.out.println("Not anagrama");
            return;
        }

        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagrams");

        }else{
            System.out.println("Not anagrams");
        }
    }
}
