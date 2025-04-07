package javacore2;

class TypeOfMethod{
	
	// void method Non-Return
	void method(int a, int b) {
		System.out.println("Product of a and b is:"+a*b);
	}
	
	//Return Type Method
	int method2(int x,int y) {
		return x*y;
	}
}

public class NonReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// void method Non-Return
		TypeOfMethod t1 = new TypeOfMethod();
		t1.method(4, 5);
		
		//Return Type Method
		t1.method2(4, 5);
		
		System.out.println("Return From Method2: "+ t1.method2(4, 5));
		
		int res = t1.method2(7, 4);
		System.out.println(res*res);
		
	}

}
