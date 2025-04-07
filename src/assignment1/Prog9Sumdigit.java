package assignment1;

import java.util.Scanner;

public class Prog9Sumdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numbers:");
		num=sc.nextInt();
		
		int f= num%10;
		int s= (num/10)%10;
		int t= num/100;
		
		int sum = f+s+t;
		
		System.out.println("Sum of digits is:"+sum);
		
	}

}
