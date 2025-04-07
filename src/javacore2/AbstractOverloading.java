package javacore2;


class Development{
	private int a,b,c;
	
	public Development() {
		a=7;
		b=5;
	}
	public Development(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public Development(int a,int b,int c) {    //constructor Overloading
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void task1() {
		System.out.println("Sum of No:"+(a+b));
	}
	public void task2() {
		System.out.println("Multiple of No:"+(a*b*c));
	}
	
	
}

class NewProject extends Development{
	
	
	
	public NewProject(int a,int b) {   //super keyword is used for Super Class Referance
		super(a,b);
	}
	
	public NewProject(int a,int b,int c) {
		super(a,b,c);
	}
	
}


public class AbstractOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewProject np1 = new NewProject(10,20);
		np1.task1();
		
		System.out.println("**********************");
		NewProject np2 = new NewProject(2,5,9);
		np2.task2();

	}

}
