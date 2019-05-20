package projet1;

public class array_two_dimention {

	
   public static void main(String[] args) {
	   int[][]numbers=new int[3][3];
	   numbers[0][0]=00;
	   numbers[2][2]=22;
	   numbers[1][1]=11;
	   
	   numbers[0][2]=02;
	   numbers[1][2]=12;
	   numbers[2][0]=20;
	   
	   for(int i=0;i<numbers.length;i++) {
		   for(int g=0;g<numbers.length;g++) {
			   if(i==g) {
			   System.out.println(numbers[i][g]);
			   System.out.println("\t"); 
		   }}
		   System.out.println("\n"); 
	   }
   }
}
