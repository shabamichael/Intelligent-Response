package com.intelligent.response.db.operations;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.intelligent.response.Bean.POJO.HospitalBean;

public class HospitalConnectionOperations {

	HospitalBean hospital = new HospitalBean();

	public void setHospitalDetails() {

		hospital.setHospitalID(321);
		hospital.setHospitalName("Idorinyin Hospital");
		hospital.setEmail("id@shaba.com");
		hospital.setPhoneNo("0717424906");
		hospital.setRegNo("9GS560");
		hospital.setStreet("082 Vodacom Road");
		hospital.setSurburb("Midrand");
		hospital.setProvince("Gauteng");

		System.out.println("About to commit transaction");

		Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(HospitalBean.class);

		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();

		session.save(hospital);

		Transaction tx = session.beginTransaction();
		tx.commit();
		System.out.println("Transaction successfully commited to the database!!!");
		System.out.println(hospital.toString());
		factory.close();
	}

	/*
	 * public List<HospitalBean> getHospitals(){
	 * 
	 * 
	 * }
	 */

	public HospitalBean getHospitalDetails() {
		HospitalBean hospital = null;
		return hospital;

	}

}
