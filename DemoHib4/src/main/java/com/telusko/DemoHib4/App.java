package com.telusko.DemoHib4;

import java.util.Collection;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alian.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        Alian al = session.get(Alian.class, 1);
        System.out.println(al.getSname());
        Collection<Laptop> laps = al.getLaps();
        for(Laptop l : laps)
        {
        	System.out.println(l.getBrand());
        }
        session.getTransaction().commit();
    }
}
