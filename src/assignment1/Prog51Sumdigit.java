package assignment1;

import java.util.Scanner;

public class Prog51Sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		while(n>=10) {
			int sum = 0;
			while(n>0) {
			sum += n%10;
			n /= 10;
			}
			n=sum;
		}
		System.out.println("Sum of Digit in single unit is:"+n);
		
	}

}
