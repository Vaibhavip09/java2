package assignment1;

import java.util.Scanner;

public class Prog15ReverseStrr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ;
		String revrseStr ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		str = sc.next();
		int strLength = str.length();
		
		for(int i = strLength - 1; i >= 0; --i) {
			revrseStr=revrseStr+str.charAt(i);
		}
		System.out.println("Revrse String is:"+revrseStr);
		
	}

}
