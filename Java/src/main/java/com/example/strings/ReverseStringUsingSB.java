// reverse string using string builder
// output: reversed string:olleh


package com.example.strings;

public class ReverseStringUsingSB {
    public static void main(String[] args){

        String str="hello";
        String reversed=new StringBuilder(str).reverse().toString();

        System.out.println("reversed string:" +reversed);
    }
}
