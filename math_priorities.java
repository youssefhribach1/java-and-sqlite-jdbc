package projet1;
import java.util.Scanner;
public class math_priorities {

	 static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		int n2=5;
		int n3=2;
		// int result=(n1+n2)*n3;
		// int result=n1+n2*n3;
		// int result=n1+n2*n3/3;
		//int result=(n1+n2)*n3/3;
		//int result=(n1+n2*n3)/3;
		int result=((n1+n2)*n3)/3;
		System.out.println("result is :"+result);
		

	}

}
