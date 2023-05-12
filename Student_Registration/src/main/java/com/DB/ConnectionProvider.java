package com.DB;

import java.sql.*;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection conn=null;
	
	public static Connection getConnection()
	{
		
//		
//		try {
//			if(conn==null)
//			{
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			String url="jdbc:mysql://localhost:3306/student_register";
//			String username="root";
//			String password="sam@databasemysql";
//			Connection conn=DriverManager.getConnection(url,username,password);
//			System.out.println("Database connected");
//			}
//			return conn;
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		return conn;
		 try {
		        // Load and register the MySQL JDBC driver
		        Class.forName("com.mysql.jdbc.Driver");
		        
		        // Create a connection to the database
		        String url = "jdbc:mysql://localhost:3306/student_register";
		        String username = "root";
		        String password = "sam@databasemysql";
		        conn = DriverManager.getConnection(url, username, password);
		        
		        // Do something with the connection...
		        System.out.println("Connected to database");
		    } catch (ClassNotFoundException e) {
		        System.out.println("JDBC driver not found");
		    } catch (SQLException e1) {
		        System.out.println("Error connecting to database: " + e1.getMessage());
		    } finally {
//		        try {
//		            if (conn != null) {
//		               // conn.close();
//		            }
//		        } catch (SQLException ex) {
//		            System.out.println("Error closing connection: " + ex.getMessage());
//		        }
		    }
//	}
		 return conn;
	}
}
