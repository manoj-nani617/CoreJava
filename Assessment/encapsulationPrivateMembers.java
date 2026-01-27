package com.techouts.Assessment;
class PrivateMembers {
    private String name;
    private int id;
    void setId(int id) {
        this.id = id;

    }
    void setName(String Name) {
        this.name  = Name;

    }
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }

}
public class encapsulationPrivateMembers {
    public static void main(String[] args) {
        PrivateMembers p = new PrivateMembers();
        p.setId(2362);
        p.setName("manoj");
        System.out.println(p.getName());
        System.out.println(p.getId());
    }

}
