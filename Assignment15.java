package java_online;

class A1{
	void add() {
		System.out.println(20+10);
	}
}

public class Assignment15 extends A1  {
    void sub() {
    	System.out.println(20-10);
    }
	public static void main(String[] args) {
		Assignment15 a1=new Assignment15();
		a1.sub();
		a1.add();

	}

}
