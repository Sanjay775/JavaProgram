package basicsJava;

public class Method_Overloading {

	public static void main(String[] args) {
		addition();
		addition(17,38.4);
		Method_Overloading o=new Method_Overloading();
		o.addition("sanju", 10);
	}
	static void addition() {
		int a=12;
		int b=18;
		System.out.println(a+b);
	}
	static void addition(int a, double b) {
		System.out.println(a+b);
	}
	void addition(String s, int a) {
		System.out.println(s+a);
	}

}
