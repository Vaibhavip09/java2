package javacore2;

import java.util.Scanner;

public class Array2D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sum=0;
		int i,j;
		int m1[][] = new int[3][3];
		int m2[][] = new int[3][3];
		int m3[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Matrix1 Numbers:");
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
			
			m1[i][j]=sc.nextInt();
			}
			
			System.out.println();
		}
		
		System.out.println("First Matrix:");
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
			System.out.print(m1[i][j]+" ");			
			}
			System.out.println();
			}
		
		
		System.out.println();
		
		System.out.print("Enter the Matrix2 Numbers:");
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {			
			
			m2[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Second Matrix:");
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {					
			System.out.print(m2[i][j]+" ");				
			}
			System.out.println();
			}
		
		System.out.println();
		System.out.println("Sum of matrix is:");
		for(i=0;i<=2;i++) {		
			for(j=0;j<=2;j++) {
			m3[i][j]=m1[i][j]+m2[i][j];	
			System.out.print(m3[i][j]+" ");	
				
			}
			System.out.println();
			}
		
		
		
		
	}

}
