package assignment1;

import java.util.Scanner;

public class Prog62MatrixFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        System.out.print("Enter number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];

	        int a = 0, b = 1;

	        System.out.println("\nFibonacci Matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = a;
	                System.out.print(matrix[i][j] + "\t");

	                int next = a + b;
	                a = b;
	                b = next;
	            }
	            System.out.println();
	        }
		
		
	}

}
