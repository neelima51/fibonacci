package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcinsertionstmt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Statement stmt=null;
		 try {
		 JdbcCommonCode.connector();
		//j.conn;
		 stmt=JdbcCommonCode.conn.createStatement();
		 String sql = "INSERT INTO student " +
                 "VALUES ('11','Zara', 'A', 'ece')";
		 stmt.executeUpdate(sql);
		} 
		 
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          System.out.println("Inserted records into the table...");

		

	}

}
