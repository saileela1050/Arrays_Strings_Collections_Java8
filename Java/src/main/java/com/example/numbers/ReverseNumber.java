package com.example.numbers;

public class ReverseNumber {

    public static void main(String[] args) {

        int num=12345;
        int reverse=0;
        while(num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;

        }
       System.out.println("Reversed Number:" +reverse);
    }
    }

//        int num=12345;
//        int temp=Math.abs(num);
//
//        long reversed=0;
//        while(temp>0){
//            int digit=temp%10;
//            reversed=reversed*10+digit;
//
//            temp=temp/10;
//
//        }
//        if(num<0){
//           reversed=-reversed;
//        }
//        System.out.println("Original number:" +num);
//        System.out.println("reverse number:" +reversed);

