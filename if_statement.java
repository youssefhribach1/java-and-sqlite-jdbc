package projet1;
import java.util.Scanner;

public class if_statement {
  static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String fullname;
		System.out.println("Enter your Full name please:");
		fullname=reader.nextLine();
		System.out.println("Enter your age:");
		age=reader.nextInt();
		if(age>=18) {
			System.out.println("Welcome mr "+fullname);
		}
		else {
		     System.out.println("u'r not accepted mr: "+fullname);
		}
	}

}
