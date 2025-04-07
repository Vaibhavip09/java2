package assignment1;

import java.util.Scanner;

public class Prog59OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n Number:");
		int n= sc.nextInt();
		
		int sum=0;
		int count=0;
		int number=1;
		 while (count < n) {
	            sum += number;
	            number += 2; // next odd number
	            count++;
	        }

	        System.out.println("Sum of first " + n + " odd numbers is: " + sum);
	}

}
