package com.telusko.JPADemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien al = new Alien();
    	al.setAid(6);
    	al.setAname("KKM");
    	al.setTech("Blockchain");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); // unit name mentioned
        																// in persistence.xml file
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(al);
        em.getTransaction().commit();
    }
}
