package assignment1;

import java.util.Scanner;

public class Prog10GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n1:");
		n1 = sc.nextInt();
		System.out.println("Enter the value of n2:");
		n2=sc.nextInt();
		
		int gcd=1;
		
		for(int i=1;i<=n1 && i<=n2;++i) {
			if(n1%i==0 && n2%i==0) {
				gcd =i;
			}
		}
		System.out.println("GCD of "+n1+" and "+n2+" is:"+gcd);
	}

}
