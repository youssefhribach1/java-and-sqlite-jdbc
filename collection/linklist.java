package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkedList<String>ls1=new LinkedList<String>();
         ls1.add("Youssef");
         ls1.add("Adil");
         ls1.add("Mohamed");
         ls1.add("Malak");
         
         // print linked list using for loop
        /* for(String x:ls1) {
        	 System.out.println(x);
         }*/
         
         //print linked list using Iterator
         Iterator<String>it1=ls1.iterator();
         while(it1.hasNext()) {
        	 System.out.println(it1.next());
         }
	}

}
