package java_online;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Assignment60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
		c.add(10);
		c.add("sanju");
		c.add('s');
		c.add(42);
		
		System.out.println(c.contains(10));
		System.out.println(c.isEmpty());
		Collection c1=new ArrayList();
		c1.addAll(c);
		System.out.println(c1.equals(c));
		c1.add("as");
		System.out.println(c1.equals(c));
		c1.remove("as");
		System.out.println(c1.size());
		Iterator coll = c1.iterator();
	    while (coll.hasNext()) {
			System.out.println(coll.next());
			
		}

	}

}
