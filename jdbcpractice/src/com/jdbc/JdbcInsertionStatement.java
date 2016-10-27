package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertionStatement {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
	 
		Statement stmt=null;
		Connection conn=null; 
	    try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	System.out.println("Connecting to database...");
	    	 conn=DriverManager.getConnection(  
	    	"jdbc:mysql://localhost:3306/test","root","10uq1a0451");  
	 	     System.out.println("Connected database successfully...");
	 	      
	 	     
	 	    stmt=conn.createStatement();  
			 String sql = "INSERT INTO student " +
	                 "VALUES ('7','Zara', 'A', 'ece')";
	          stmt.executeUpdate(sql);
	          System.out.println("Inserted records into the table...");

	          
			
		}
	    
	    
	    catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	

	}

}
