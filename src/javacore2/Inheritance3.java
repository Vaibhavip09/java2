package javacore2;

import java.util.Scanner;

class K1 {
	private int rollNo;
	private String Name;
	private String Branch;

	public K1(int rollNo, String Name, String Branch) {
		this.rollNo = rollNo;
		this.Name = Name;
		this.Branch = Branch;
	}

	public void Task1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values");
		System.out.println("******************");
		System.out.println("Enter Roll No:");
		rollNo = sc.nextInt();
		System.out.println("Enter Name:");
		Name = sc.next();
		System.out.println("Enter Branch:");
		Branch = sc.next();

		System.out.println("Roll No is:" + rollNo);
		System.out.println("Name is:" + Name);
		System.out.println("Branch is:" + Branch);
		System.out.println();
	}
}

class R1 extends K1 {
	private int CollageCode;
	private String CollageName;

	public R1(int rollNo, String Name, String Branch) {
		super(rollNo, Name, Branch);
	}

	public void Task2() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Collage Code:");
		CollageCode = sc.nextInt();
		System.out.println("Enter Collage Name:");
		CollageName = sc.next();
		System.out.println();
		System.out.println("******************");
		System.out.println("Collage Code is:" + CollageCode);
		System.out.println("Collage Name is:" + CollageName);

	}

}

public class Inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		R1 obj1 = new R1(0, null, null);
		obj1.Task1();
		obj1.Task2();

	}

}
