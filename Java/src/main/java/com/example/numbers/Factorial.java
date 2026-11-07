// factorial of the given number
// output: Factorial:40320

package com.example.numbers;

public class Factorial {

    public static void main(String[] args){

        int num=8;
        int factorial=1;

        for(int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial:" +factorial);
    }
}
