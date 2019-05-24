package com.db1;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;
public class updating_data {

	public static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String userN;
       String passW;
       Connection cn=null;
       Statement stmt=null;
    System.out.println("Enter the Username: ");
    userN=reader.nextLine();
    System.out.println("Enter new Password: ");
    passW=reader.nextLine();
  try {
	   Class.forName("org.sqlite.JDBC");
	   cn=DriverManager.getConnection("jdbc:sqlite:db1.db");
	   String query="Update admins SET password='"+passW+"' where  username='"+userN+"' ";
	   stmt=cn.createStatement();
	   stmt.executeUpdate(query);
	   System.out.println("data update successefully :) ");
	   
  }catch(Exception ex){
	  System.out.println("Error : "+ex.getMessage());
  }
  finally {
	   System.out.println("thank u for using our app :) ");
  }
	}

}
