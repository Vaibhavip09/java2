package javacore2;

class Develop1{
	int a=12;
	static String b ="M.S.bidve";
	final float c =5555.98f;
	final static int d = 92;


       static void StaticMt() {
    	//System.out.println("Normal varible:"+a);
    	System.out.println("Static varible:"+b);
    	//System.out.println("Final varible:"+c);
    	System.out.println("Final Static varible:"+d);
    }

}

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Develop1.StaticMt();
		
	}

}
