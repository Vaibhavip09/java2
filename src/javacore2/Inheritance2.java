package javacore2;

import java.util.Scanner;

class S{
	private int x,y;
	
	public S(int x,int y) {
		this.x=x;
		this.y=y;
		 
	}
	public void task1() {
		

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Values");
		 System.out.println("******************");
		 System.out.println("Enter Value of X:");
		      x =sc.nextInt();
		      System.out.println("Enter Value of Y:");
		      y =sc.nextInt();    
		
		
		System.out.println("Value of X is:"+x);
		System.out.println("Value of Y is:"+y);
		System.out.println(x*y);
		System.out.println();
	}
}


class T extends S{
	
	private int a,b;
	
		public T(int x, int y){	
			
		super(x, y);
		}		
	  
	
	public void task2() {
		Scanner s = new Scanner(System.in);
		 System.out.println("Enter Values");
		 System.out.println("******************");
		 System.out.println("Enter Value of A:");
		      a =s.nextInt();
		  System.out.println("Enter Value of B:");
		      b =s.nextInt();   
		
		
		
		System.out.println("Value of A is:"+a);
		System.out.println("Value of B is:"+b);
		System.out.println(a/b);
	}
}



public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //IS_A relationship
		T obj1 = new T(0, 0);
		obj1.task1();
		obj1.task2();
	}

}
