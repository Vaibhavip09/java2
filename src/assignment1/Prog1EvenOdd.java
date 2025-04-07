package assignment1;

import java.util.Scanner;

public class Prog1EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	a = sc.nextInt();
	
	if(a%2 == 0) {
		System.out.println("Number is Even");
	}else {
		System.out.println("Number is Odd");
	}
		
		
		
		
	}

}
