package projet1;
import  java.util.Scanner;
public class convert_fromstring_to_int {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phone="0684653644";
		int number;
		/* to convert from string to INTEGER using Integer.pârseInt*/
		number=Integer.parseInt(phone);
		System.out.println("you'r number is:"+number);
		

	}

}
