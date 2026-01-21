package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee{
    int salary;
    String name;
    Employee(int salary, String name) {
        this.name = name;
        this.salary = salary;
    }
}

public class sortCustomObjects {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(5000,"manoj"));
        list.add(new Employee(2000,"vinay"));
        list.add(new Employee(25000,"manideep"));
        list.add(new Employee(1000,"shivaji"));
        list.sort(Comparator.comparing(e -> e.salary));
        list.forEach(s -> System.out.println("name " +s.name+" salary "+s.salary));
    }
}
