package javacore2;

import java.util.Scanner;

class Const{
	private int id;
	private String Name;
	private int age;
	private String Branch;
	private static String Collage="M.S.Bidve Engineering collage Latur";


public Const() {
	System.out.println("Enter the Information");
	System.out.println("*******************");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the id:");
	id = sc.nextInt();
	System.out.println("Enter the Name:");
	Name = sc.next();
	System.out.println("Enter the age:");
	age = sc.nextInt();
	System.out.println("Enter the Branch:");
	Branch = sc.next();
	System.out.println("*************");
	
}
void Task1() {
	
	System.out.println(id);
	System.out.println(Name);
	System.out.println(age);
	System.out.println(Branch);
	System.out.println(Collage);
	
}

}



public class OOPsConst2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Const obj1 = new Const();
		  obj1.Task1();
	}

}
