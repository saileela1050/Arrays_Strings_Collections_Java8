// custom comparator sorting
//output: guru60
//jhony90
//shekar56

package com.example.collections;

import java.util.Arrays;
import java.util.List;

class Employees{
    String name;
    int salary;

    Employees(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}

public class CustomComparator {

    public static void main(String[] args){

        List<Employees> employee= Arrays.asList(
                new Employees("jhony",90),
                new Employees("shekar",56),
                new Employees("guru",60)

                );
        employee.sort((e1,e2)-> e1.name.compareTo(e2.name));
        for(Employees e: employee){
            System.out.println(e.name +"" +e.salary);
        }

    }
}
