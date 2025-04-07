package assignment1;

import java.util.Scanner;

public class Prog80Randompattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = new int[2][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				m[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
