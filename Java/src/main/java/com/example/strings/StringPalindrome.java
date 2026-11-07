//palindrome string
//output: Palindrome String:level

package com.example.strings;

public class StringPalindrome {

    public static void main(String[] args){

        String str="level";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println("Palindrome String:" +reversed);
        }else{
            System.out.println("Not palindrome:" +reversed);
        }
    }
}
