package assignment1;

import java.util.Scanner;

public class Prog76CountSstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String input = sc.nextLine();
		
		System.out.println("Enter the Word to count:");
		String word = sc.nextLine();
		
		Scanner Sstr = new Scanner(input);
		int count =0;
		
		while(Sstr.hasNext()) {
			String w = Sstr.next();
			if(w.equals(word)) {
				count++;
				
			}
		}
		  System.out.println("The word '" + word + "' appears " + count + " times.");
	}

}
