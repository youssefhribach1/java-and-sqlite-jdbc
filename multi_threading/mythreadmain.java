package multi_threading;

public class mythreadmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
        mythread t=new mythread("t1");
        mythread t2=new mythread("t2");
	     t.start();
	 
	     t2.start();
              
	     try {
			Thread.sleep(10000);
			t.isRunning=false;
			Thread.sleep(20000);
			t2.isRunning=false;
	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}

}
