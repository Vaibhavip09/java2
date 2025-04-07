package assignment1;

import java.util.Scanner;

public class Prog97Pyarmid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	          
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		
		
	}

}
