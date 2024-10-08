package java_online;
abstract class Name{
	abstract void method();
	
}
public class Assignment22 extends Name {
	void method() {
		System.out.println("Concrete method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment22 a1=new Assignment22();
		a1.method();

	}

}
