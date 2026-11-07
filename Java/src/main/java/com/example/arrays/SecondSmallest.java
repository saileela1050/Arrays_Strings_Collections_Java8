// seocnd smallest element in the given array
//output: Smallest element:2
//Second smallest element:4


package com.example.arrays;

public class SecondSmallest {

    public static void main(String[] args){
        int[] arr={10,4,2,8,25};
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int num:arr){
            if(num<smallest){
            secondSmallest=smallest;
            smallest=num;
        }
        else if(num<secondSmallest && num !=smallest){
            secondSmallest=num;
            }

        }
        if(secondSmallest==Integer.MAX_VALUE){
            System.out.println("No element found in the array");
        }
            else {
            System.out.println("Smallest element:" +smallest);
                System.out.println("Second smallest element:" +secondSmallest);

            }
    }
}
