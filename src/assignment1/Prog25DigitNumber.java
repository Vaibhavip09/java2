package assignment1;

import java.util.Scanner;

public class Prog25DigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		
		int DigitCount = countDigit(n);
		System.out.println("Number of Digit "+n+" is: "+DigitCount);
		
		
	}
	
	public static int countDigit(int n) {
		
		if(n==0)
			return 1;
		
		int count=0;
		while(n!=0) {
			n /= 10;
			count++;
		}
		return count;
	}

}
