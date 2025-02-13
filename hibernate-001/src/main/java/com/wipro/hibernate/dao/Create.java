package com.wipro.hibernate.dao;

import com.wipro.hibernate.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.wipro.hibernate.utilities.SessionFactoryProvider;

public class Create {
    @SuppressWarnings("deprecation")
	public static void main(String[] args)
    {
        try {
            SessionFactory sessionFactory
                = SessionFactoryProvider
                      .provideSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            Employee emp = new Employee(101, "Madhan");
            session.save(emp);
            t.commit();

            sessionFactory.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}