package assignment1;

import java.util.Scanner;

public class prog6Palindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str;
		String revrseStr ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		str = sc.next();
		int i;
		int strLength = str.length();
		
		for( i = strLength - 1; i >= 0; --i) {
			revrseStr = revrseStr+str.charAt(i);
			
		}
		
		
		if (str.equals(revrseStr)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome.");
        }
		
		
		
	}

}
