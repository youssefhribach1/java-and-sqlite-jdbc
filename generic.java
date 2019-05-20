package projet1;

public class generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[]a1= {"MOHAMED","ADIL","YOUSSEF","MALAK"};
       Integer[]a2= {1,2,3,5,4,8};
       Double[]a3= {1.2,3.54,100.2};
       
     /*  print(a1);
       print2(a2);
       print3(a3);*/
       
       print(a1);

       print(a2);

       print(a3);
	}

	
	static <x>void print(x[] ar){
		for(x s:ar) {
			System.out.println(s);
		
		}
	}
	 /*  static void print(String[] ar) {
	    	for(String s:ar) {
	    		System.out.println(s);
	    	}
	    }
	   
	   static void print2(int[] ar) {
	    	for(int s:ar) {
	    		System.out.println(s);
	    	}
	    }
	   
	   
	   static void print3(double[] ar) {
	    	for(double s:ar) {
	    		System.out.println(s);
	    	}
	    }*/
	   
}
