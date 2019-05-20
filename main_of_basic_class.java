package projet1;

public class main_of_basic_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		basic_class car=new basic_class();
		car.Type="Dacia";
		car.model=2016;
		car.price=100000;
		car.milesdrive=79000;
		car.owner="Youssef Hribach";
		
		System.out.println("The Car Information : ");
		System.out.println("\t");
		System.out.println("The Type    : "+car.Type);
		System.out.println("The Model   : "+car.model);
		System.out.println("Miles Drive : "+car.milesdrive);
		System.out.println("The Price   : "+car.getprice());
		System.out.println("The Owner   : "+car.owner);
	}

}
