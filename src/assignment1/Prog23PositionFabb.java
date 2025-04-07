package assignment1;

import java.util.Scanner;

public class Prog23PositionFabb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Position:");
		int num=sc.nextInt();
		
		System.out.println("Fabonacci number at Position "+num+" is: "+fibonacci(num));
		
	}
	
	public static int fibonacci(int num) {
		if(num<=0)
			return 0;
		if(num==1)
			return 1;
		
		int a=0;
		int b=1, result=0;
		for(int i=2;i<=num;i++) {
			result = a+b;
			a=b;
			b=result;
		}
		
		return result;
	}

}
