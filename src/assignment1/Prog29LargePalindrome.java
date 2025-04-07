package assignment1;

import java.util.Scanner;

public class Prog29LargePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String longest = findLargestPalindrome(str);
	        System.out.println("Largest Palindrome: " + longest);

	        sc.close();
	    }

	    public static boolean isPalindrome(String s) {
	        int start = 0, end = s.length() - 1;
	        while (start < end) {
	            if (s.charAt(start) != s.charAt(end))
	                return false;
	            start++;
	            end--;
	        }
	        return true;
	    }

	    public static String findLargestPalindrome(String str) {
	        String longest = "";
	        int n = str.length();

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j <= n; j++) {
	                String sub = str.substring(i, j);
	                if (isPalindrome(sub) && sub.length() > longest.length()) {
	                    longest = sub;
	                }
	            }
	        }
	        return longest;
	}

}
