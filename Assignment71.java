package java_online;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("Apple", 250);
		m1.put("Mango", 270);
		m1.put("Butter fruit", 330);
		m1.put("Banana", 350);
		m1.put("Orange", 300);
		m1.put("pomogranate", 320);
		
		for(String k1:m1.keySet()) {
			System.out.println(k1);
		}
		for(Integer v1:m1.values()) {
			System.out.println(v1);
		}
		m1.remove("Mango", 270);
		for(Entry<String, Integer> e1:m1.entrySet()) {
			System.out.println(e1);
		}
		  Iterator<Entry<String, Integer>> i1 = m1.entrySet().iterator();
		  System.out.println("using Iterator");
		  while(i1.hasNext()) {
			  System.out.println(i1.next());
		  }

	}

}
