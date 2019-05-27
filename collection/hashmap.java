package collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Youssef");
		map.put(2,"Adil");
		map.put(3,"Jana");
		map.put(4,"Mohamed");
		
		//System.out.println(map.get(1));
		//System.out.println(map.get(2));
		
		for(Entry<Integer, String> m: map.entrySet()) {
			System.out.println("key :"+m.getKey()+" "+"value :"+m.getValue());
		}
	}

}
