package javacore2;

abstract class Manager{
	private int a=10;
	
	public void task1() {
		System.out.println("Sum: "+(a+a));
	}
	
	abstract void task2() ;   // abstract empty method
		
	}
	
	class Development2 extends Manager{
		private int a=5;
		
		public void  task1() {
			System.out.println("Square"+(a*a)); // loosely coupled Development
		}
		public void task2() {
			System.out.println("Cube:"+(a*a*a)); // tightly coupled Development
		}
		
	}
	

public class AbstractOverride {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manager m1 = new Manager();  // empty class(abstact class)
		//m1.task2();
		System.out.println("************");
		
		//override Syntax
		
		Manager m1 = new Development2();
		m1.task1();
		System.out.println("************");
		m1.task2();

	}

}
