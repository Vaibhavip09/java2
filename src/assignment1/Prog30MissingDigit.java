package assignment1;

import java.util.Scanner;

public class Prog30MissingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start = sc.nextInt();
		System.out.println("Enter the Last number:");
		int last = sc.nextInt();
		
		System.out.println("Enter the Sequence of number:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the sequnce (with missing numbers):");
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		missingNumbers(arr,start,last);
		
	}
	public static void missingNumbers(int arr[],int start,int last) {
		boolean[] present= new boolean[last+1];
		for(int num:arr) {
			
			if(num>=start && num<=last) 
				present[num]=true;
			
		}
		
		System.out.print("Missing numbers: ");
		for(int i=start;i<=last;i++) {
			if(!present[i]) {
				System.out.println(i+" ");
			}
		}
		System.out.println();
	}

}
