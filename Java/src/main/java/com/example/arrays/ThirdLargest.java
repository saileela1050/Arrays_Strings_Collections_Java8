// third largest element in the given array
//output: Third Largest element:20


package com.example.arrays;

public class ThirdLargest {

    public static void main(String[] args){

        int[]arr={10,20,30,80,9,1};

        Integer first=null;
        Integer second=null;
        Integer third=null;
        for(int num:arr){

            if(first!=null && num==first ||
            second!=null && num==second ||
             third!=null && num==third){
                continue;
            }
            if(first==null || num>first){
                third=second;
                second=first;
                first=num;
            } else if (second==null || num>second) {
                third=second;
               second=num;
            } else if (third==null || num>third) {
                third=num;
            }
        }
        if(third!=null){
            System.out.println("Third Largest element:" +third);
        }else{
            System.out.println("Third largest element does not exists");
        }
    }
}
