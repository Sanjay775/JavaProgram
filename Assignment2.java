package java_online;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 as=new Assignment2();
		as.addition();
		as.subtraction();
		as.multiplication();
		as.division();
		as.modulus();
	}
	 void addition() {
		int a=100;
		int b=182;
		int sum=a+b;
		System.out.println("The addition of above ="+sum);
	}
	 void subtraction() {
		int a=100;
		int b=182;
		int sum=a-b;
		System.out.println("The subtraction of above ="+sum);
	}
	 void multiplication() {
		int a=100;
		int b=182;
		int sum=a*b;
		System.out.println("The multipication of above ="+sum);
	}
	 void division() {
		int a=100;
		int b=3;
		int sum=a/b;
		System.out.println("The division of above ="+sum);
	}
	 void modulus() {
		int a=100;
		int b=3;
		int sum=a%b;
		System.out.println("The modulus of above ="+sum);
	}

}


