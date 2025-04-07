package javacore2;

class X{
	int l=45;
	int b=20;
	void Task1() {
		System.out.println("From class X Area is:"+(l*b));
	}
}

class Y{
	int m=20;
	int n=20;
	void Task2() {
		int p =2*(m+n); 
		System.out.println("From class Y Area is:"+p);
	}
}


public class OOPSExp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      X obj1 = new X();
      obj1.Task1();
      
      Y obj2 = new Y();
      obj2.Task2();
	}

}
