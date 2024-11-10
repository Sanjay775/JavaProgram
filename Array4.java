package basicsJava;

import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[4];
		a[0]=21;
		a[1]=95;
		a[2]=93;
		a[3]=31;
		int b[] = new int[4];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		

	}

}
