package java_online;

import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius=sc.nextInt();
		System.out.println("Enter pi value");
		double pi=sc.nextDouble();
		double Roc=pi*radius*radius;
		sc.close();
		System.out.println("Area of circle  "+ Roc);

	}

}
