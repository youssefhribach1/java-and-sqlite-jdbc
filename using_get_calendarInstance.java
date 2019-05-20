package projet1;
import java.util.Calendar;
import java.util.Scanner;
public class using_get_calendarInstance {
   static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("YOUR DBO :");
	    int DBO=reader.nextInt();
	    int year=Calendar.getInstance().get(Calendar.YEAR);
	    int age=year-DBO;
	    if(age>18) {
	    System.out.println("Your age is :"+"{"+age+"}");
	}else {
	
	   System.out.println("YOU ARE TOO YOUNG ");
	}
	
	    }

}
