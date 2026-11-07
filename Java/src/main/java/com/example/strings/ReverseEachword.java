package com.example.strings;

public class ReverseEachword {
  public static void main(String[] args){

     String str="Java Developer";
     String[] words=str.split("");
//
//        StringBuilder result=new StringBuilder();
//        for(String word:words){
//            StringBuilder reversed=new StringBuilder(word).reverse();
//            result.append(reversed).append("");
//        }
//
//        System.out.println("Original:"+str);
//        System.out.println("Reversed:" +result.toString().trim());
//    }
//}

            StringBuilder result = new StringBuilder();

            for (String word : words) {

                StringBuilder reversed = new StringBuilder(word).reverse();

                result.append(reversed).append(" ");
            }

            System.out.println("Original: " + str);
            System.out.println("Reversed: " + result.toString().trim());
        }
    }