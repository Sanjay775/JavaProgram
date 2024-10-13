package java_online;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int [4];
		System.out.println("enter first value of array");
		a[0]=sc.nextInt();
		System.out.println("enter 2nd value of array");
		a[1]=sc.nextInt();
		System.out.println("enter 3rd value of array");
		a[2]=sc.nextInt();
		System.out.println("enter 4th value of array");
		a[3]=sc.nextInt();
		sc.close();
		
		System.out.println(Arrays.toString(a));

	}

}
