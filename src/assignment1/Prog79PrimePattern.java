package assignment1;

import java.util.Scanner;

public class Prog79PrimePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int row=sc.nextInt();
		int count=0;
		int num=2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;) {
				if(isPrime(num)) {
					System.out.print(num+" ");
					j++;
				}
				num++;
				
			}
			System.out.println();
			
			}
	}
	
	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		for(int i=2;i*i<n;i++) {
			if(n%i==0)
				return false;
			
		}
		return true;
	}

}
