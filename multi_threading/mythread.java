package multi_threading;

public class mythread extends Thread {
 boolean isRunning=true;
 String name;
   public mythread (String name) {
	   this.name=name;
	   System.out.println(name);
   }
	@Override
	public void run() {
		int count=0;
		while(isRunning) {
			System.out.println(name+" : "+count);
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
