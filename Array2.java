package basicsJava;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {32,48,94,023};
		int b[] = new int[4];
		for(int i=0;i<a.length;i++) {
			b[(a.length-1)-i]=a[i];
		
	
		}
		/*for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			b[(a.length-1)-i]=a[i];
		
	
		}*/
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		

	}

}
