package assignment1;

import java.util.Scanner;

public class Prog2Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		num = sc.nextInt();
		int flag = 0;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag = 1;
				break;
			}
		}
		if(flag ==1) {
			System.out.println("Number is not prime Number");
		}else {
			System.out.println("Number is prime Number");
		}
	}

}
