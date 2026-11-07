//check whether number is power off two
//output: its power of 2:16

package com.example.numbers;

public class PowerOfTwo {

    public static void main(String[] args){

        int num=16;
        if(num>0 && (num &(num-1))==0){
            System.out.println("its power of 2:"+num);

        }else{
            System.out.println("its not power of 2:"+num);
        }
    }
}
