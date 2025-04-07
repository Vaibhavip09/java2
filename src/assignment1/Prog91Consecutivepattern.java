package assignment1;

import java.util.Scanner;

public class Prog91Consecutivepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows:");
		int row = sc.nextInt();
		
		System.out.println("Enter the cols:");
		int cols = sc.nextInt();
		int num =1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				
			System.out.print(num+" ");
			num++;
			}
			System.out.println();	
		}
		
	}

}
