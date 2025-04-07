package assignment1;

import java.util.Scanner;

public class Prog99DiagonalLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();
	        
	        for (int i = 0; i < n; i++) {
	            char ch = (char) ('A' + i);
	            System.out.print(ch);
	            
	            if (i > 0) {
	               
	                for (int j = 1; j <= (2 * i - 1); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print(ch);
	            }
	            System.out.println();
	        }
	}

}
