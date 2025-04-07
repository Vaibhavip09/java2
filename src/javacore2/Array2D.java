package javacore2;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[3][3];
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements:");
	
      for(int i=0;i<=2;i++) {
    	  for(int j=0;j<=2;j++) {
    		 a[i][j]=sc.nextInt();
    	  }
    	  System.out.println();
      }
	
      for(int i=0;i<=2;i++) {
    	  for(int j=0;j<=2;j++) {
    		System.out.print(a[i][j]+" ");
    	  }
    	  System.out.println();
      }
      
      for(int i=0;i<=2;i++) {
    	  for(int j=0;j<=2;j++) {
    	  sum += a[i][j];
    	  }
      }
      System.out.println();
      System.out.println("Sum of elements is: "+sum);
     
	}	
}
