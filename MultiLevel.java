package java_online;
class A{
	static void add1() {
		System.out.println("class A executed");
	}
}
class B extends A{
	static void add2() {
		System.out.println("class B executed");
	}
}
class c extends B{
	static void add3() {
		System.out.println("class C executed");
	}
}
public class MultiLevel extends c {
	static void add4() {
		System.out.println("class Multilevel executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add1();
		add2();
		add3();
		add4();
		

	}

}
