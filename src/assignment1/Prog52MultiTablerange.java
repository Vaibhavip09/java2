package assignment1;

import java.util.Scanner;

public class Prog52MultiTablerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Lower range:");
		int start = sc.nextInt();
		System.out.println("Enter the Upper range:");
		int end = sc.nextInt();
		
		 System.out.print("Enter how far you want to multiply: ");
	        int limit = sc.nextInt();

	        System.out.println("\nMultiplication Table from " + start + " to " + end + ":");

	        for (int i = start; i <= end; i++) {
	            System.out.println("\nTable of " + i + ":");
	            for (int j = 1; j <= limit; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	        }
	}

}
