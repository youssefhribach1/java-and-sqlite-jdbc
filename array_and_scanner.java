package projet1;
import java.util.Scanner;
public class array_and_scanner {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[]jobs=new String[3];
		
		System.out.println("ENTER A JOB : ");
		for(int i=0;i<jobs.length;i++) 
			jobs[i]=reader.nextLine();
		
			System.out.println("PRINT JOBS 	:");
			for(int i=0;i<jobs.length;i++) {
				System.out.println(jobs[i]);
			}
		

	}

}
