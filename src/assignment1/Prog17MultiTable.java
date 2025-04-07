package assignment1;

import java.util.Scanner;

public class Prog17MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,j;
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			
				System.out.println(num + " × " + i + " = " + (num * i));
			}
		
	}

}
