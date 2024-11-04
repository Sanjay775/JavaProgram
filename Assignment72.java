package java_online;

import java.util.HashMap;
import java.util.Map;

public class Assignment72 {

	public static void main(String[] args) {
		Map<String, Integer> m1= new HashMap<String, Integer>();
		m1.put("sanju", 25);
		m1.put("Ranju", 27);
		m1.put("Manju", 33);
		m1.put("poori", 35);
		m1.put("Rathna", 30);
		
		System.out.println(m1.containsValue(35));
		System.out.println(m1.get("poori"));
		
		
		

	}

}
