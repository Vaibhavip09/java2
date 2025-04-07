package assignment1;

import java.util.Scanner;

public class Prog98PyrmidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();
	        
	        char ch = 'A';

	        for (int i = 1; i <= n; i++) {
	            
	            for (int s = 1; s <= n - i; s++) {
	                System.out.print(" ");
	            }
	           
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print(ch);
	                ch++;
	            }
	            System.out.println();
	        }
	}

}
