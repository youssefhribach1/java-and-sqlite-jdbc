package multi_threading;

public class synchronize extends Thread {
 boolean isRunning=true;
  
	
   @Override
	public void run() {
	   desplay();
	   }
//synchronized
static  public void desplay() {
	   
			int count=0;
			while(count<10) {
				System.out.println(count);
				count++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			}
		}
  
}
