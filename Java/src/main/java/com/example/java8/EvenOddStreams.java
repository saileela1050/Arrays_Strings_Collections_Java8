//filter even and odd numbers using streams
// output: Even:[8, 6, 0]
//Odd:[9, 7, 45]

package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddStreams {

    public static void main(String[] args){

        List<Integer> list= Arrays.asList(9,8,7,6,0,45);

        List<Integer> even=list.stream().filter(n->n%2==0)
                .collect(Collectors.toList());

        List<Integer> odd=list.stream().filter(n->n%2!=0)
                .collect(Collectors.toList());

        System.out.println("Even:" +even);
        System.out.println("Odd:" +odd);
    }
}
