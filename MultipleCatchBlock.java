package basicsJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();		
		int [] a=new int[size];
		 a[0]=2;
		a[1]=32;
		}
		
		catch(NegativeArraySizeException e) {
			System.out.println("NegativeArraySizeException is handled");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(InputMismatchException s) {
			System.out.println("InputMismatchException hadled");
		}
		
		

	}

}
