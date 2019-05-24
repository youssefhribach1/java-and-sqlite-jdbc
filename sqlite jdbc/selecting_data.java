package com.db1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class selecting_data  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection cn=null;
		 Statement stmt = null;
	   	 
		try {
			   Class.forName("org.sqlite.JDBC");
			   cn=DriverManager.getConnection("jdbc:sqlite:db1.db");
			   System.out.println("connect successfully");
			   String query="SELECT * FROM admins";
			     stmt=cn.createStatement();
                ResultSet rs=stmt.executeQuery(query);
                 
                while(rs.next()) {
                	String fn=rs.getString("username");
                	String pw=rs.getString("password");
                	
                	System.out.println("Username :"+fn+" "+"Password :"+pw);
                }
                
			   cn.close();
			   stmt.close();
			   rs.close();
			   
		 }catch( Exception ex) {
			   System.out.println("cannot connect "+ex.getMessage());
			   System.exit(0);
		    }
		
	}

}
