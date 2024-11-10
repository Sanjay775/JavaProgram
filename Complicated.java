package basicsJava;

import java.util.Arrays;

public class Complicated {
	static int a=0;
	static int b=0;
	static int c=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sanju is no 1@ in anygame";
		
		char[] c1 = s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<s1.length();i++) {
			boolean b1=Character.isAlphabetic(c1[i]);
			if(b1==true) {
				a++;
			}
			boolean b2=Character.isDigit(c1[i]);
			if(b2==true) {
				b++;
			}
			boolean b3=Character.isWhitespace(c1[i]);
			if(b3==true) {
				c++;
			}
		}
		System.out.println("no, of alphabets"+ a);
		System.out.println("no, of digits"+ b);
		System.out.println("no od spaces"+c);
		System.out.println(s1.length()-(a+b+c));
		

	}

}
