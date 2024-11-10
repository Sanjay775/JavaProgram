package basicsJava;

public class StringReplaceFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="kv no 2";
		String new1 = name.replace("k", "n");
		System.out.println(new1);
		
		String nam="Sanjay Gowda";
		String as = nam.replace("Gowda", "siddhu");
		System.out.println(as);
		
		System.out.println(name.replace("2", ""));// replace 2 by nothing
		
		//  replace entire alphabet by nothing
		String s="kakjs new 4";
		System.out.println(s.replaceAll("[a-z]", ""));
		
		String sa="JHKJJ new 4";// replace caps
		System.out.println(sa.replaceAll("[A-Z]", ""));
		
		String g= "gaj kjd lkd l";
		System.out.println(g.replaceAll(" ", "_"));
		

		
	}

}
