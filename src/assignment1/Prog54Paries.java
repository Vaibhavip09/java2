package assignment1;

import java.util.Scanner;

public class Prog54Paries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
         System.out.println("Enter the target sum:");
         int target= sc.nextInt();
         
         System.out.println("Pairs with sum " + target + " are:");
 
         
         for(int i=0;i<n;i++) {
          for(int j=i+1;j<n;j++) {
        	  if(arr[i]+arr[j]==target) {
                  System.out.println(arr[i] + " + " + arr[j] + " = " + target);
        	  }
          }
         }
	}

}
