package assignment1;

import java.util.Scanner;

public class Prog26Narcissistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number = sc.nextInt();
		
		int OriginalNumber = number;
		int result=0;
		while(OriginalNumber != 0) {
			int digit = OriginalNumber%10;
			result += digit*digit*digit;
			OriginalNumber /= 10;
			
		}
		if(result==number) {
			System.out.println("Number is Narcissistic Number");
		}else {
			System.out.println("Number is Not Narcissistic Number");
		}
		
		
		
		
		
		
		
		
	}

}
