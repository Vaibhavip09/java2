package assignment1;

import java.util.Scanner;

public class Prog37Perfectsqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isPerfectSquare(num)) {
	            System.out.println(num + " is a perfect square.");
	        } else {
	            System.out.println(num + " is NOT a perfect square.");
	        }
	}
	
	 public static boolean isPerfectSquare(int num) {
		 
		 int i = 1;
		 while(i*i<=num) {
			 if(i*i==num) {
				 return true;
			 }
			 i++;
		 }
		 return false;
	 }

}
