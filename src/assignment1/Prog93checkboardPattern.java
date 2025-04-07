package assignment1;

import java.util.Scanner;

public class Prog93checkboardPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int n= sc.nextInt();
		
		System.out.println("Enter the Colums:");
		int c = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<c;j++) {
				
				if((i+j)%2==0) {
				System.out.print("X");
				}else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}

}
