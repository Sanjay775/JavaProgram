package java_online;

import java.util.HashSet;
import java.util.Set;

public class Assignment67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set se=new HashSet();
		se.add("String");
		se.add(32);
		se.add(6.7);
		se.add('b');
		System.out.println(se);
		se.remove(6.7);
		System.out.println(se);
		
		System.out.println(se.contains(32));
		System.out.println(se.isEmpty());
	}

}
