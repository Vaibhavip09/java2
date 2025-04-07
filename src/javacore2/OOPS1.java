package javacore2;

class AccessModifer{
	private byte a=10;
	public int b=20;
	protected float c = (float) 100.00;
	private char d='S';
	private boolean e=false;
	private String f="Hello";
	
	
	void task1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
	
}


public class OOPS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifer am = new AccessModifer();
		/*System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		System.out.println(am.d);
		System.out.println(am.e);
		System.out.println(am.f);*/
		am.task1();
	}

}
