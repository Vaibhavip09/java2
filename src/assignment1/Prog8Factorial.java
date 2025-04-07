package assignment1;

import java.util.Scanner;

public class Prog8Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Factorial Number:");
		n = sc.nextInt();
		
		long fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact *= i;
			
		}
	System.out.printf("fact of %d = %d",n,fact);
	}

}
