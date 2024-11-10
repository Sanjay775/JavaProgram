package basicsJava;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
	}
	static void addition() {
		int a=100;
		int b=182;
		int sum=a+b;
		System.out.println("The addition of above ="+sum);
	}
	static void subtraction() {
		int a=100;
		int b=182;
		int sum=a-b;
		System.out.println("The subtraction of above ="+sum);
	}
	static void multiplication() {
		int a=100;
		int b=182;
		int sum=a*b;
		System.out.println("The multipication of above ="+sum);
	}
	static void division() {
		int a=100;
		int b=3;
		int sum=a/b;
		System.out.println("The division of above ="+sum);
	}
	static void modulus() {
		int a=100;
		int b=3;
		int sum=a%b;
		System.out.println("The modulus of above ="+sum);
	}

}
