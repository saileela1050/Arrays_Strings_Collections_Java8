//hashmap with custom objects and equals /hashcode
// output: Total employees: 3

package com.example.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employes{
    int id;
    String name;


    Employes(String name,int id){
        this.id=id;
        this.name=name;

    }

    @Override
    public boolean equals(Object obj){
        Employes e=(Employes) obj;
        return this.id==e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    }
public class EmployeeHashset {
    public static void main(String[] args){


        Set<Employes> employ=new HashSet<>();
        employ.add(new Employes("john",1));
        employ.add(new Employes("sai",9));
        employ.add(new Employes("John",90));

        System.out.println("Total employees: " + employ.size());
    }
}
