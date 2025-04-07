package assignment1;

import java.util.Scanner;

public class Prog41Occurancedigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int number = sc.nextInt();
		
		System.out.println("Enter the digit to count:");
		int digit=sc.nextInt();
		
		int count = findOccurance(number,digit);
		System.out.println("Digit " + digit + " occurs " + count + " times in " + number);
		
	}
	
	public static int findOccurance(int number,int digit) {
		int count =0;
		while(number>0) {
			int lastD=number%10;
			if(lastD == digit) {
				count++;
			}
			number /= 10;
		}
		return count;
	}

}
