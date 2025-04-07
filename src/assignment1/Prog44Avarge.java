package assignment1;

import java.util.Scanner;

public class Prog44Avarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		 int[] a = new int[n];
	        double avg =0;
	        float sum =0;
	        System.out.println("Enter the Numbers:");
	        for(int i=0;i<n;i++) {
	        
	        	a[i] = sc.nextInt();
	        	sum += a[i];
	        	 avg =sum/n;

	        }
	       
	       System.out.println("Avg of number is:"+avg);	}

}
