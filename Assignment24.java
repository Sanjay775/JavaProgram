package java_online;
interface First{
	void method1();
}
interface second{
	void method2();
}
public class Assignment24 implements First, second {
	public static void main(String[] args) {
		Assignment24 a1= new Assignment24();
		a1.method1();
		a1.method2();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Second interface");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("First interface");
		
	}

}
