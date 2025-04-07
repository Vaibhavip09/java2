package assignment1;

import java.util.Scanner;

public class Prog53sumofseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of N:");
		int n =sc.nextInt();
		
		double sum=0;
		
		for(int i=1;i<=n;i++) {
		sum += 1.0/i;
		
		}
        System.out.printf("Sum of the series 1 + 1/2 + ... + 1/%d is: %.4f\n", n, sum);
	}

}
