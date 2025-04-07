package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog32Midiumarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the sequnce of array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Median: "+median(arr));
	}
	
	public static double median(int[] arr) {
		Arrays.sort(arr);
		
		int n=arr.length;
		if(n%2==1) {
			return arr[n/2];
		}else {
			return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
		}
	}

}
