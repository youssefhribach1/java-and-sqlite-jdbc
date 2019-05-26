package multi_threading;

public class myrunnable implements Runnable{

	boolean istrue=true;
	String name;
	int count=0;
	public myrunnable(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	    while(istrue) {
	    	System.out.println(name+" "+count);
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
