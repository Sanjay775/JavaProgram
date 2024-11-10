package basicsJava;

public class Basic_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    names();
	    names1();
	    names2(10,20);
		System.out.println("main method executed");
		int re=addition();
		System.out.println(re);

	}
	static void names() {
		System.out.println("name methos executed");
	}
	static void names1() {
		System.out.println("name1 methos executed");
	}
	static void names2(int a, int b) {
		System.out.println(a+b + "names2 method executed");
	}
	static void names3() {
		System.out.println("name 3 executed");
	}
	static int  addition() {
		int d=3*5;
		return d;
	}

}
