package java_online;

public class Assignment46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My name is Sanjay";
		boolean b = s.matches("(.*)y");
		if(b==true) {
			System.out.println("String ends with y");
		}
		else 
			System.out.println("String not ends with y");

	}

}
