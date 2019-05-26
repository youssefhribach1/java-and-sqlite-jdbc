package multi_threading;

public class myrunnablemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myrunnable r1=new myrunnable("t1");
        Thread tr=new Thread(r1);
        tr.start();
        try {
			Thread.sleep(5000);
			r1.istrue=false;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
