package basicsJava;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="care";
		String s2="racet";
if(s1.length()!=s2.length()) {
			System.out.println("not a");
		}
else {
		char [] a= s1.toCharArray();
		char [] b= s2.toCharArray();
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		Arrays.sort(b);
		boolean c = Arrays.equals(a, b);
		if(c==true)
			System.out.println("anagram");	

	}
	}
}
/* 
 //2nd approach
		if(s1.length()!=s2.length()) {
			
		}
		else{ 		char [] a= s1.toCharArray();
		char [] b= s2.toCharArray();
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		Arrays.sort(b);
		boolean c = Arrays.equals(a, b);
		if(c==true)
			System.out.println("anagram");	}
			*/
