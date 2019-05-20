package projet1;

public class constractor {

 String type;
 int model;
 double milesdrive;
 double price;
 String owner;
 
 
public constractor(String t,int m,double md,double p,String ow) {
	 
	 this.type=t;
	 this.model=m;
	 this.milesdrive=md;
	 this.price=p;
	 this.owner=ow;

   }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub  
	constractor c1=new constractor("Dacia",2016,156000,40000,"Youssef Hribach");
	System.out.println("Car Informations :");
	System.out.println("\t");
	System.out.println("Type :"+c1.type);
	System.out.println("Model :"+c1.model);
	System.out.println("Miles Drive :"+c1.milesdrive);
	System.out.println("Price :"+c1.price);
	System.out.println("Owner :"+c1.owner);

	}

}
