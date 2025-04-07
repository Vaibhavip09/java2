package assignment1;

import java.util.Scanner;

public class Prog88PyramidNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows:");
		int n=sc.nextInt();
		
		  for (int i = 1; i <= n; i++) {
	           
	            for (int s = n - i; s > 0; s--) {
	                System.out.print(" ");
	            }

	           
	            int num = i;
	            for (int j = 1; j <= i; j++) {
	                System.out.print(num++ +" ");
	            }

	            // Print decreasing numbers
	            num = num - 2;
	            for (int j = 1; j < i; j++) {
	                System.out.print(num-- +" ");
	            }

	            System.out.println();
	        }
		
	}

}
