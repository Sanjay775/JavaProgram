package java_online;

import java.util.Arrays;

public class Assignment36 {
	static int count_of_int;
	static int count_of_alpha;
	static int count_of_space;
	static int count_of_Special;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sanju born & 24 _";
		char[] c = s.toCharArray();
	
		
	System.out.println(Arrays.toString(c));
	for(int i=0;i<c.length;i++) {
		boolean a=Character.isAlphabetic(c[i]);
		if(a==true){
			count_of_alpha++;
		}
		boolean b = Character.isDigit(c[i]);
		if(b==true){
			count_of_int++;
		}
		boolean d = Character.isWhitespace(c[i]);
		if(d==true){
			count_of_space++;
		}
		
	}
	System.out.println("no pf alphabets "+ count_of_alpha);
	System.out.println("no pf numeric "+ count_of_int);
	System.out.println("no pf space "+ count_of_space);
	count_of_Special=c.length-(count_of_space+count_of_int+count_of_alpha);
	System.out.println("no of specia "+count_of_Special);
	}
	

}
