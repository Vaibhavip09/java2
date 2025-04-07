package assignment1;

import java.util.Scanner;

public class Prog14SumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[5];
		int sum=0;
	Scanner sc = new Scanner(System.in)	;
		
		for(int i=0;i<=4;i++) {
			System.out.print("Enter theArray Elements:");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<=4;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<=4;i++) {
			sum +=arr[i];
		}
		System.out.println("Sum of Array Elements is:"+sum);
		
	}

}
