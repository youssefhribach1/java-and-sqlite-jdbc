package multi_threading;

public class deadlock {

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final	String passanger1="Youssef";
	final	String passanger2="lina";
		Thread t1=new Thread();
	     @Override
	     public void  run(){
		 synchronized (passanger1) {
			   System.out.println("bla bla 1");
			   Thread.sleep(2000);
		   }
		 synchronized (passanger2) {
			   System.out.println("bla bla 2");
		   }
	   }
	   
	};

}
