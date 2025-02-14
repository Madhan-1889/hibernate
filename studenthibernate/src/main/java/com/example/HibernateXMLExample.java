package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateXMLExample {
    public static void main(String[] args) {
        // Load configuration and mappings
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        // Open session
        Session session = factory.openSession();
        session.beginTransaction();

        // Create Student object
        Student student = new Student();
        student.setName("Madhan");

        // Save to DB
        session.save(student);

        // Commit and close
        session.getTransaction().commit();
        session.close();
        factory.close();

        System.out.println("Student inserted successfully!");
    }
}
