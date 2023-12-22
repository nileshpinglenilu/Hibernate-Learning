package com.telusko.DemoHib6;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        int b = 60;
        org.hibernate.Transaction tx = session.beginTransaction();
        
        SQLQuery q1 = session.createSQLQuery("Select name,marks from Student where marks > 60");
        q1.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP); // convert obj --> into map
        List students = q1.list();
        for(Object o : students)
        {
        	Map m = (Map) o; //typecast
        	System.out.println(m.get("name")+" : "+m.get("marks"));
        }
        session.getTransaction().commit();
    }
}
