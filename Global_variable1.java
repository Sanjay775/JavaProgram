package basicsJava;

public class Global_variable1 {
	 int a=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=30;
		System.out.println(a);
		add();
		

	}
	static void add() {
		Global_variable1 g1=new Global_variable1();
		System.out.println(g1.a);
	}

}
