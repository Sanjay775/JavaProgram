package java_online;

interface same{
	void inter();
}

class sam{
	void childClass() {
		System.out.println("child class");
	}
	public void inter() {
		System.out.println("implements interface");
	}
}

public class Assignment53 extends sam implements same {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment53 as=new Assignment53();
		as.childClass();
		as.inter();

	}
	/*void childClass() {
		System.out.println("Main class");
	}*/
	

}
