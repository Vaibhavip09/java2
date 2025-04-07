package javacore2;

import java.util.Scanner;

public class Array2D6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1[][]= new int[3][3];
		int m2[][]= new int[4][];
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		m2[0]=new int[4];
		m2[1]=new int[5];
		m2[2]=new int[3];
		m2[3]=new int[2];
		
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
			System.out.print("Enter the Matrix1 Numbers:");
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
		
		
		for(int k=0;k<m2.length;k++) {
			for(int l=0;l<m2[k].length;l++) {			
			System.out.print("Enter the jagged Array Numbers:");
			m2[k][l]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Second Matrix:");
		for(int k=0;k<m2.length;k++) {
			for(int l=0;l<m2[k].length;l++) {					
			System.out.print(m2[k][l]+" ");				
			}
			System.out.println();
			}
		
		System.out.println();
		
			
		
		
		for( i=0;i<m1.length;i++) {
			for(j=0;j<m1[i].length;j++) {
				int com =m1[i][j];
				for(int k=0;k<m2.length;k++) {
					for(int l=0;l<m2[k].length;l++) {
						if(com == m2[k][l]) {
							System.out.print(com+" ");
							
						}
					}
				}
			}
			
		}
		
	}

}
