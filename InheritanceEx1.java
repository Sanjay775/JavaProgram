package basicsJava;

public class InheritanceEx1 {
	static void add() {
		System.out.println("add");
		
	}
static void sub() {
		System.out.println("sub");
	}

}
class childClass extends InheritanceEx1
{
static void mul() {
		
	}
static void div() {
	
}
	public static void main(String[] args) {
		mul();
		div();
		add();
		sub();
	}
	
}