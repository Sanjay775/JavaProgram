package basicsJava;

public class Operators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		if(a<b && a==10)
		{
			System.out.println("2");
		}
		
		if(a==b || a==10)
		{
			System.out.println("1");
		}
		if(!(a<b && a==10))
		{
			System.out.println("2");
		}
		
		if(a==b || a==10)
		{
			System.out.println("1");
		}
		if(!(a==b && a==10))
		{
			System.out.println("3");
		}

	}

}
