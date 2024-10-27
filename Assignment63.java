package java_online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Assignment63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> as=new ArrayList();
		as.add(15);
		as.add(12);
		as.add(35);
		as.add(64);
		Collections.sort(as);
		System.out.println(as);
		
		ListIterator<Integer> li = as.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
			
		}
		while (li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
	
	}

}
