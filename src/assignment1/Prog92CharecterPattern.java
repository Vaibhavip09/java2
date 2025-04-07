package assignment1;

import java.util.Scanner;

public class Prog92CharecterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows:");
		int row= sc.nextInt();
		
		char ch ='A';
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
		
	}

}
