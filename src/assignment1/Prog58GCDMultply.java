package assignment1;

import java.util.Scanner;

public class Prog58GCDMultply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n = sc.nextInt();
		int a,b;
		int[] arr = new int[n];
		System.out.println("Enter the Number");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int gcd =arr[0];
		
		for(int i=1;i<n;i++) {
			 a=gcd;
			 b=arr[i];
		
		
		while(b != 0) {
			int temp = b;
			b=a%b;
			a=temp;
		}
		
		gcd=a;	
		}
		System.out.println("GCD of the entered numbers is: "+gcd);
	}

}
