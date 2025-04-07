package assignment1;

import java.util.Scanner;

public class Prog73Palidromerange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower Range:");
		int lower=sc.nextInt();
		System.out.println("Enter the Upper Range:");
		int upper=sc.nextInt();
		
		   System.out.println("Palindrome Numbers Between " + lower + " and " + upper + ":");
	        for (int i = lower; i <= upper; i++) {
	            if (isPalindrome(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static boolean isPalindrome(int num) {
	        int original = num;
	        int reverse = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }

	        return original == reverse;
	    }
	}
