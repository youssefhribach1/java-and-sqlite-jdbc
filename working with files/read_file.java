package working_with_files;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class read_file {

	
	public static Scanner reader=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String nameoffile;
		System.out.println("Enter the name of file : ");
		nameoffile=reader.nextLine();
		
		/*
	
	 try {
	
			FileWriter fw=new FileWriter("test.txt");
			fw.write("hello i'am a file written by Youssef Hribach");
			fw.close();
		}catch(Exception ex) {
			System.out.println("error :"+ex.getMessage());
		}
		
 */
		
		
		readfile(nameoffile);
		
	}
	
	
	
	static void readfile(String r) {
		
		 try {
				FileReader fr=new FileReader(r);
				int c;
				while((c=fr.read())!=-1) {
					System.out.print((char)c);
				}
			}catch(Exception ex) {
				System.out.println("error :"+ex.getMessage());
			}
	}

}
