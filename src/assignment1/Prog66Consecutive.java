package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Prog66Consecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the array size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        Arrays.sort(arr); 

	        int maxLen = 1, currentLen = 1;

	        for (int i = 1; i < n; i++) {
	            if (arr[i] == arr[i - 1] + 1) { 
	                currentLen++; 
	            } else if (arr[i] != arr[i - 1]) { 
	                maxLen = Math.max(maxLen, currentLen);
	                currentLen = 1; 
	            }
	        }

	        maxLen = Math.max(maxLen, currentLen);
	        System.out.println("Longest Consecutive Sequence Length: " + maxLen);
	}

}
