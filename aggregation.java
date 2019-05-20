package projet1;

public class aggregation {
  static aggregation2 a1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a1=new aggregation2();
		a1.firstname="Youssef";
		a1.lastname="Hribach";
		a1.dob=1997;
		
		System.out.println(a1.firstname+"\n"+a1.lastname+"\n"+a1.dob);
		
	}

	
	
}
