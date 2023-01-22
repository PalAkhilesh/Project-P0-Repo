package com.tfms.connectivity;
import java.sql.Connection;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

 public class DatabaseConnection {
	 private static final Logger logger=Logger.getLogger(DatabaseConnection.class);
	
	 public static Connection CreateConnection() {
	
		 Connection con = null;
		 try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String user="root";
	            String pass="root123";
	            String url = "jdbc:mysql://localhost:3306/tfms";

	            con= DriverManager.getConnection(url,user,pass);
	            logger.info("Connection SuccessFull");

	        }
	        catch(Exception ex){
	            ex.printStackTrace();
	        }

	        return con;
	    }
	 
	 }
	 


