// arm strong number or not
//output: Arm strong number:153


package com.example.numbers;

public class ArmStrongNumber {

    public static void main(String[] args){

        int num=153;
        int original=num;
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum=sum+digit * digit *digit;
            num=num/10;

        }
        if(sum==original){
            System.out.println("Arm strong number:" +original);
        }else{
            System.out.println("Not arm strong number:" +original);

        }
    }
}
