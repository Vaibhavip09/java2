package assignment1;

import java.util.Scanner;

public class Prog24lessprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pime Number Less than:");
		int n = sc.nextInt();
		
		for(int i=2;i<n;i++) {
	       if(isPrime(i)) {
		System.out.print(i+" ");
		
		
	}
	}
		
	}
	
	public static boolean isPrime(int n) {
		
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}

}
