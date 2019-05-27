package collection;
import java.util.Iterator;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    TreeSet<String>hs=new TreeSet<String>();
    hs.add("youssef");
    hs.add("mohamed");
    hs.add("youssef");
    hs.add("youssef");
    hs.add("adil");
    
    Iterator<String>it=hs.iterator();
   while(it.hasNext()) {
	   System.out.println(it.next());
   }
	}

}
