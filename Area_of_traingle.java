package java_online;

import java.util.Scanner;

public class Area_of_traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base of traingel");
		int base=sc.nextInt();
		System.out.println("Enterheight of traingel");
		int height=sc.nextInt();
		double Roc=0.5*base*height;
		sc.close();
		System.out.println("Area of traingel  "+ Roc);

	}

}
