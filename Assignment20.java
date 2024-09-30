package java_online;

class method1{
	static void add() {
		System.out.println("parent class");
	}
}
public class Assignment20 extends method1 {
	static void add() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();	
	}

}
