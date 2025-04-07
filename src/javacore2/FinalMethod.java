package javacore2;

class Devlop2{
	int a=12;
	static String b ="M.S.bidve";
	final float c =5555.98f;
	final static int d = 92; 
	
	final void FinalMt() {
		System.out.println("Normal Method:"+a);
		System.out.println("Static Method:"+b);
		System.out.println("Final Method:"+c);
		System.out.println("Final Static Method:"+d);
	}
	
}

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Devlop2 d1 = new Devlop2();
		d1.FinalMt();
			
		
		
	}

}
