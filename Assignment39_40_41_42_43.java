package java_online;

public class Assignment39_40_41_42_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I'm in Gurgaon";
		System.out.println(s.replace("Gurgaon", "Karnataka"));// Assignment 39
		
		String sa="kv no 2";
		System.out.println(sa.replaceAll("2", ""));// Assignment 40
		
		String g= "kv no 2";
		System.out.println(g.replaceAll("[a-z]", "")); // Assignment 41
		
		String h= "I am The Boss";
		System.out.println(h.replaceAll("[A-Z]", ""));// Assignment 42
		
		String sa1="My home is near to sector 2 Patna 4";
		System.out.println(sa1.replaceAll("[0-9]", "")); // Assignment 43
			

	}

}
