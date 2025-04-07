package javacore2;

class Devlop3{
	int a=12;
	static String b ="M.S.bidve";
	final float c =5555.98f;
	final static int d = 92; 
	
	final static void FinalMt() {
		//System.out.println("Normal Method:"+a);
		System.out.println("Static Method:"+b);
		//System.out.println("Final Method:"+c);
		System.out.println("Final Static Method:"+d);
	}
	
}

public class FinalStaticMethod {
     static int i =5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Devlop3.FinalMt();
		
		System.out.println(i);
		
	}

}
