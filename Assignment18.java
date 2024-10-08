package java_online;
 class Human1{
	Human1(int i){
		System.out.println("Parent class constructor" + i);
	}
}
public class Assignment18 extends Human1{
	Assignment18(String s){
		super(10);
		System.out.println("Child class constructor "+ s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment18("sanju");

	}

}

