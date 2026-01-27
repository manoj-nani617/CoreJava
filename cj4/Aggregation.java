package com.techouts.cj4;
class Adress {
    String state, city;
    Adress(String city, String state) {
        this.city = city;
        this.state = state;
    }

}
class Person {
    String name, work;
    Adress adr; // AGGREGATION
    Person(String name, String work, Adress adr ) {
        this.name = name;
        this.work = work;
        this.adr = adr;
    }
}
public class Aggregation {
    Adress a = new Adress("Hyderabad", "Telangana");
    Person p = new Person("Manoj", "Software", a);


}
