package projet1;
import java.util.Scanner;
public class maths {
   static Scanner reader=new Scanner(System.in);
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("Enter the first number:");
       	int n1=reader.nextInt();
           System.out.println("Enter the second number:");
   		int n2=reader.nextInt();

		int result=n1+n2;
		System.out.println("result is:"+result);
		
	}

}
