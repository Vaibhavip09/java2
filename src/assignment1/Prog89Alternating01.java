package assignment1;

import java.util.Scanner;

public class Prog89Alternating01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	               
	                if ((i + j) % 2 == 0)
	                    System.out.print("0");
	                else
	                    System.out.print("1");
	            }
	            System.out.println();
	        }
		
	}

}
