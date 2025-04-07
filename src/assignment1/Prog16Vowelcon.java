package assignment1;

import java.util.Scanner;

public class Prog16Vowelcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		str = sc.nextLine().toLowerCase();
		
		int vowels=0;
		int consonants=0;
		
		for(char ch:str.toCharArray())	{
			if(ch >= 'a' && ch<='z') {
				if(ch=='i'|| ch=='a'||ch=='o'||ch=='e'||ch=='u') {
					vowels++;
				}else {
					consonants++;
				}
			}
		}
		
		 System.out.println("Number of Vowels: " + vowels);
	        System.out.println("Number of Consonants: " + consonants);
		
		
	}

}
