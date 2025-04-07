package assignment1;

import java.util.Scanner;

public class Prog19RangePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lower range:");
		int lower = sc.nextInt();
		System.out.println("Enter the Upper range:");
		int upper = sc.nextInt();
		
		System.out.println("Prime Number Between "+lower+" and "+upper+" : ");
		for(int num=lower;num<=upper;num++) {
			if(isprime(num)) {
				System.out.println(num+" ");
			}
		}	
	}
	
	public static boolean isprime(int num) {
		
		
		if(num<2)
			return false;
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
