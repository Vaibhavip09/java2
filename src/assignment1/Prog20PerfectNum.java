package assignment1;

import java.util.Scanner;

public class Prog20PerfectNum {

	
		// TODO Auto-generated method stub
		
     public static boolean isPerfect(int num) {
			
			if(num<=1)
				return false;
			int sum=0;
			for(int i=1;i<=num/2;i++) {
				if(num%i==0)
					sum +=i;
			}
		
		return sum==num;
	

}
     public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=sc.nextInt();
		
		if(isPerfect(number)) {
			System.out.println("Number is perfect Number");
		}else {
			System.out.println("Number is not perfect Number");
		}
	}

}	
		
