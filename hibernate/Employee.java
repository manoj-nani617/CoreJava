package com.techouts.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    private String tech;
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTech(String tech) {
        this.tech = tech;
    }


    int getId() {
        return id;
    }
    String getName()  {
        return name;
    }
    String getTech() {
        return tech;
    }
}