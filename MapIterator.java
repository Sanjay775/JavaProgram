package basicsJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("sanju", 25);
		m1.put("Ranju", 27);
		m1.put("Manju", 33);
		m1.put("poori", 35);
		m1.put("Rathna", 30);
		m1.put("poori", 32);
		
		for(String ky:m1.keySet()) {
			System.out.println(ky);
		}
		for(Integer vl:m1.values()) {
			System.out.println(vl);
		}
		System.out.println(m1.entrySet());
		for(Entry<String, Integer> es:m1.entrySet()) {
			System.out.println(es);
		}
		System.out.println("using iterator");
		Iterator<Entry<String, Integer>> i1 = m1.entrySet().iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	

	}

}
