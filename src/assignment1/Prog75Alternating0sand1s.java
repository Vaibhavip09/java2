package assignment1;

import java.util.Scanner;

public class Prog75Alternating0sand1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Rows:");
		int row=sc.nextInt();
		
		System.out.print("Enter the Number of Colums:");
		int cols=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				if((i+j)%2 == 0) {
				System.out.print(1+" ");	
				}else {
					System.out.print(0+" ");
				}
			//	System.out.println();
			}
			System.out.println();
		}
		
		
	}

}
