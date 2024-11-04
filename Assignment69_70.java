package java_online;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Assignment69_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("sanju", 25);
		m1.put("Ranju", 27);
		m1.put("Manju", 33);
		m1.put("poori", 35);
		m1.put("Rathna", 30);
		m1.put("poori", 32);
		
		for(String k1:m1.keySet()) {
			System.out.println(k1);
		}
		for(Integer v1:m1.values()) {
			System.out.println(v1);
		}
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
