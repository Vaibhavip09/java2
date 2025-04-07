package assignment1;

import java.util.Scanner;

public class Prog94Alternatingcharpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows:");
		int row= sc.nextInt();
		
		System.out.println("Enter cols:");
		int cols= sc.nextInt();
		
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				if((i+j)%2==0) {
				System.out.print("A");
				}else {
					System.out.print("B");	
				}
			}
			System.out.println();
		}
		
		
	}

}
