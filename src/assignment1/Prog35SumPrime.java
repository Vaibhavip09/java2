package assignment1;

import java.util.Scanner;

public class Prog35SumPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the lower range: ");
	        int lower = sc.nextInt();
	        System.out.print("Enter the upper range: ");
	        int upper = sc.nextInt();

	        int sum = 0;

	        for (int i = lower; i <= upper; i++) {
	            if (isPrime(i)) {
	                sum += i; 
	            }
	        }

	        System.out.println("Sum of prime numbers between " + lower + " and " + upper + " is: " + sum);

	       
	    }
		
	public static boolean isPrime(int num) {
        if (num < 2) return false; 

        for (int i = 2; i * i <= num; i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
		
	

}
