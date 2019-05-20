package projet1;
import java.util.Scanner;
public class try_catch_finally {

	
	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		System.out.println("Enter a Number :");
		int number=reader.nextInt();
		System.out.println(number);
		}catch(Exception ex) {
			System.out.println("Error :"+ex.getMessage());
		}
		finally{
			System.out.println("thanks for using my app :)");
		}
		}

}
