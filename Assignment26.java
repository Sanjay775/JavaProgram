package java_online;

public class Assignment26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="RADAR";
		String Reverse="";
		for(int i=a.length()-1;i>=0;i--) {
			Reverse=Reverse+a.charAt(i);
			
		}
		if(a.equals(Reverse)) {
			System.out.println("pallindrum");
		}
		else {
			System.out.println("not a pallindrum");
		}

	}

}
