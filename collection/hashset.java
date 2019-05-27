package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String>hs=new HashSet<String>();
    hs.add("youssef");
    hs.add("mohamed");
    hs.add("youssef");
    hs.add("youssef");
    
    Iterator<String>it=hs.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
	}

}
