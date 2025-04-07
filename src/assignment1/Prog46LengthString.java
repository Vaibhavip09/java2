package assignment1;

import java.util.Scanner;

public class Prog46LengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		
		
		char[] ch = str.toCharArray();
		int count=0;
		
		for(char c : ch) {
			count++;
		}
		System.out.println("Length of String is:"+count);
		
	}

}
