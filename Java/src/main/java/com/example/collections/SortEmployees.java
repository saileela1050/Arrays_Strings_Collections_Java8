//sort employees by salary using comparator
//output: sai10
//rajesh87
//likitha90

package com.example.collections;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int salary;

    Employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
}

public class SortEmployees {

    public static void main(String[] args){

        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("sai",10));
        employees.add(new Employee("likitha",90));
        employees.add(new Employee("rajesh",87));

        employees.sort(Comparator.comparingInt(e->e.salary));
        for(Employee e:employees){
            System.out.println(e.name +""+ e.salary);
        }

    }
}
