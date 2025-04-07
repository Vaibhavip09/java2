package assignment1;

import java.util.Scanner;

public class Prog40SumSingleUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10;
	                num = num / 10;
	            }
	            num = sum;
	        }

	        System.out.println("Final single digit sum: " + num);
	}

}
