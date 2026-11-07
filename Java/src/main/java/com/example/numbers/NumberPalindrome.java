//number is palidnrome or not
//output: 141number is palindrome

package com.example.numbers;

public class NumberPalindrome {
    public static void main(String[] args){

        int num=141;
        int original=num;
        int temp=num;
        long reversed=0;

        if(num<0){
            System.out.println(num+"not a palindrome");
            return;
        }
        while(temp>0){
            int digit=temp%10;
            reversed=reversed*10+digit;
            temp=temp/10;

        }
        if(original==reversed){
            System.out.println(original+ "number is palindromes");

        }else{
            System.out.println(original+ "not a palindrome number");
        }
    }
}
