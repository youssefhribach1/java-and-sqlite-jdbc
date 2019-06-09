package java8;

public class playmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      playox1 px1=(x,y)->{
    	System.out.println("Lambda expression works fine :-) ");  
    	System.out.println(x*y);
      };
      px1.play(5,5);
      
      play1 p1=new play1();
      p1.play(5,2);
	}

static	class play1 implements playox1{


		@Override
		public void play(int number1, int number2) {
			// TODO Auto-generated method stub
			System.out.println(number1*number2);
		}
		
	}
}
