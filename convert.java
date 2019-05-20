package projet1;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int age=22;
      double salary=3500.79;
      String rate="4";
      boolean istrue=false;
      //convert to String
      String newage=String.valueOf(age);
      String newsalary=String.valueOf(salary);
      String new_istrue=String.valueOf(istrue);
      //convert to Integer
      int newsrate_2=Integer.parseInt(rate);
      int new_istrue_2=istrue?1:0;
      //this action named : casting
      int newsalary_2=(int)salary;
      //convert to Double
      double newrate_3=Double.parseDouble(rate);
    //this action named : casting
      double newage_3=(double)age;
      
      
      System.out.println(new_istrue_2);
	}

}
