package assignment1;

import java.util.Scanner;

public class Prog5Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of N:");
      n = sc.nextInt();
      int first =0;
      int second =1;
      
      for(int i=0;i<=n;i++) {
    	  System.out.print(first+", ");
   
      int next = first+second;
      first=second;
      second= next;
	}
	}
}
