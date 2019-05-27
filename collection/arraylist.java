package collection;

import java.util.ArrayList;

public class arraylist {
//remeber don't use arraylist to update or delete data
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>ar=new ArrayList<String>();
        ar.add("developper");
        ar.add("tester");
        ar.add("manager");
        System.out.println(ar.get(2));
        ar.remove(1);
        for(String x:ar) {
         //   ar.remove(1);
        	System.out.println(x);
        }
        
        //arraylist class
      ArrayList<employee> emp=new ArrayList<employee>();
      emp.add(new employee("Youssef Hribach",22));
      emp.add(new employee("Adil Hribach",22));
      emp.add(new employee("Malak Hribach",22));
      emp.add(new employee("Mohamed Hribach",22));
      
      for(employee x:emp) {
    	  System.out.println(x.name+" "+x.age);
      }
	}  
	
	static class  employee{
		String name;
		int age;
		public employee(String name,int age) {
			this.name=name;
			this.age=age;
		}
	}

}
