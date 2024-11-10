package basicsJava;

public class TryCatch {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub.
		try {
		throw new NullPointerException();
		}
		catch(NullPointerException e) {
			System.out.println("exception");
		}
		

	}

}
