package java8;


public class java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//myrunnable2 myr1=new myrunnable2();
	Runnable r=()->{
		System.out.println("Thread is work :)- ");
	       };
	Thread t=new Thread(r);
	t.start();
	}
}


	
