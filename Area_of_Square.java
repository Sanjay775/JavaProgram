package java_online;

import java.util.Scanner;

public class Area_of_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of traingel");
		int side=sc.nextInt();
	    int area=side*side;
		sc.close();
		System.out.println("Area of square  "+ area );


	}

}
