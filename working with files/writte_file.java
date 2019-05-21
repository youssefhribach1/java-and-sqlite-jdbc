package working_with_files;

import java.io.FileWriter;

public class writte_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*
		try {
			FileWriter fw=new FileWriter("test.txt");
			fw.write("hello i'am a file written by Youssef Hribach");
			fw.close();
		}catch(Exception ex) {
			System.out.println("error :"+ex.getMessage());
		}

		*/
		
		
		readfile("Hello World !");
	}

	
	
	
	static void readfile(String r) {
		
		 try {
				
				FileWriter fw=new FileWriter("test.txt");
				fw.write(r);
				fw.close();
			}catch(Exception ex) {
				System.out.println("error :"+ex.getMessage());
			}
	}
	
}
