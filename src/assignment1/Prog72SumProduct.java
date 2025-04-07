package assignment1;

import java.util.Scanner;

public class Prog72SumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the second Number:");
		int b=sc.nextInt();
		
		int product = a*b;
		int sum=0;
		int temp=product;
		
		while(temp>0) {
			sum += temp%10;
			temp /= 10;
		}
		 System.out.println("Product: " + product);
		System.out.println("Sum of product digit is:"+sum);
	}

}
