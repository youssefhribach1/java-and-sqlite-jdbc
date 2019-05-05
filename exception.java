package projet1;

public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]numbers= {1,2,3};
		 try {
		    System.out.println(numbers[10]);
		 }
		 catch(Exception e) {
			 System.out.println("u dont have this index plz check ur numbers index");
			 }
		 }

}
