// perfect number or not
// output: 6 is a perfect number
package com.example.numbers;

public class PerfectNumber {

    public static void main(String[] args){

        int num=6;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%1==0){
                sum=sum+i;
            }

        }
        if(sum==num){
            System.out.println(num+ "is a perfect number");
        }else{
            System.out.println(num+ "is not a perfect number");
        }
    }
}
