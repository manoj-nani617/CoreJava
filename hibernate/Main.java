package com.techouts.hibernate;

import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.postgresql.util.OSUtil;
import org.postgresql.util.PSQLException;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration().addAnnotatedClass(com.techouts.hibernate.Employee.class)
                .configure("hibernate.config.xml");
        try(SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession()) {

            List<Employee> employeeList = session.createQuery("from Employee",Employee.class).list();
            for(Employee emp : employeeList)
            {
                System.out.println(emp.getId()+"\t"+"\t"+emp.getName()+"\t"+"\t"+emp.getTech());
            }

            Transaction transaction = session.beginTransaction();
            System.out.println("Enter the number of employess");
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            sc.nextLine();
            Employee[] e = new Employee[n];
            for(int i = 0; i < n; i++) {
                e[i] = new Employee();
                System.out.println("Enter the name");
                e[i].setName(sc.nextLine());
                System.out.println("Enter the tech");
                e[i].setTech(sc.nextLine());
                session.persist(e[i]);

//            update
//            Query query = session.createQuery("update Employee set tech = :newtech where tech = :oldtech");
//            query.setParameter("newtech","springboot");
//            query.setParameter("oldtech","Java");
//            int row = query.executeUpdate();
//            System.out.println(row +"row Affected");


////            Delete
//            query = session.createQuery("delete from Employee where name = :delete");
//            query.setParameter("delete","manoj");
//            row = query.executeUpdate();
//            System.out.println(row +" affected");

            }
            transaction.commit();


        }


    }
}