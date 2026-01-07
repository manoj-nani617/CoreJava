package com.techouts.cj5;
class Person {
    private String name;
    private int age;
    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge() {
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("manoj");
        p.setAge(22);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

}
