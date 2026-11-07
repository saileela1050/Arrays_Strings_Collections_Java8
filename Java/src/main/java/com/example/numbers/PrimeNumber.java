// check given number is prime or not
//output: 17is prime number
package com.example.numbers;

public class PrimeNumber {

    public static void main(String[] args){

        int num=17;
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num+"is prime number");
        }else{
            System.out.println(num+"is not prime number");
        }
    }
}
