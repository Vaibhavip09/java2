package assignment1;

import java.util.Scanner;

public class Prog4Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int reminder,OriginalNumber;
		int result=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		number = sc.nextInt();
		
		
	   OriginalNumber = number;
		
	   while(OriginalNumber!=0)
	   {
		reminder = OriginalNumber%10;
		 result += reminder * reminder * reminder;
		OriginalNumber /= 10;
	   }
	if(result==number) {
		System.out.println("Number is Armstrong");
	}else {
		System.out.println("Number is NOT Armstrong");
	}
		
		
	}

}
