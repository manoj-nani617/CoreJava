package com.techouts.Assessment;
//Aggregation represents a relationship where one object uses another object, but does not own it.
//The contained object can exist independently.
//
//Real-World Example
class Employee {
    String Name;
    Employee(String name) {
        this.Name = name;
    }
}
class Department {
    Employee e;         // Aggregation
    String name;
    Department(String name, Employee e) {
        this.name = name;
        this.e = e;
    }
}


// COMPOSITION
//Composition represents a relationship where one object owns another object.
//The contained object cannot exist independently.
class Room {
    int roomNo;
    public Room(int roomNO) {
        this.roomNo = roomNO;

    }
}
class House {
    Room r;
    int houseNo;
    public House(int houseNo) {
        this.houseNo = houseNo;
        r = new Room(12);

    }
}
public class CompositionVsAggregation {
    public static void main(String[] args) {
        Employee e = new Employee("manoj");
        Department d = new Department("AIML",e);
        System.out.println(d.e.Name);


        //composition
        House h = new House(89);
        System.out.println(h.r.roomNo);
    }
}
