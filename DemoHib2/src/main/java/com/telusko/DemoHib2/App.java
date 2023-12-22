package com.telusko.DemoHib2;

import javax.imageio.spi.ServiceRegistry;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FullName fn = new FullName();
    	fn.setFname("Nilesh");
    	fn.setMname("Vitthal");
    	fn.setLname("Pingale");
        College obj = new College();
        obj.setId(1);
        obj.setCollege("NITK");
        obj.setName(fn);
        Configuration con = new Configuration().configure().addAnnotatedClass(College.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session =  sf.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
    }
}
