package tp01;

public class employers {
	
	int id_emp;
	String name_emp;
	String work_emp;
	String date_birth_emp;
     
	{
     id_emp=56;
	 name_emp=" ";
	 work_emp=" ";
     date_birth_emp=" ";
	}
	
	public employers() {
		
	}
	
    public employers(int i,String n,String w,String d) {
		setemp(i,n,w,d);
	}
	
    
    public String xyz() {
    	return id_emp+" "+name_emp+" "+work_emp+" "+date_birth_emp;
    }
    
    public void setemp(int i,String n,String w,String d) {
    	  
    	 id_emp=i;
    	 name_emp=n;
    	 work_emp=w;
         date_birth_emp=d;
         
    }
	
}
