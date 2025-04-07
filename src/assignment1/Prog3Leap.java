package assignment1;

import java.util.Scanner;

public class Prog3Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Year;
		boolean Leap=false;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year:");
		Year = sc.nextInt();
		
		if(Year%4==0) {
			if(Year%100==0) {
				if(Year%400==0) {
				Leap=true;	
				}else {
				Leap=false;	
				}
			}
			else
				Leap = true;
		}else
			Leap = false;
		
		
		
		if(Leap) {
			System.out.println(Year+" is Leap Year");
		}else {
			System.out.println(Year+" is NOT Leap Year");
		}
		
	}

}
