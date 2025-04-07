package javacore2;

import java.util.Scanner;

public class Array2D5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
	
		Scanner sc = new Scanner(System.in);
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print("Enter the Matrix elements :");
				m1[i][j]= sc.nextInt();
			}
			System.out.println();

		}
		System.out.println("Matrix is:");
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				
			System.out.print(m1[i][j]+" ");			
			}
			System.out.println();
			}
		System.out.println();
		
		
		
System.out.println("Square of Elements is:");
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
			int Result = m1[i][j]*m1[i][j];	
			System.out.print(Result+" ");			
			}
			System.out.println();
			}
		System.out.println();
		
		
		
		
	}

}
