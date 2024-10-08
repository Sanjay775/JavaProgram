package java_online;

public class Assignment19 {
	Assignment19(int i){
		this("sa");
		System.out.println("1st constructor");
	}
	Assignment19(){
		this(20);
		System.out.println("2nd constructor");
	}
	Assignment19(String s){
		System.out.println("3rd constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment19();

	}

}
