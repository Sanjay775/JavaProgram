package basicsJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Sanju";
		String Reverse="";
		for(int i=a.length()-1;i>=0;i--) {
			Reverse=Reverse+a.charAt(i);
			
		}
		System.out.println(Reverse);
		

	}

}
