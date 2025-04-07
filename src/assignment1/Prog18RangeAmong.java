package assignment1;

import java.util.Scanner;

public class Prog18RangeAmong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Range:");
		int lower=sc.nextInt();
		System.out.println("Enter Higher Range:");
		int higher=sc.nextInt();
		
		System.out.println("Armstrong numbers between " + lower + " and " + higher + ":");
		for(int num=lower;num<=higher;num++) {
			if(isArmstrong(num)) {
				 System.out.print(num + " ");
			}
		}
		
	}
    public static boolean isArmstrong(int num) {
    	 int sum = 0, temp = num, digits= String.valueOf(num).length();

         while (temp > 0) {
             int digit = temp % 10;
             sum += digit*digit*digit;
             //sum +=Math.pow(digits, digit);
             temp /= 10;
    }
         return sum==num;
    }

}
