package assignment1;

import java.util.Scanner;

public class Prog13SortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=5;i++) {
			System.out.print("Enter Array elements:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array:");
		for(int i=0;i<=5;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				 if (arr[j] > arr[j + 1]) {
					 int temp=arr[j];
					 arr[j]= arr[j+1];
					 arr[j+1]=temp;
				 }
				
			}
		}
		System.out.println("Sorted Array:");
		for(int num:arr) {
			System.out.println(num+" ");
		}
		
	}

}
