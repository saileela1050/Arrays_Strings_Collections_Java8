// sum of digits of the given number
//output: Sum of Digits:10

package com.example.numbers;

public class SumOfDigits {

    public static void main(String[] args){

        int num=1234;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }

        System.out.println("Sum of Digits:" +sum);
    }
}
