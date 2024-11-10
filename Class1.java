package basicsJava;
abstract class Class3{
	abstract void method1();
	abstract void method2();
	void method3() {
		System.out.println("done");
	}
}

abstract class Class2 extends Class3{
	abstract void method4();
	abstract void method5();
}

public class Class1 extends Class2 {


	void method4() {
		// TODO Auto-generated method stub
		System.out.println("parent class");
	}


	void method5() {
		// TODO Auto-generated method stub
		System.out.println("parent class 5");
	}

	
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("parent class 1");
	}

	
	void method2() {
		// TODO Auto-generated method stub
		System.out.println("parent class 2");
	}
	public static void main(String[] args) {
		Class1 c1=new Class1();
		c1.method2();
	}
	

}
