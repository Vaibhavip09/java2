package assignment1;

import java.util.Scanner;

public class Prog78DiagonalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of rows:");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j<=i) {
				System.out.print("1 ");
				}else {
					System.out.print("0 ");	
				}
			}
			System.out.println();
		}
		
	}

}
