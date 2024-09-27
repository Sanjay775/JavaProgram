package java_online;

import java.util.Scanner;

public class Circumference_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int radius=sc.nextInt();
		System.out.println("Enter pi value");
		double pi=sc.nextDouble();
		double Coc=2*pi*radius;
		sc.close();
		System.out.println("Circumference of circle  "+ Coc);


	}

}
