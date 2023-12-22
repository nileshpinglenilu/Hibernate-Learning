package com.telusko.DemoHib5;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alian a = null;
        Configuration con = new Configuration().configure().addAnnotatedClass(Alian.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session1 = sf.openSession();
        Transaction tx = session1.beginTransaction();
        Query q1 = session1.createQuery("from Alian where aid=100");
        q1.setCacheable(true);
        a = (Alian)q1.uniqueResult();
        System.out.println(a);
        session1.getTransaction().commit();
        session1.close();
        
        Session session2 = sf.openSession();
        session2.beginTransaction();
        Query q2 = session2.createQuery("from Alian where aid=100");
        q2.setCacheable(true);
        a = (Alian)q2.uniqueResult();
        System.out.println(a);
        session2.getTransaction().commit();
        session2.close();
        
        
    
    }
}
