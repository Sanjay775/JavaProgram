package basicsJava;

import java.util.Arrays;

public class Assignment32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,45,63,72};
		int [] b= {1,45,63,72};
		
		boolean bi = Arrays.equals(a, b);
		if(bi == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays  not equal");

	}

}
