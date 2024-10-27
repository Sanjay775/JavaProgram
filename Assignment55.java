package java_online;

class Specifier{
	
	public static void add() {
		System.out.println("add method");
	}
	private static void sub() {
		System.out.println("sub method");
	}
	 static void mul() {
		System.out.println("mul method");
	}
	 protected static void div() {
			System.out.println("div method");
		}

}

public class Assignment55  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Specifier.add();
		Specifier.div();
		Specifier.mul();
		

	}

}
