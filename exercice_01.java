package projet1;
import java.util.Scanner;
public class exercice_01 {
static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String date_of_birth;
         System.out.println("Enter plz your date of birth :");
         date_of_birth=reader.nextLine();
          
         int age=Integer.parseInt(date_of_birth);
         int toyears=2019-age;
         
         System.out.println("You age is :"+"("+toyears+")"+" years");
	}

}
