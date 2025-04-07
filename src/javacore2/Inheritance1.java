package javacore2;

class X1{
	private int a;
	public X1() {
		a=10;
	}
	public void task1(){
		System.out.println("From class X Task1 Method: "+ a*a*a);
	}
}


class Y1{
	private int b;
	public Y1() {
		b=15;
	}
	
	public void task2(){
		System.out.println("From class Y Task2 Method: "+ (b+b));
	}
}


class Z{
	private int c;
	public Z(){
		c=20;
	}
	
	public void task3(){
		//Has_A relationship
		X1 obj1 = new X1();
		obj1.task1();
		
		Y1 obj2 = new Y1();
		obj2.task2();
		System.out.println("From class C Task3 Method: "+ (c*c));
	}
}


public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Z obj3 = new Z();
         obj3.task3();
		
	}

}
