package java_online;

 class Inherit 
{
	static void add() {
		System.out.println(10+20);
	}
}
 public class SingelInheritance extends Inherit
 {
	 static void sub() {
		 System.out.println(20-10);
	 }
  public static void main(String[] args) {
	add();
	sub();
}
}
