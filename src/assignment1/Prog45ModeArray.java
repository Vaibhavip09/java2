package assignment1;

import java.util.Scanner;

public class Prog45ModeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements:");
		int n =sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter the Elements of Array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}	
			int mode =arr[0];
			int max=0;
			
			for(int k=0;k<n;k++) {
			int count =0;
			
			for(int j=0;j<n;j++) {
				if(arr[j]==arr[k]) {
					count++;
					
				}
			}
			
			if(count>max) {
				max = count;
			mode = arr[k];	
			}
			}
			 System.out.println("Mode of the array is: " + mode);
	}

}
