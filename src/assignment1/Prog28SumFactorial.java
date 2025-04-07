package assignment1;

import java.util.Scanner;

public class Prog28SumFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		
		int fact=factorial(num);
		int sum =sumOfDigit(fact);
		
		
		System.out.println("Factorial of "+num+" is:"+fact);
		System.out.println("Sum of digit of "+num+"! is:"+sum);
		
		

	}
	
	public static int factorial(int n) {
		int fact =1;
		for(int i=2;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	
	public static int sumOfDigit(int num) {
		
		int sum = 0;
        while (num > 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
	}

}
