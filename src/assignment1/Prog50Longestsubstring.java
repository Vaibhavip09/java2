package assignment1;

import java.util.Scanner;

public class Prog50Longestsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int maxLength = 0;
	        String longestSubstring = "";

	        for (int i = 0; i < str.length(); i++) {
	            String current = "";
	            for (int j = i; j < str.length(); j++) {
	                char ch = str.charAt(j);
	                if (current.indexOf(ch) == -1) {
	                    current += ch;
	                } else {
	                    break;
	                }
	            }
	            if (current.length() > maxLength) {
	                maxLength = current.length();
	                longestSubstring = current;
	            }
	        }

	        System.out.println("Longest substring without repeating characters: " + longestSubstring);
	        
		
		
	}

}
