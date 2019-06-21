package com.intelligent.response.db.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.intelligent.response.Bean.POJO.AmbulancesBean;

public class AmbulanceConnectionOperations {

	/**
	 * 
	 */
	public void setAmbulanceDetails() {
		
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(AmbulancesBean.class).buildSessionFactory();
		
		//create factory
		Session session = factory.openSession();
		
		//create ambulance object
		System.out.println("Creating a new AmbulanceBean object");
		AmbulancesBean ambulance = new AmbulancesBean(789, "BC07SNGP", "Gauteng Ambulance Services", "0117842598", "Ambulances@gp.com",
				"45 Louis Botha Avenue", "Berea, Johannesburg", "Gauteng");
		
		
		//start a transaction
		session.beginTransaction();
		
		//save the object to the database
		System.out.println("Saving the ambulance object...");
		session.save(ambulance);
		
		//commit transaction
		session.getTransaction().commit();
		
		System.out.println("Saved!!!");
		
		
		factory.close();
		
	}
	
	public String PrimaryKeyGenerator Implements Serializable generate() {
		
	}

	
	
}
