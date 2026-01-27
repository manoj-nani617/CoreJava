package com.techouts.Assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employees {
    String name;
    String Department;
    Employees(String name, String department) {
        this.name = name;
        this.Department = department;
    }
    public String getDepartment() {
        return Department;
    }

}
public class GroupEmployeesByDepartmentusingGroupingBy {
    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();
        list.add(new Employees("manoj","AIMl"));
        list.add(new Employees("manideep","AIMl"));
        list.add(new Employees("rajesh","AIMl"));
        list.add(new Employees("surya","AIMl"));
        Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Employees ::getDepartment,Collectors.counting()));
        System.out.println(map);
    }
}
