package basicsJava; //  check whether particular value is present or not

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= new int[4];
		a[0]= 13;
		a[1]=34;
		a[2]= 8;
		a[3]=38;
		
		int result = 38;
		
		for(int i=0; i<a.length;i++) {
			if(a[i] == result) {
				System.out.println(a[i] + " It's part of array in index of " + i);
			}
		}

	}

}
