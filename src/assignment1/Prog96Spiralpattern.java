package assignment1;

import java.util.Scanner;

public class Prog96Spiralpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rows");
		int n= sc.nextInt();
		
		System.out.println("Enter the Colums:");
		int c = sc.nextInt();
		
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<c;j++) {
			System.out.print(num+" ");	
				num++;
			}
			System.out.println();
			}

	}

}
