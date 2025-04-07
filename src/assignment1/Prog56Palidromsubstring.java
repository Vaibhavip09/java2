package assignment1;

import java.util.Scanner;

public class Prog56Palidromsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int count = 0;

	        System.out.print("Palindromic substrings:" );

	        for (int i = 0; i < str.length(); i++) {
	            for (int j = i; j < str.length(); j++) {
	                String sub = str.substring(i, j + 1);
	                if (isPalindrome(sub)) {
	                    System.out.println(sub);
	                    count++;
	                }
	            }
	        }

	      
	    }

	    
	    static boolean isPalindrome(String s) {
	        int left = 0, right = s.length() - 1;

	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right))
	                return false;
	            left++;
	            right--;
	        }

	        return true;
		
		
	}

}
