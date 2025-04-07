package assignment1;

import java.util.Scanner;

public class Prog65SumOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string with numbers: ");
	        String input = sc.nextLine();

	        int sum = 0, num = 0;

	        for (char ch : input.toCharArray()) {
	            if (Character.isDigit(ch)) {
	                num = num * 10 + (ch - '0'); 
	            } else {
	                sum += num; 
	                num = 0;    
	            }
	        }

	        sum += num; 

	        System.out.println("Sum of numbers in the string: " + sum);
	}

}
