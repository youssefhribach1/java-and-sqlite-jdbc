package projet1;

public class fun_overload {

	
	
	float sum(float n1, float n2) {
		float result=n1-n2;
		return result;
	}
	
	float sum(float n1, float n2,float n3) {
		float result=n1-n2+n3;
		return result;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

float res=new fun_overload().sum(10,5);
float res2=new fun_overload().sum(10,5,2);

   System.out.println("result is :" +res2);
	}

}
