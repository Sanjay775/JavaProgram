package java_online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Assignment64 {

	public static void main(String[] args) {
		List as=new ArrayList();
		as.add(15);
		as.add(12);
		as.add(35);
		as.add(64);
		Collections.sort(as);
		System.out.println(as);
		Iterator ite = as.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
