
// majority element in the given array
//output: majority element does not exists

package com.example.arrays;

public class MajorityElement {

    public static void main(String[] args){

        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        int candidate=0;
        int count=0;

        for(int num: arr){
            if(count==0){
                candidate=num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }
        }
        count=0;
        for(int num:arr){
            if(num==candidate){
                count++;
            }
        }
        if(count>arr.length/2){
            System.out.println("majority element:" +candidate);
        }else{
            System.out.println("majority element does not exists");
        }
    }
}
