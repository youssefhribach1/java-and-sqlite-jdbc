package projet1;

public class dob_inheritance extends inheritance{

	//Override Method just a test
	   @Override
       public String getlastname(String lastname){
      		return lastname;
      	}
	   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         inheritance dob1=new inheritance();
         dob1.dob=1997;
         
       //  dob1.firsname="Youssef";
       //  dob1.lastname="Hribach";
         
         dob1.getfirstname("Youssef");
         dob1.getlastname("Hribach");
         
         dob1.getage();
         
      

         
         System.out.println("Informations personnel  :");
         System.out.println("\t");
         System.out.println("NOM : "+  dob1.getfirstname("Youssef"));
         System.out.println("PRENOM : "+   dob1.getlastname("Hribach"));
         System.out.println("AGE : "+dob1.getage());
	}

}
