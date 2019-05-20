package projet1;

public class basic_class {

	// Constactor in java
	public basic_class (String hi) {
		System.out.println("hi! i'am constractor");
	}
	
	String Type;
	int model;
	double price;
	double milesdrive;
	String owner;
	
	
	double getprice() {
	     double newprice=price-(milesdrive*100);
	     return newprice;
	}
    // Constactor in java
	public basic_class () {
		System.out.println("hi! i'am constractor");
	}
	
	
	
}
