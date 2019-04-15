package scanner;
import java.util.Scanner;
public class scanner {

	static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		String name;
		int age;
		
		System.out.println("enter your name please :");
		name=reader.nextLine();
		
		System.out.println("enter your age please :");
		age=reader.nextInt();
		
		System.out.println(" your name is:"+name+" and your age is:"+age +"years old");
	}

}
