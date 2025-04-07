package assignment1;

import java.util.Scanner;

public class Prog33PowerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		int m,result = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		n = sc.nextInt();
		System.out.println("Enter the Power of Number:");
		m = sc.nextInt();
		for(int i=1;i<=m;i++) {
		 result *= n ;
		}
	
		
		System.out.println("Power of "+n+" is:"+result);
		
	}

}
