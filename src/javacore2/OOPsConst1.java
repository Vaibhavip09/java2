package javacore2;

class Constructors{
	private int a,b,c;
	private String x,y;
	private char ch;
	
	
	public Constructors() {
		 a=10;
		
	}
	
	/*public Constructors(int x,int y,int z) {
		 a=x;
		 b=y;
		 c=z;
		
	}*/
	
	public Constructors(int a,int b,int c) {
		 this.a=a;
		 this.b=b;
		 this.c=c;
		
	}
	
	public Constructors(String x, String y) {
		this.x = x;
		this.y=y;
		
	}
	
	public void task1(){
		System.out.println(a);
	}
	
	public void task2(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(ch);
		System.out.println(c);
		
		
	}
	public void task3(){
		System.out.println(x);
		System.out.println(y);
		
	}
	
}




public class OOPsConst1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructors obj1 = new Constructors();
		obj1.task1();
		System.out.println("*********************");
		
		Constructors obj2 = new Constructors(10,20,30);
		obj2.task2();
		
		System.out.println("*********************");
		
		Constructors obj3 = new Constructors("Hii","Hallo");
		obj3.task3();

	}

}
