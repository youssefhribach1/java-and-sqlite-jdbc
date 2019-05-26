package multi_threading;

public class synchromain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		synchronize t=new synchronize();
		synchronize t2=new synchronize();
	     t.start();
	     try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     t2.start();
	  
	     
	}}