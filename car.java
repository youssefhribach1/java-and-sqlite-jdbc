package projet1;

public class car {
        String color;
        String type;
        
        {
        	color="black";
        }
        
      void start() {
    	System.out.println("Get Started!");  
       }
      
      void printdescription() {
    	System.out.println("This is a " + color +" " +type);  
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car mycar =new car();
		
		mycar.color="Green";
		mycar.type="Ferari";
		
		mycar.printdescription();

	}

}
