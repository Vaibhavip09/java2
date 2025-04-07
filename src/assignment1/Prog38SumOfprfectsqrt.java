package assignment1;

import java.util.Scanner;

public class Prog38SumOfprfectsqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sum = sumOfSquares(num);
	        System.out.println("Sum of squares of digits: " + sum);

	        sc.close();
	    }

	    public static int sumOfSquares(int num) {
	        int sum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10; 
	            sum += digit * digit; 
	            num /= 10;
	        }

	        return sum;
	}

}
