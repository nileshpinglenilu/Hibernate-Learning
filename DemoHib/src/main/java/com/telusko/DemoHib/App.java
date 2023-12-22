package com.telusko.DemoHib;

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
        Alian telusko = new Alian();
        telusko.setAid(102);
        telusko.setAname("Nilesh");
        telusko.setColor("Pingale");
        Configuration con = new Configuration().configure().addAnnotatedClass(Alian.class);  // in configure file set configuration file name, 
        														//where database connect store
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();
        
    }
}
