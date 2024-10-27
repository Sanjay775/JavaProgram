package java_online;

import java.util.Scanner;

public class Assignment58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter operation u need to perform");
		String input=sc.next();
		
		switch(input) {
		case "add":
			System.out.println(a+b);
			break;
		case "sub":
			System.out.println(a-b);
			break;
		case "mul":
			System.out.println(a*b);
			break;
		default:
			System.out.println(a/b);
		
		}

	}

}
