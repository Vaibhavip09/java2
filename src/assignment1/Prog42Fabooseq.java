package assignment1;

import java.util.Scanner;

public class Prog42Fabooseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the term you want:");
		int n = sc.nextInt();
		
		System.out.println("Fabonacci Squence:");
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
		
	}
	
	public static int fib(int n) {
		
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		int a=0;
		int b=1, result=0;
		for(int i=2;i<=n;i++) {
			result = a+b;
			a=b;
			b=result;
		}
		
		return result;
		
	}

}
