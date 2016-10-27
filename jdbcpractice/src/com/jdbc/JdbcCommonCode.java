package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcCommonCode {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * 
	 */
	
	//static Statement stmt=null;
	static Connection conn=null;
	public static Connection connector()
	{
    //Connection conn=null;
    //Statement stmt=null;
  
	System.out.println("Connecting to database...");
	 try {
		 try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 conn=DriverManager.getConnection(  
				 "jdbc:mysql://localhost:3306/test","root","10uq1a0451");
		 System.out.println("Connected database successfully...");
		 //stmt=conn.createStatement();
		 return conn;
		 
		
	}
	 
	 catch (SQLException e) 
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
