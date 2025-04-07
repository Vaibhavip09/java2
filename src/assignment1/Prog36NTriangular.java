package assignment1;

import java.util.Scanner;

public class Prog36NTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of N:");
		int n=s.nextInt();
		
		int triangularNumber = n * (n + 1) / 2;
		

        System.out.println("The " + n + "-th triangular number is: " + triangularNumber);

	}

}
