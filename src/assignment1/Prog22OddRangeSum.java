package assignment1;

import java.util.Scanner;

public class Prog22OddRangeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower Range:");
		int lower=sc.nextInt();
		System.out.println("Enter the Upper Range:");
		int upper=sc.nextInt();
		
		int sum = SumOfOdd(lower,upper);
		System.out.println("Sum of Odd Number Between "+lower+" and "+upper+" :"+sum);
		
		
	}
	public static int SumOfOdd(int start,int end) {
		int sum=0;
		
		for(int i=start;i<=end;i++) {
			if(i%2!=0) {
				sum +=i;
			}
		}
		return sum;
	}


}
