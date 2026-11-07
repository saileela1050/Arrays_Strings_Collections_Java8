//fibonacci series
//output: 0
//1
//1
//2
//3
//5
//8
//13
//21
//34
package com.example.numbers;

public class Fibonacci {

    public static void main(String[] args){

        int n=10;
        int first=0;
        int second=1;

        for(int i=1;i<=n;i++){
            System.out.println(first+"");
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
