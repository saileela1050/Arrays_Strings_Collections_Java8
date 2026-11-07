// second largest element in the given array
//output: Largest element:40
//Second Largest element:30


package com.example.arrays;

public class SecondLargest {

    public static void main(String[] args){

        int[] arr={10,20,30,40};

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            } else if (num>secondLargest && num!=largest) {
                secondLargest=num;
                
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("Second largest element not found");
        }
        else{
            System.out.println("Largest element:" +largest);
            System.out.println("Second Largest element:" +secondLargest);
        }
    }
}
