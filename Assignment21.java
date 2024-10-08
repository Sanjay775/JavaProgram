package java_online;
class reporting{
	reporting(){
		System.out.println("reporting");
	}
}
class screenshot extends reporting{
	screenshot(int i){
		super();
		System.out.println("Screenshot");
	}
}
class assign extends screenshot{
	assign(){
		super(1);
		System.out.println("assign");
	}
}
public class Assignment21 extends assign {
	Assignment21(){
		super();
		System.out.println("assignment21");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment21();

	}

}
