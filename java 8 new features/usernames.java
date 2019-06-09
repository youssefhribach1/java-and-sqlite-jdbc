package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class usernames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<predicaterules>users=new ArrayList<predicaterules>();
   users.add(new predicaterules("Youssef","123"));
   users.add(new predicaterules("Essa","5555r"));
   users.add(new predicaterules("Mohamed","2589a"));
   users.add(new predicaterules("Lina","0010204"));
	
  // for each
    /*	for(login s : users) {
		System.out.println(s.Username+" "+s.Password);
	}*/
   
   Predicate<predicaterules> pre=(p) -> p.isweek()==true;
   
   Iterator<predicaterules>i=users.iterator();
   while(i.hasNext()) {
		System.out.println(i.next().Username+" "+i.next().Password);
   }
	}
}
