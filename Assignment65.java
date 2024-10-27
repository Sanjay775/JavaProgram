package java_online;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Assignment65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List as=new ArrayList();
		as.add(15);
		as.add(12);
		as.add(35);
		as.add(64);
		
		ListIterator ite = as.listIterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
