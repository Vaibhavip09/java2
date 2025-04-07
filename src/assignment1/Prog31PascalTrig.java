package assignment1;

import java.util.Scanner;

public class Prog31PascalTrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows:");
		int row = sc.nextInt();
		
		int[][] T = new int[row][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				if(j==0||j==i) {
					T[i][j]=1;
					
				}else {
					T[i][j]=T[i - 1][j - 1] + T[i - 1][j];
				}
				System.out.print(T[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
