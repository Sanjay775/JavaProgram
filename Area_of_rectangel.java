package java_online;

import java.util.Scanner;

public class Area_of_rectangel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	Scanner sc=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of rectangel");
		int length=sc.nextInt();
		System.out.println("Enter width of rectangel");
		int width=sc.nextInt();
		int Roc=length*width;
		sc.close();
		System.out.println("Area of traingel  "+ Roc);
		

	}

}
