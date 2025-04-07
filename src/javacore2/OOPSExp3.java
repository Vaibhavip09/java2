package javacore2;


class A{
	int a=10;
	void Test1() {	
	System.out.println("From class A:"+(a*a));
	}
}

class B{
	int b=3;
	void Test2() {	
	System.out.println("From class B:"+(b*b*b));
	}
}

class C{
	int c=5;
	void Test3() {	
	System.out.println("From class C:"+(c+c));
	}
}



public class OOPSExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		A obj = new A();
		obj.Test1();
		
		B obj2 = new B();
		obj2.Test2();
		
		C obj3 = new C();
		obj3.Test3();
	}

}
