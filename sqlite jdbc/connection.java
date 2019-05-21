package com.db1;
import java.sql.*;
public class connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Connection cn=null;
 try {
	   Class.forName("org.sqlite.JDBC");
	   cn=DriverManager.getConnection("jdbc:sqlite:db1.db");
	   System.out.println("connect successfully");
 }catch( Exception ex) {
	   System.out.println("cannot connect "+ex.getMessage());
	   System.exit(0);
 }
	}

}
