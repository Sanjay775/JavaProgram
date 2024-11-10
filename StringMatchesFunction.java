package basicsJava;

public class StringMatchesFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="cat";
		System.out.println(name.matches("c(.*)"));// starts with
		
		System.out.println(name.matches("(.*)u"));//  ends with
		
		String f="manish";
		System.out.println(f.matches("(.*)n(.*)")); // contains
		System.out.println(f.matches("m(.*)h"));
		

	}

}
