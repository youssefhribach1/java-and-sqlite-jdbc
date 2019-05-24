package com.db1;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.util.Scanner;

public class deleting_data {
public static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Statement stmt=null;
Connection cn=null;
String userN;
System.out.println("Enter the username u want delete : ");
userN=reader.nextLine();
try {
Class.forName("org.sqlite.JDBC");
cn=DriverManager.getConnection("jdbc:sqlite:db1.db");
String query="DELETE FROM admins WHERE username='"+userN+"' ";
stmt=cn.createStatement();
stmt.executeUpdate(query);
System.out.println("delete successfully : )");
}catch(Exception ex) {
System.out.println("Error :"+ex.getMessage());
}finally {
	System.out.println("thank u for using our app : )");
}
	}

}
