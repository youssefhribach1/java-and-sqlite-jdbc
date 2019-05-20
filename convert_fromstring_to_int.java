package projet1;
import  java.util.Scanner;
public class convert_fromstring_to_int {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String phone="5.5";
		Double number=55.5;
		/* to convert from string to INTEGER using Integer.pârseInt*/
		/*number=Double.parseDouble(phone);*/
		
		phone=String.valueOf(number);
		System.out.println("you'r number is:"+phone);
		

	}

}
