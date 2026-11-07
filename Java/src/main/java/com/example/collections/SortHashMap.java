// sort hashmap
//output: Banana=6
//Apple=30
//Mango=90

package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class SortHashMap {

    public static void main(String[] args){

        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",30);
        map.put("Mango",90);
        map.put("Banana",56);
        map.put("Banana",6);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
