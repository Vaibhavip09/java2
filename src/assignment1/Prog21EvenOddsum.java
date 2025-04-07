package assignment1;

import java.util.Scanner;

public class Prog21EvenOddsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower Range:");
		int lower = sc.nextInt();
		System.out.println("Enter the Upper Range:");
		int upper = sc.nextInt();
		
		int sum =SumOfEven(lower,upper);
		System.out.println("Sum of prime number Between "+lower+" and "+upper+" :"+sum);
		sc.close();	
	}
	
	
	
	public static int SumOfEven(int start,int end) {
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				sum +=i;
			}
		}
		return sum;
	}

}
