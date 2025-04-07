package assignment1;

import java.util.Scanner;

public class Prog39SqrtMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int i,j;
	int a[][] = new int[3][3];
	Scanner s = new Scanner(System.in);
	
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++) {
			System.out.print("Enter the elements:");
			a[i][j]=s.nextInt();
		}
		System.out.println();
	}
		
	
	
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++) {
		 System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
	
	}

}
