// prime numbers range from 1 to 50 betwn
//output: Prime Numbers:
//2
//3
//4
//5
//7
//9
//11
//13
//17
//19
//23
//25
//29
//31
//37
//41
//43
//47
//49
package com.example.numbers;

public class PrimeNumbersInRange {
    public static void main(String[] args){

        int start=1;
        int end=50;
        System.out.println("Prime Numbers:");
        for(int num=start;num<=end;num++){
            if(isPrime(num)){
                System.out.println(num +"");
            }
        }
    }
    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
