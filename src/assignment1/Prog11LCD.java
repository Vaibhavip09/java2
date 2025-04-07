package assignment1;
import java.io.*;
import java.util.Scanner;

public class Prog11LCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int l1,l2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of l1:");
		l1 = sc.nextInt();
		System.out.println("Enter the value of l2:");
		l2=sc.nextInt();
		
		int ans=(l1>l2)?l1:l2;
		
	while(true) {
		if(ans % l1==0 && ans % l2==0) 
			break;
		ans++ ;
		
	}
	System.out.println("LCD of l1 and l2 is:"+ans);
		
	}

}
