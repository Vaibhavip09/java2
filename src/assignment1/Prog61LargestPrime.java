package assignment1;

import java.util.Scanner;

public class Prog61LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        long num = sc.nextLong();

	        long largest = -1;

	        // Divide out all 2s
	        while (num % 2 == 0) {
	            largest = 2;
	            num /= 2;
	        }

	        // Now num is odd, check odd factors
	        for (long i = 3; i * i <= num; i += 2) {
	            while (num % i == 0) {
	                largest = i;
	                num /= i;
	            }
	        }

	        // If remaining num is a prime number > 2
	        if (num > 2) {
	            largest = num;
	        }

	        System.out.println("Largest prime factor: " + largest);
	}

}
