package com.example.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    
    	Configuration con = new Configuration().configure("hibernate.cfg.xml");
    	
    	//StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	
    	//Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();
    	
    	SessionFactory sf = con.buildSessionFactory();
    	
    	Session s = sf.openSession();
    	
    	Transaction t = s.beginTransaction();
    	
    	hibernate h = new hibernate();
    	
    	h.setName("abc");
    	
    	h.setEmail("abc@gmail.com");
    	
    	h.setPassword("abcabc");
    	
    	h.setPhno(1234567890);
    	
    	s.save(h);
    	
    	t.commit();
    	
    	System.out.println("Successfully inserted");
    	
    	sf.close();
    	
    	s.close();
    	
    }
}