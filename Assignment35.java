package java_online;

import java.util.Arrays;

public class Assignment35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="RADAR";
		String s1="RADAR";
		char[] c = s.toCharArray();
		char[] c1= s1.toCharArray();
		if(s.length()!=s1.length()){
			System.out.println("It's not an anagram by length");
			
		}
		else {
		
		boolean b = Arrays.equals(c, c1);
		if(b==true)
			System.out.println("It's an anagram");
		else
			System.out.println("It's not an anagram");
		}

	}

}
