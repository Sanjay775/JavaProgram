package java_online;
class Human{
	Human(){
		System.out.println("Parent class constructor");
	}
}
public class Assignment17 extends Human{
	Assignment17(){
		super();
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment17();

	}

}

