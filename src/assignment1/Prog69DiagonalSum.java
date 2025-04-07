package assignment1;

import java.util.Scanner;

public class Prog69DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		int m1[][] = new int[3][3];
		int sum =0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print("Enter Matrix1 numbers:");
			m1[i][j]=sc.nextInt();	
				
			}
			System.out.println();
		}
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print(m1[i][j]+" ");		
			}
			System.out.println();
			}
		
		

		System.out.println();
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
			if(i==j) 
			sum= sum+m1[i][j];			
			System.out.println();
			}			
			}	
		
		System.out.println("sum of diagnols is:"+sum);
		
		
		
	}

}
