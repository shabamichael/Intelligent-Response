package com.intelligent.responseDAO;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {
	
	public static void DBConnection() {
		
		String url = "jdbc:mysql://localhost:3306/intelligent_response?useSSL=false";
		String username = "root";
		String password = "root";
		
		try {
			System.out.println("Connecting to the database " + url);
			
			Connection connection = 
					DriverManager.getConnection(url, username, password);
			
			System.out.println("Connection Successful!!!");
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
	}
	
	


}
