package java_online;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4 as=new Assignment4();
		as.addition(25, 50);
		as.addition(50.6, 32);
		as.addition(99);
		
	}
	 void addition(int a, int b) {
		int sum=a+b;
		System.out.println("The addition of above ="+sum);
	}
	 void addition(double a, int b) {
		double sum=a-b;
		System.out.println("The subtraction of above ="+sum);
	}

	 void addition(int a) {
		int b=3;
		int sum=a/b;
		System.out.println("The division of above ="+sum);
	}
}
