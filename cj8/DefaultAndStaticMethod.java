package com.techouts.cj8;
interface Employee {
    void work();
    void salary();
    default void companyChange(){
        System.out.println("May Company change");
    }
    default void manoj() {
        System.out.println("This is also a default method");
    }
    static void id() {
        System.out.println("2362");
    }

}
public class DefaultAndStaticMethod {
//    We know interface is a list of methods, interface contain default, static and abstract methods.
//    you can have any number of static, default and abstract method. We must define default and static method in interface itself.
//    Abstract Methods must be implemented in child classes.
//    The variable which is declared in the interface is public, static final.

    public static void main(String[] args) {
        Employee e = new Employee() {
            @Override
            public void work() {
                System.out.println("Working Techouts Company");
            }

            @Override
            public void salary() {
                System.out.println("Salary 5k");

            }
            @Override
            public void companyChange() {
                System.out.println("Company changed to Google");
            }
        };
        e.work();
        e.salary();
        e.companyChange();
        Employee.id();
    }
}
