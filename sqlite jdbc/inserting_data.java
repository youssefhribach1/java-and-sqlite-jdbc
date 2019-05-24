package com.db1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class inserting_data {
public static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection cn=null;
		 Statement stmt = null;
	   	 String usern;
		 String passw;
		 System.out.println("add username :");
		 usern=reader.nextLine();
		 System.out.println("add password :");
		 passw=reader.nextLine();
		 
		try {
			   Class.forName("org.sqlite.JDBC");
			   cn=DriverManager.getConnection("jdbc:sqlite:db1.db");
			   System.out.println("connect successfully");
			   String query="INSERT INTO  admins(username,password) VALUES ('"+usern+"','"+passw+"') ";
			     stmt=cn.createStatement();
                 stmt.executeUpdate(query);
			   
		 }catch( Exception ex) {
			   System.out.println("cannot connect "+ex.getMessage());
			   System.exit(0);
		    }
		
	}

}
