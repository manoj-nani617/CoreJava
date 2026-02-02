package com.techouts.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.addAnnotatedClass(com.techouts.hibernate.Employee.class)
                .configure("hibernate.config.xml");
        try(SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession())
        {
            System.out.println("Enter the number of students");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0; i < n; i++) {
                Employee e = new Employee();
                List<Employee> employees = session .createQuery("from Employee", Employee.class).list();
                for(Employee employee : employees) {
                    System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getTech());
                }

                System.out.println("Enter the students id");
                int id = sc.nextInt();
                e.setId(id);
                sc.nextLine();

                System.out.println("Enter the student name");
                String name = sc.nextLine();
                e.setName(name);

                System.out.println("Enter the student Tech");
                String tech = sc.nextLine();
                e.setTech(tech);


//                Inserting the records
                Transaction transaction = session.beginTransaction();
                session.persist(e);
                transaction.commit();


//                removing Records
                Transaction transaction1 = session.beginTransaction();
                e = session.find(Employee.class,e.getId());
                if(e != null) {
                    System.out.println("It is not null");
                    session.remove(e);
                }
                transaction.commit();


            }

        }

    }
}
