package java_online;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(25, 50);
		addition(50.6, 32);
		addition(99);
		
	}
	static void addition(int a, int b) {
		int sum=a+b;
		System.out.println("The addition of above ="+sum);
	}
	static void addition(double a, int b) {
		double sum=a-b;
		System.out.println("The subtraction of above ="+sum);
	}

	static void addition(int a) {
		int b=3;
		int sum=a/b;
		System.out.println("The division of above ="+sum);
	}

}


