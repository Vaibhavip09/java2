package assignment1;

import java.util.Scanner;

public class Prog48SumOfprimefact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		int sum = 0;
		int n = num;
		
		for(int i=2;i<n;i++) {
		while(num%i==0) {
			sum += i;
			num /= i;
		}
		
			
		}
		
		System.out.println("Sum of prime factors of " + n + " is: " + sum);
	}

}
