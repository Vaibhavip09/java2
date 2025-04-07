package javacore2;


interface I1{
	void task1();
	void task2();
	
}

interface I2 { // extends I1{
	void task3();
	void task4();
	
}

class Devlop implements I1,I2{ // I2
	 public void task1() {
	System.out.println("Task1 from Interface I1");	
	}
	public void task2() {
		System.out.println("Task2 from Interface I1");		
	}
	 public void task3() {
			System.out.println("Task3 from Interface I2");	
			}
			public void task4() {
				System.out.println("Task4 from Interface I2");		
			}

}
public class InterFaceProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Devlop obj3 = new Devlop();
		// obj3.taks1();
		//obj3.taks2();
		//obj3.taks3();
		//obj3.taks4();
		
		I1 obj1 = new Devlop();
		obj1.task1();
		obj1.task2();
		
		I2 obj2 = new Devlop();
		obj2.task3();
		obj2.task4();
		
	}

}
