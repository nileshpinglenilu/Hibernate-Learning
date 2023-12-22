package com.telusko.DemoHib3;

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
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");   
        
        Student s = new Student();
        s.setRollno(1);;
        s.setMarks(50);
        s.setName("Nilesh");
        
        s.getLaptop().add(laptop);
        laptop.getStudent().add(s);
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session =  sf.openSession();
        org.hibernate.Transaction tx = session.beginTransaction();
        session.save(laptop);
        session.save(s);
        session.getTransaction().commit();
        
    }
}
